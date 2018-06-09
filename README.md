# pocapplication1
Prova de Conceito (POC) utilizando: AngularJs com Bootstrap no frontend e RESTfull API com SpringBoot no backend.

# Interface
<a href="https://pocapplication1.herokuapp.com/" target="_blank">![Alt text](app.png?raw=true "Ir para Aplicação")</a>

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
    <li>Building e deploy da app no Heroku:  https://devcenter.heroku.com/</li>
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
  
  <a href="https://pocapplication1.herokuapp.com/swagger-ui.html" target="_blank">https://pocapplication1.herokuapp.com/swagger-ui.html</a>
   
  <br/>
  <strong>EndPoints:</strong><br/>
      <ul>
        <li><a href="https://pocapplication1.herokuapp.com/contato" target="_blank">https://pocapplication1.herokuapp.com/contato</a></li>
        <li><a href="https://pocapplication1.herokuapp.com/operadora" target="_blank">https://pocapplication1.herokuapp.com/operadora</a></li>
      </ul>
       
      
