### Compile
`   $ jar -d --file lib/guava-30.1-jre.jar `
`   $ javac --patch-module com.kren.hello.world=./src/main/java --module-path lib -d ./target/classes $(find -name '*.java') `

### Run
`   $ java --module-path "target/classes;lib" --module com.kren.hello.world/com.kren.hello.world.Main `

### Jar
`   $ jar --create --file ./target/hello-world.jar --main-class=com.kren.hello.world.Main -C target/classes/ . `
`   $ jar -d --file target/hello-world.jar `

`   $ java --module-path "lib;target/hello-world.jar" --module com.kren.hello.world/com.kren.hello.world.Main `