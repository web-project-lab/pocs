# POCS
Projeto Web em Angular e projeto de api de back-end em spring boot.

# Comandos usados para Angular

1 - Comando para criar o projeto:<br/>
ng new crudpessoa-frontend

2 - Comando usado para criar os componentes:
ng generate component pessoa

3 - Comando usado para rodar o servidor interno do angular e abrir no browser:
ng serve --open 

4 - Criadas as pastas de model e seus arquivos de clases bem como a pasta services manualmente.

5 - Comando usado para criar os serviços na pasta services:
ng generate service /services/pessoa
ng generate service /services/estado
ng generate service /services/preferencia

6 - Links dos projetos de libs angulares que foram instaladas como dependências no projeto:

Projeto de mascaras gerais(Cpf, cep, data aniversário, telefone etc, pode se fazer qualquer uma), tem neste link informações para instalação e exemplos de uso.
https://github.com/JsDaddy/ngx-mask

Projeto de mascara para moedas, para montar para o real com instuções para instalação e uso.
https://www.npmjs.com/package/ngx-currency

Projeto para se trabalhar com conversão de string para modeles de datas e de datas para string, usado para pegar a data do formulário angular e transformar em uma data no formato da java.util.Date que o Java já esperava nativamente.
https://github.com/urish/ngx-moment



