# ms - Microsserviços Spring Boot
Projeto Spring de microsserviços

# Principais tecnologias utilizadas no projeto

<ul>
  <li> JWT authentication </li>
  <li> Eureka </li>
  <li> Actuator </li>
  <li> Zuul </li>
  <li> oauth </li>
  <li> JPA </li>
</ul>
<br/>
Entre outras tecnologias...

# Arquitetura do projeto

Este projeto de microsserviços se baseia na ideia de uma empresa que tenha funcionarios (trabalhadores/workers) <br/>
e a folha de pagamento (payroll) que será gerada para cada trabalhador. <br/>
O sistema é divido então em 7 microsserviços, estes:
<ul>
  <li> hr-worker: responsável pelo trabalhador, cadastro e afins </li>
  <li> hr-payroll: responsável pela folha de pagamento, cadastro e afins </li>
  <li> hr-api-gateway-zuul: responsável por rotear requisiões </li>
  <li> hr-eureka: responsável por localizar os serviços e fazer balancelamentos de carga </li>
  <li> hr-config: responsável pela configuração do sistema, que no caso foi conectado à um repositório do github </li>
  <li> hr-oauth: responsável pela parte de autenticação do usuário </li>
  <li> hr-user: responsável pelo usuário, cadastro e afins </li>
</ul>

# Autenticação JWT
Como foi utilizado o jwt, temos a tecnologia de token. <br/>
Na parte de login é gerado um token para cada um dos usuários,<br/>
a partir do token gerado é feito a autenticação do usuário com sistema.

# Diagrama

<center> <a href="mario-estevam/ms"><img src="https://i.imgur.com/9tzCaRy.png" title="source: diagrama" /></a> </center>

