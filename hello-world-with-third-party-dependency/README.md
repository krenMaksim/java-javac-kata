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