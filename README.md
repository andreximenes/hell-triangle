# hell-triangle

Desafio feito utilizando Springboot 1.5 e Java 1.8. Resolvi fazer o teste em Java por ser a linguagem que possuo mais familiaridade
e a escolha do springboot foi pelo fato de eu gostar da sua produtividade e agilidade para fazer algumas coisas.

### Como executar o projeto?
Em uma máquina com o java instalado e devidamente configurado no Path do sistema operacional, 
basta apenas acessar o diretorio dist do projeto e executar o comando java -jar hell-triangle.war, após a subida do projeto, a API
estará disponível no endereco http://localhost:8080.

### Como realizar o calculo total de um Triangulo usando esta aplicação?
  Com o projeto em execução basta fazer uma requisição HTTP POST para o seguinte endpoit http://localhost:8080/triangulo/calcular.
  Para faciliar os testes, recomendo utilizar alguma ferramenta de testes de API como o POSTMAN.
  
  enviando um JSON conforme exemplo abaixo:
  #### Exemplo do JSON do Request:
    {
      "dados":[
          [6],
          [3, 5], 
          [9, 7, 1],
          [4, 6, 8, 4]
        ]
    }

  Após isso será retornado o resultado conforme exemplo abaixo:
  #### Exemplo do JSON do Response:
    {
        "status": "SUCESSO",
        "resultado": 26
    }
    
  Caso a estrutura do "triângulo" do request seja inválida, o usuário receberá o seguinte retorno:
  #### Exemplo de JSON do Response retornando um erro:
    {
      "status": "ERRO",
      "resultado": 0
    }
    
## Acesso ao projeto pelo Heroku
  Para facilitar os testes, eu disponibilizei a aplicação no heroku, onde os testes podem ser feitos utilizando uma ferramenta como o       Postman por exemplo. Basta acessar fazer a requisição HTTP para o endereco http://colocar-endereco-heroku-aqui seguindo as instruções j   descritas acima.
