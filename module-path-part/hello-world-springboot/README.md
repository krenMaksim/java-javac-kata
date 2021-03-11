### Compile
`   $ javac --patch-module com.kren.hello.world=./src/main/java --module-path target/lib/compile -d ./target/classes/ $(find -P ./src/main/ -name '*.java') `

### Run
`   $ java --module-path "target/classes;target/lib/compile" --add-modules java.instrument --module com.kren.hello.world/com.kren.hello.world.MainApp `

### Choosen an approach running tests via class-path. For maven-surefire-plugin useModulePath=false

### Compile tests
`   $ javac --class-path "./target/lib/test/*;./target/lib/compile/*" -d ./target/test-classes/ $(find -P ./src/test/ -name '*.java') `

### Run tests
`   $ java --class-path "./target/classes;./target/test-classes;./target/lib/compile/*;./target/lib/test/*" org.junit.platform.console.ConsoleLauncher --scan-classpath --disable-ansi-colors `