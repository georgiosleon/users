# How to

Pre req:

* `docker`
* `docker-compose`
* `JDK-11`
* `maven`

### To start dev and test database
Step (1)

```shell
docker-compose up
```

### To stop dev and test database

```shell
docker-compose down
```

### To test
Step (2)   - optional 
It requires the database to be up 

```shell
mvn clean test
```

### To run
Step (3)
It requires the database to be up

```shell
mvn spring-boot:run
```

---

### Example request  or see   http://localhost:8080/api/swagger-ui/index.html 

Step (4) 

```shell
curl --request POST \
  --url http://localhost:8080/api/user \
  --header 'Content-Type: application/json' \
  --data '{
	"firstName": "test",
	"lastName": "lala",
	"phone": "+1234567",
	"email": "lala@gmail.com",
	"addressLine1": "Street 76 test",
	"addressLine2": null,
	"city": "Athens",
	"state": "Attiki",
	"zip": "11471",
	"countryCode": "GR"
}'
```


### Open API  Docs 

http://localhost:8080/api/swagger-ui/index.html

### Send Welcome Email  with mailersend  just for example see Email Service need a domain to run in production 

https://github.com/mailersend/mailersend-java


###  Actuator
http://localhost:8080/api/actuator


###  HealthCheck  
http://localhost:8080/api/actuator/health


###  Mappings 
http://localhost:8080/api/actuator/mappings

###  HTTP TRACE 
http://localhost:8080/api/actuator/httptrace


