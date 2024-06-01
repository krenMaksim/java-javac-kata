package com.example.kata.three;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class HelloRestTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private HelloRest helloRest;

    @Test
    void shouldReturnStatusOk() throws Exception {
        mockMvc.perform(get("/hello"))
               .andExpect(status().isOk());
    }

    @Test
    void hello() {
        String name = "Bob";

        String result = helloRest.hello(name);

        assertEquals("Hello Bob!", result);
    }
}
