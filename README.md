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
