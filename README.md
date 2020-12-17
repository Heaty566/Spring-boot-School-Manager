# Student Manager

## How to run

- Edit configuation file ( application.properties )

```javascript
 spring.mvc.view.prefix=/WEB-INF/views/
 spring.mvc.view.suffix=.jsp
 #Enter your mysql database information
 db.url=
 db.username=
 db.password=
 db.driver=com.mysql.jdbc.Driver
 #Running on port 4000
 server.port=4000
```

- Apply Mysql file ( schoolmanager.sql )
- CMD: ./mvnw spring-boot:run
## Checking process list
- Apply Jsp and run a single demo controller to render html to client
- Create Student entity and add StudentService with a service to render table
- Apply Student Validator to Student entity 
- Create connection to mysql database
- Create a simple save entity in StudentRepository and apply it to studentForm
- Create student report in service and controller
