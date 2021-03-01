### Compile
`   $ javac --patch-module com.kren.hello.world=./src/main/java -d ./target/classes $(find -name '*.java') `

Does not work, because java folder should be renamed to com.kren.hello.world <module-name>
`   $ javac --module-source-path src/main -d ./target/classes $(find -name '*.java') `

### Run
`   $ java --module-path target/classes --module com.kren.hello.world/com.kren.hello.world.Main `

### Jar
`   $ jar --create --file ./target/hello-world.jar -C target/classes/ . `

`   $ jar -d --file target/hello-world.jar `
`	$ java --describe-module com.kren.hello.world --module-path target/hello-world.jar `

`   $ java --module-path target/hello-world.jar --module com.kren.hello.world/com.kren.hello.world.Main `

`   $ jar --create --file ./target/hello-world.jar --main-class=com.kren.hello.world.Main -C target/classes/ . `

`   $ java -jar ./target/hello-world.jar `

### Some info
https://dzone.com/articles/java-9-modules-introduction-part-1
https://dzone.com/articles/java-9-modules-part-2-intellij-and-maven
https://dzone.com/articles/java-9-modules-part-3-directives



