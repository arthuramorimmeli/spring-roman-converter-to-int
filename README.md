# Conversor de numero romano para numero inteiro



## Objetivo:

O Objetivo deste projeto é criar um endpoint que que recebera uma String com um numero romano para que o servidor possa converter para um numero inteiro.

### Dependencias

- Java 8
- Maven 2.0 ou superior


#### Comando para iniciar a API
```
/mvnw spring-boot:run
```
#### Endpoint para converter

````
http://localhost:8080/roman-to-int/{numeroRomano}
`````
| Variavel | Observação  |
|---|---|
|  {numeroRomano} |  Substituir pelo numero romando que deseja converter |



### Retorno

O retorno desse endpoint sera o numero após a converção, ele retornará no corpo da resposta.
