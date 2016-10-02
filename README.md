# Spring Web Shell - example  
Simple example of integration together spring-boot-starter-web and spring-boot-starter-remote-shell   

## Requirements  
- Java 1.8.x  
- Groovy 2.4.x  
- Gradle .2x  

## How to run  
1. Clone this repo
1. Build it
`gradle build`
1. Run `java -jar ./build/libs/web-shell.jar`
1. Pay attention to messages displayed on screen, there should be something like  
`
Using default password for shell access: 2249686d-c7b4-4325-b2c9-96a4eb2d3a62
`  
1. Open another console and type `ssh -p 2000 user@localhost`  
1. Congrats you are connected to remote spring shell session
1. Click tab to display all available commands  