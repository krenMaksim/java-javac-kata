module com.kren.hello.world {
    requires spring.boot;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;

    opens com.kren.hello.world to spring.core, spring.beans, spring.context, spring.web;
}