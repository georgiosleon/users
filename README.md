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
	"firstName": "Tim",
	"lastName": "Page",
	"phone": "+378 85 345",
	"email": "james@bloom.cok4",
	"addressLine1": "Brook Street Lane 67",
	"addressLine2": null,
	"city": "Berlin",
	"state": "Brandenburg",
	"zip": "36413",
	"countryCode": "DE"
}'
```


### Open API  Docs 

http://localhost:8080/api/swagger-ui/index.html


###  Actuator
http://localhost:8080/api/actuator


###  HealthCheck  
http://localhost:8080/api/actuator/health


###  Mappings 
http://localhost:8080/api/actuator/mappings

###  HTTP TRACE 
http://localhost:8080/api/actuator/httptrace