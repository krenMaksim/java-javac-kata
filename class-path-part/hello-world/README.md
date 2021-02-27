### Compile
`   $ javac -d ./target/classes $(find -name '*.java') `

`   $ javac -verbose -d ./target/classes $(find -name '*.java') `

### Run
`   $ java --class-path ./target/classes com.kren.hello.world.Main `

`   $ java -verbose:class --class-path ./target/classes com.kren.hello.world.Main `

### Jar
`   $ jar --create --file ./target/hello-world.jar -C target/classes/ . `

`   $ jar --verbose --create --file ./target/hello-world.jar -C target/classes/ .`

`   $ jar -tf hello-world.jar `

`   $ java --class-path ./target/hello-world.jar com.kren.hello.world.Main `

The -jar option only works if the JAR file is an executable JAR file, which means it must have a manifest file with a Main-Class attribute in it.

`   $ jar --create --file ./target/hello-world.jar --main-class=com.kren.hello.world.Main -C target/classes/ . `

`   $ java -jar ./target/hello-world.jar ` 


