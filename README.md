# Projeto Final Backend Spring Boot

## Banco de Dados para Desenvolvimento
Se você não tiver o MySQL instalado em sua máquina, podemos executar um banco de dados MySQL localmente usando o Docker Compose com o seguinte comando:
```bash
docker-compose up
```

## Para Executar a Aplicação
Para executar a aplicação pelo terminal, utilize o seguinte comando:
```bash
mvn spring-boot:run
```

## Testes
Para testes rápidos, você pode interagir com a aplicação por meio do cURL. Exemplos:
```bash
curl -X POST -H 'Content-Type: application/json' -d '{"nome": "Rodrigo"}' http://localhost:8080/funcionario
# Funcionário adicionado com sucesso
```

```bash
curl http://localhost:8080/funcionario
# [{"id":1,"nome":"Rodrigo","email":null,"senha":null,"setor":null}] 
```
