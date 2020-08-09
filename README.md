# pocapplication1
Prova de Conceito (POC) utilizando: AngularJs com Bootstrap no frontend e RESTfull API com SpringBoot no backend.
OBS: O frontend em AngularJs está embeded no springboot na pasta main/resources/static sendo startado com o embed tomcat do SpringBoot.

# Interface
<a href="http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/" target="_blank">![Alt text](app.png?raw=true "Ir para Aplicação")</a>

# AngularJs<br/>

<strong>Conceitos abordados:</strong><br/>

<ul>
  <li>Two Way Data Binding</li>
  <li>Criação e uso de Diretivas</li>
  <li>Validação de Formulários</li>
  <li>Criação e uso de Filtros</li>
  <li>Interação com a RESTfull API via Ajax</li>
  <li>Modularização do Projeto</li>
  <li>Single-Page Application e Interceptors</li>
</ul>
<br/>

# Spring Boot<br/>

<ul>
  <li>O Template do Projeto (Blank Project) foi gerado automaticamente pela ferramenta https://start.spring.io/ e em seguida importado como um Projeto Maven para o Eclipse.</li>
</ul>
<ul>  
  <li>Foram selecionadas as seguintes dependências na geração:</li><br/>
  <ul>
    <li>DevTools</li>
    <li>Web</li>
    <li>Hateoas</li>
    <li>JPA</li>
    <li>MySQL (para ambiente de desenvolvimento)</li>
    <li>PostgreSQL (para ambiente de produção)</li>
    <li>Building e deploy da app na Amazon AWS:  http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080</li>
   </ul>
</ul>
<br/>

# RESTfull API<br/>

<ul>
  <li>Foi criada uma API RESTfull com o uso do SpringBoot, utilizando as seguintes annotations:</li>
  <ul><br/>
    <li>@RestController</li>
    <li>@RequestMapping</li>
    <li>@GetMapping</li>
    <li>@ResponseBody</li>
    <li>@RequestBody</li>
    <li>@PostMapping</li>
    <li>@DeleteMapping</li>
  </ul>
</ul>
<br/>

<ul>
  <li>Foi utilizado o JPA para consulta e persistências no banco de dados, assim como os mapeamentos <strong>@ManyToOne</strong> e <strong>@OneToMany</strong> entre as entidades Contato e Operadora do modelo.</li><br/>
  <li>Foi utilizado o <strong>Swagger-UI</strong> para geração de interface web para API, facilitando assim a sua documentação e a interação com os seus recursos.</li><br/>
</ul>

# Documentação API RESTfull<br/>
  
  <a href="http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/swagger-ui.html" target="_blank">http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/swagger-ui.html</a>
   
  <br/>
  <strong>EndPoints:</strong><br/>
      <ul>
        <li><a href="http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/contato" target="_blank">http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/contato</a></li>
        <li><a href="http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/operadora" target="_blank">http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/operadora</a></li>
      </ul>
       

# Get started<br/>


1) Configurar o parâmetro spring.profiles.active no arquivo de propriedades (src\main\resources\application.properties)

        spring.profiles.active=dev      Executa o projeto apontando para um banco de dados MySql local
        spring.profiles.active=prod     Executa o projeto apontando para um banco de dados PostgreSQL na Amazon RDS
        
2) Criar um schema com o nome "poc" caso utilize MySql.

        CREATE SCHEMA poc;
        
3) Criar um database com o nome "poc" caso utilize PostgreSQL.

        CREATE DATABASE poc;
        
4) Configurar no angularJs a url da api rest

    No arquivo: src/main/resources/static/js/value/configValue.js
            
            angular.module("listaTelefonica").value("config", {
            	baseUrl: "http://ec2-18-231-160-253.sa-east-1.compute.amazonaws.com:8080/"
            });

5) Inicializar o projeto: 

    4.1) Com o maven:
    
        mvn spring-boot:run
        
    4.2) Diretamente pelo Jar da aplicação escolhendo o ambiente (dev ou prod):
        
        java -jar -Dspring.profiles.active=prod poc-0.0.1-SNAPSHOT.jar
        
        
        

        
    
        
        
        