### Compile
`   $ javac --class-path "./target/lib/*" -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

`   $ javac --class-path "./target/lib/spring-boot-2.3.0.RELEASE.jar;./target/lib/spring-boot-autoconfigure-2.3.0.RELEASE.jar;./target/lib/spring-web-5.2.6.RELEASE.jar;./target/lib/spring-context-5.2.6.RELEASE.jar;./target/lib/spring-core-5.2.6.RELEASE.jar" -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

### Run
`   $ java --class-path "./target/classes;./target/lib/*" com.kren.hello.world.MainApp `

`   $ java --class-path "./target/hello-world-springboot-0.0.1-SNAPSHOT.jar;./target/lib/*" com.kren.hello.world.MainApp `

### Compile tests

### Run tests