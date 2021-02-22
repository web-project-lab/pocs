# POCS
Projeto Web em Angular e projeto de api de back-end em spring boot.

# Comandos usados para Angular

1 - Comando para criar o projeto:<br/>
ng new crudpessoa-frontend

2 - Comando usado para criar os componentes:<br/>
ng generate component pessoa

3 - Comando usado para rodar o servidor interno do angular e abrir no browser:<br/>
ng serve --open 

4 - Criadas as pastas de model e seus arquivos de clases bem como a pasta services manualmente.<br/>

5 - Comando usado para criar os serviços na pasta services:<br/>
ng generate service /services/pessoa<br/>
ng generate service /services/estado<br/>
ng generate service /services/preferencia

6 - Links dos projetos de libs angulares que foram instaladas como dependências no projeto:<br/>

Projeto de mascaras gerais(Cpf, cep, data aniversário, telefone etc, pode se fazer qualquer uma), tem neste link informações para instalação e exemplos de uso.<br/>
https://github.com/JsDaddy/ngx-mask

Projeto de mascara para moedas, para montar para o real com instuções para instalação e uso.<br/>
https://www.npmjs.com/package/ngx-currency

Projeto para se trabalhar com conversão de string para modeles de datas e de datas para string, usado para pegar a data do formulário angular e transformar em uma data no formato da java.util.Date que o Java já esperava nativamente.<br/>
https://github.com/urish/ngx-moment

Vídeo do Youtube com comentário sobre a poc, sobre o código.<br/>
https://youtu.be/YFLSB5A_0jA

