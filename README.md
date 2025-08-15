# Study APIR

API Java para estudo de Spring Boot

## Criando o .jar 

...
mvn clean package
...

-Localizar o .jar em/target
...
java -Dspring.profiles.active=dev -jar target/study-apir-0.0.1-app.jar 
...

## Variáveis de ambiente declaração

...
export DB_USER=root
export DB_PASSWORD=root_pwd
...

* .env

...
export $(cat .env | xargs)


## MER

![](assets/images/mer.png)

## Instalação

* Limpar e criar a pasta */target*

```
mvn clean package
```

* Configuração do Swagger

    - https://springdoc.org/properties.html

- application.properties

```
springdoc.swagger-ui.path=/
springdoc.swagger-ui.disable-swagger-default-url=true
```


## Navegação

### Executar a API

-  *Executando* **Maven**

```
mvn spring-boot:run
```

### Documentação da API (Swagger)
- http://localhost:8080/swagger-ui.html


## Referencias

- https://springdoc.org/

