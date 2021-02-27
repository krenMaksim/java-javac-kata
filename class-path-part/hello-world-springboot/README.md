### Compile
`   $ javac --class-path "./target/lib/compile/*" -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

`   $ javac --class-path "./target/lib/compile/spring-boot-2.3.0.RELEASE.jar;./target/lib/compile/spring-boot-autoconfigure-2.3.0.RELEASE.jar;./target/lib/compile/spring-web-5.2.6.RELEASE.jar;./target/lib/compile/spring-context-5.2.6.RELEASE.jar;./target/lib/compile/spring-core-5.2.6.RELEASE.jar" -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

### Run
`   $ java --class-path "./target/classes;./target/lib/compile/*" com.kren.hello.world.MainApp `

`   $ java --class-path "./target/hello-world-springboot-0.0.1-SNAPSHOT.jar;./target/lib/compile/*" com.kren.hello.world.MainApp `

### Compile tests
`   $ javac --class-path "./target/lib/test/*;./target/lib/compile/*" -d ./target/test-classes/ $(find -P ./src/test/ -name '*.java') `

### Run tests
`   $ java --class-path "./target/classes;./target/test-classes;./target/lib/compile/*;./target/lib/test/*" org.junit.platform.console.ConsoleLauncher --scan-classpath --disable-ansi-colors `


https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher