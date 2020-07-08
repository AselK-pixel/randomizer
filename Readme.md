<br>
<b>Introduction:</b> <br>
This a REST Web Service that returns a random address to the client. It's developed using Spring Boot and Java. I used Maven as build management tool and embedded Tomcat to run the application. I also used JUnit 5 for unit testing and Logback for logging.

<b>Tools and frameworks:</b> <br>
	1) Java SE 1.8 <br>
	2)  Spring Boot 2.3.1 <br>
	3) Maven <br>
	4) Tomcat (Embedded) <br>
	5) JUnit 5 <br>
	6) Logback <br>

<br>
<b>Endpoint:</b> <br>
	GET /randomizer/address

<br>
<b>Response Data Format:</b> <br> JSON

<br>
<b>Application Port:</b> <br> 
By default this application runs on port 8080. To run on a different port, change property value of <b>server.port</b> on application.properties file.

<br>
<b>Logging:</b> <br> 
Root log is set to INFO and application class files log level are set to DEBUG. These setting can be changed on logback.xml file inside src/main/resources directory.


<br>
<b>Unit Testing:</b> <br>
Total 6 test cases are added in this project. If you have maven installed, they can be run using Maven standard command <b><i>mvn clean test</i></b> navigating to src/test/java/com/randomizer directory.


<br>
<b>Start the Application:</b> <br>
If you have Maven installed, you can run this command <b><i>mvnw spriing-boot:run</i></b> inside /randomizer directory.

<br>
<b>Application URL:</b> <br>
http://localhost:8080/randomizer/address

<br>
<b>Sample Response:</b> <br>
{"house":"39","street":"Linklon Rd","postalCode":"33076","city":"Brooklyn","county":"New York City","state":"New York","stateCode":null,"country":null,"countryCode":"USA"}


<br>
<b>Stop the Application:</b> <br>
You can do <b><i>ctrl+c</i></b> on the Tomcat console.





