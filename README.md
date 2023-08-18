<h1 align="center">
  Spring Boot Clean Architecture
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Demo&color=8257E5&labelColor=000000" alt="Demo" />
</p>

Demo apresentada [nesse vídeo](https://www.youtube.com/watch?v=hit0XHGt4WI) para ilustrar como implementar a arquitetura limpa utilizando Spring Boot.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/giuliana-bezerra/spring-boot-cleanarch.git
```
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar ./target/spring-boot-cleanarch-0.0.1-SNAPSHOT.jar
```
- Testar ( com [httppie](https://httpie.io) ):
```
http POST :8080/users username=username password=password email=email
```

## Versões do Projeto

Para ajudar a acompanhar o vídeo, foram criadas tags com cada fase do projeto:

- [Projeto Inicial](https://github.com/giuliana-bezerra/spring-boot-cleanarch/releases/tag/v1.0)
- [Projeto com Clean Arch](https://github.com/giuliana-bezerra/spring-boot-cleanarch/releases/tag/v2.0)