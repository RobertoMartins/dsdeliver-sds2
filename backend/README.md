## Backend do projeto realizado na 2ª Semana do DEV Superior 

Construindo uma API Rest DSDelivery com SpringBoot. A API acessa um banco de dados Postgres onde estão armazenados os Products e Orders que serão consumidos pelo frontend.

##:hammer: Ferramentas & Tecnologias
![Java](https://img.shields.io/badge/-Java-007396?style=flat-square&logo=java)
![Spring](https://img.shields.io/badge/-Spring-6DB33F?style=flat-square&logo=spring&logoColor=white)
![Heroku](https://img.shields.io/badge/Heroku%20-%23430098.svg?&logo=heroku&logoColor=white)
![Postgres](https://img.shields.io/badge/Postgres-%23316192.svg?&logo=postgresql&logoColor=white)

<ul>
	<li>SpringBoot
		<ul>
    		<li> Spring Data JPA</li>
    		<li> Spring Web</li>
    	</ul>
	</li>
	<li>Database
		<ul>
		<li>Postgres</li>
		<li>H2</li>
		</ul>
	</li>
</ul>
    
## :rocket: Deploy

O Backend foi implantado na nuvem, utilizando o Heroku e está disponivel em https://dsdeliver-roberto.herokuapp.com/

### :twisted_rightwards_arrows: Endpoints

[GET] https://dsdeliver-roberto.herokuapp.com/products (Retorna todos os produtos)

[GET] https://dsdeliver-roberto.herokuapp.com/orders	(Retorna todos os pedidos)

[POST] https://dsdeliver-roberto.herokuapp.com/orders	(insere um novo pedido)

[PUT] https://dsdeliver-roberto.herokuapp.com//orders/{id}/delivered (Muda o status do pedido para 'delivered')