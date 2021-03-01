








--------------------------------------------------------------------------
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
--------------------------------------------------------------------------------
### Compile
`   $ javac --class-path ./lib/* -d ./target/classes/ $(find -name '*.java') `

### Run (on Windows)
`   $ java --class-path ./target/classes;./lib/* com.kren.hello.world.Main `

### Fat jar 
`   $ cp lib/guava-30.1-jre.jar ./target/classes `
`   $ cd ./target/classes && jar xf guava-30.1-jre.jar && cd ../../`
`   $ rm ./target/classes/guava-30.1-jre.jar`
`   $ rm -r ./target/classes/META-INF`
`   $ jar --create --file ./target/hello-world-fat.jar --main-class=com.kren.hello.world.Main -C target/classes/ . `
`   $ java -jar ./target/hello-world-fat.jar `

### Jar with Class-Path https://www.baeldung.com/java-jar-manifest
`   $ jar --create --file ./target/hello-world-class-path.jar --main-class=com.kren.hello.world.Main -C target/classes/ . `

Open hello-world-class-path.jar and add to MANIFEST.FM next line
`   Class-Path: ../lib/guava-30.1-jre.jar `

### Jar
`   $ java -jar ./target/hello-world.jar ` 