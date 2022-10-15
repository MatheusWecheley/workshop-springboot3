<h2>Olá, este é um repositorio referente a um projeto back end desenvolvido em Java Spring Boot!</h2>

# Documentação

<h3>Dependencias</h3>

* **Java**
* **SpringBoot**
* **JPA / Hibernate**
* **H2**

## Requisições
 
  * /users <br>
  
        * `GET` <br>
           Usando GET, retornará os usuarios populados no banco de dados. 
        * `GET:ID` <br>
           Retornando dados da busca do usuario pelo ID do mesmo. Ex: `localhost:8080/users/1`<br>
        * `POST` <br>
           Metodo para cadastro de usuarios.
        * `PUT` <br>
           Buscando o usuário pelo ID e permitindo alterar os campos (name, email, phone);
        * `DELETE` <br>
           Buscando o usuario pelo ID e permitindo DELETAR o mesmo. (caso exista uma Orders para este usuario, não será possivel deletar).    
      
        
   * /orders <br>
  
          * `GET` <br>
           Usando GET, retornará as orders populados no banco de dados.
           * `GET:ID` <br>
           Retornando dados da busca da order pelo ID do mesmo. Ex: `localhost:8080/orders/1`<br>
           
   * /categories <br>
  
          * `GET` <br>
           Usando GET, retornará as categorias populados no banco de dados.
           * `GET:ID` <br>
           Retornando dados da busca da categoria pelo ID do mesmo. Ex: `localhost:8080/categoria/1`<br>
    
     * /products <br>
  
          * `GET` <br>
           Usando GET, retornará os produtos populados no banco de dados.
           * `GET:ID` <br>
           Retornando dados da busca do produto pelo ID do mesmo. Ex: `localhost:8080/categoria/1`<br>
   
           
  
     
   
      
  
  
