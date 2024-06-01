module com.example.kata.three {
    requires spring.core;
    requires spring.beans;
    requires spring.context;

    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    opens com.example.kata.three to spring.core, spring.beans, spring.context;
}