# Hell-triangle

Desafio feito utilizando Springboot 1.5 e Java 1.8. Resolvi fazer o teste em Java por ser a linguagem que possuo mais familiaridade e já trabalho a um bom tempo. A escolha do springboot se deu pelo fato de eu gostar da sua produtividade e agilidade bem como sua facilidade para executar o artefato final, uma vez que ele já tem o tomcat embarcado.

O projeto desenvolvido consiste em uma API Rest, onde atráves de uma requisição HTTP (Post), o usuário envia uma requisição com a estrutura de um triângulo válido que ele deseja calcular o total máximo. Essa requisição tem que ter o content-type: application/json. e terá como retorno o resultado do cálculo do total máximo.

## Como executar o projeto?
  ##### Pré-Requesitos: 
 1. Apache Maven 3.1.1 ou superior 
 2. Java 1.8 ambos devidamente instalado e configurados.

### 1 - Executando artefato compilado disponível no fonte do projeto.

Via terminal (Linux, Mac) ou CMD (windows), acessa o diretório hell-triangle\projeto-compilado. Dentro dele o projeto compilado, para executar basta rodar o comando abaixo:

    java -jar hell-triangle-0.0.1.jar
Após isso o serviço ficará disponível no endereço local na porta 8080.

> http://localhost:8080

Lembrando que para o comando acima funcionar, o Java tem que está configurado no PATH do sistema operacional.


Após o projeto iniciar, o usuário deve seguir os passos das **instruções de testes** que está mais abaixo.
    

### 2 - Abrindo o projeto projeto no Eclipse ou outra IDE
Deve-se importar um projeto Maven existente selecionando o diretório do projeto hell-triangle. Após o Maven baixar todas as dependências do projeto, basta apenas executar a classe principal do projeto:
`br.com.alx.b2w.HellTriangleApplication`

Após isso o serviço ficará disponível no endereço local na porta 8080.
> http://localhost:8080

Após o projeto iniciar seguir os passos das **instruções de testes** que está logo abaixo.


### 3 - Acessando o projeto disponibilizado no Heroku
Para facilitar os testes, eu disponibilizei o projeto no [Heroku](heroku.com), dessa forma as duas opções anteriores podem ser ignoradas, já que o projeto já estaria rodando. Dessa o usuário deve apenas seguir os passos das **instruções de testes** .

Para testar usando Heroku, deve-se usar a URL base abaixo:
> https://hell-triangle-b2w.herokuapp.com



----------


###  Instruções de Testes

> Para facilitar, as instruções a seguir serão todas exemplificadas usando a opção de usar o projeto hospedado no Heroku.

Conforme  explicado no inicio desde documento o projeto consiste em uma API Rest e para utilizá-la, o usuário deve enviar uma requisição
HTTP POST para o seguinte endpoint: 

https://hell-triangle-b2w.herokuapp.com/triangulo/calcular

Para facilitar os testes, recomendo utilizar alguma ferramenta de testes de API como o POSTMAN.
  
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
      "status": 200,
      "statusMsg": "Total máximo obtido com sucesso.",
      "resultado": 26
    }
    
  Caso a estrutura do "triângulo" do request seja inválida, o usuário receberá os seguintes retornos:
  #### Exemplo de JSON do Response retornando um erro:
  
  ##### Triângulo nulo ou vazio
    {
      "status": 500,
      "statusMsg": "Triângulo nulo ou vazio.",
      "resultado": 0
    }
  ##### Triângulo inválido
    {
      "status": 500,
      "statusMsg": "Trinângulo inválido.",
      "resultado": 0
    }
    


----------


#### Imagens de testes realizados utilizando o POSTMAN
##### 1 - Requisição de um triângulo válido   
![enter image description here](https://lh3.googleusercontent.com/0gdgnPWt8E1_VK6GUrNWkWCf7nUQrEOwY-G9Z6MGl8Mtb3oxOu0FPW_6YPaGH2sfG42i2LS5b-ALrA)

##### 2 - Requisição de um triângulo nulo ou vazio
![enter image description here](https://lh3.googleusercontent.com/khFCHll_F3c7Y_vVzpyvGn94-Gm4KIQQVzJrX81Za0w5ug4W_WVh8QhaBTeZIt3Falb97OGPjscZlg)

##### 3 - Requisição de um triângulo inválido
![enter image description here](https://lh3.googleusercontent.com/ns23gP2YWaYZpO4_t_fcrPpQlSBBI-jnMLTJky_zBNR3wB-qSIuogG5caf6U2oSnp1Hq9k150LBy1A)


----------


**Autor:** André Luiz XImenes
