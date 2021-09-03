### Compile
`   $ javac --patch-module com.kren.hello.world=./src/main/java --module-path target/lib/compile -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

### Run
`   $ java --module-path "target/classes;target/lib/compile" --add-modules java.instrument --module com.kren.hello.world/com.kren.hello.world.MainApp `

### List of dependencies to get working http://localhost:8080/hello
````
spring-boot-2.3.0.RELEASE.jar
spring-boot-autoconfigure-2.3.0.RELEASE.jar

spring-context-5.2.6.RELEASE.jar
spring-core-5.2.6.RELEASE.jar
spring-web-5.2.6.RELEASE.jar
spring-webmvc-5.2.6.RELEASE.jar
spring-beans-5.2.6.RELEASE.jar
spring-aop-5.2.6.RELEASE.jar
spring-expression-5.2.6.RELEASE.jar
spring-jcl-5.2.6.RELEASE.jar

jakarta.annotation-api-1.3.5.jar

tomcat-embed-core-9.0.35.jar
````

### Choosen an approach running tests via class-path. For maven-surefire-plugin useModulePath=false

### Compile tests
`   $ javac --class-path "./target/lib/test/*;./target/lib/compile/*" -d ./target/test-classes/ $(find -P ./src/test/ -name '*.java') `

### Run tests
`   $ java --class-path "./target/classes;./target/test-classes;./target/lib/compile/*;./target/lib/test/*" org.junit.platform.console.ConsoleLauncher --scan-classpath --disable-ansi-colors `
