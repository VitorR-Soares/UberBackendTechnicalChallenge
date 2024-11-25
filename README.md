# Desafio de Backend - Uber 🚗

[![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)]()

## Descrição

Este projeto consiste em um **microsserviço de disparo automático de e-mails** utilizando a API do **Amazon Simple Email Service (SES)**.  
O serviço foi projetado para rodar em ambiente local, permitindo a interação com outros sistemas da Uber, como **pagamentos** e **avaliação de corridas**, e possibilitando o envio de e-mails de forma prática e automatizada.

## 🚀 Funcionalidades

- Enviar e-mails de forma automatizada a partir de um endpoint REST.
- Integração com o Amazon SES para disparo de e-mails.
- Suporte a e-mails dinâmicos, configurados via JSON no corpo da requisição.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java  
- **Framework**: Spring Boot  
- **API de E-mail**: Amazon Simple Email Service (SES)  
- **IDE**: IntelliJ IDEA  
- **Ferramenta de Teste**: Insomnia  

---

## ⚙️ Como Utilizar

1. Clone o repositório para sua máquina local:
   ```bash
   git clone <URL_DO_REPOSITÓRIO>
2. Certifique-se de ter o Java 17 ou superior instalado.

3. Configure os seguintes pré-requisitos antes de rodar o serviço
Identidades Verificadas no SES: Apenas e-mails cadastrados e verificados no Amazon SES podem ser usados como remetente e destinatário.
Credenciais AWS: Obtenha as access key e secret key do seu usuário no IAM da AWS e configure no arquivo application.properties:

    aws.access-key=<sua-access-key>
    aws.secret-key=<sua-secret-key>
    aws.region=<sua-região>

4. Execute o projeto em sua IDE ou via terminal:

mvn spring-boot:run

5. Acesse o endpoint no Insomnia ou outro cliente REST:

    Endpoint: /api/email
    Método HTTP: POST
    Corpo da Requisição (JSON):

{
  "to": "email_destinatario@example.com",
  "subject": "Assunto do e-mail",
  "body": "Corpo do e-mail"
}
## ⚠️ Observações Importantes
O serviço funciona apenas em rede local.
Certifique-se de que a conexão com a internet esteja funcional e que não haja bloqueios no firewall ou proxy para o acesso à AWS.
Configure corretamente o arquivo application.properties com suas credenciais e região AWS para garantir a operação do SES.
    
## 👩‍💻 Contribuindo

Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature:

git checkout -b feature/nova-feature

3. Faça commit das suas mudanças:

git commit -m 'Adiciona nova feature'

4. Faça um push para a branch:

git push origin feature/nova-feature

5. Abra um Pull Request.
