#!/bin/sh

mvn clean package

mkdir target/lib/automatic-module

mv target/lib/compile/spring-web-6.1.5.jar \
   target/lib/compile/spring-boot-3.2.4.jar \
   target/lib/compile/spring-core-6.1.5.jar \
   target/lib/compile/spring-beans-6.1.5.jar \
   target/lib/compile/spring-context-6.1.5.jar \
   target/lib/compile/spring-boot-autoconfigure-3.2.4.jar \
   -t target/lib/automatic-module

mv target/lib/compile/ target/lib/unnamed-module/

find ./target/ -mindepth 1 ! -regex '^./target/lib\(/.*\)?' -delete
