# README - Aplicação de Banco via Terminal em Java

Este projeto é uma aplicação de terminal simples escrita em Java para gerenciar contas bancárias básicas. Ele permite aos usuários criar contas, consultar saldos, fazer depósitos e realizar saques, tudo através de uma interface de terminal simples, utilizando caixas de diálogo para entrada e saída de dados.

## Funcionalidades

- **Criar Conta:** Permite ao usuário criar uma nova conta bancária com um nome único.
- **Consulta de Saldo:** Permite ao usuário consultar o saldo da conta.
- **Depositar:** Permite ao usuário depositar um valor em uma conta existente.
- **Sacar:** Permite ao usuário sacar um valor de uma conta, desde que haja saldo suficiente.
- **Sair:** Encerra a aplicação.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver a aplicação.
- **HashMap:** Estrutura de dados para armazenar as contas com acesso rápido a partir do nome do titular.
- **Scanner:** Classe utilizada para obter entrada do usuário através do terminal.
- **JOptionPane:** Utilizada para criar diálogos interativos para entrada e saída de dados.

## Como Usar

1. **Pré-requisitos:**
   - Certifique-se de ter o Java instalado em sua máquina. Você pode verificar isto executando `java -version` no terminal.
   
2. **Execução:**
   - Baixe o código fonte para sua máquina local.
   - Abra o terminal e navegue até o diretório onde o arquivo está salvo.
   - Compile o código com o comando:
     ```
     javac ContaTerminal.java
     ```
   - Execute o programa com o comando:
     ```
     java ContaTerminal
     ```
   - Utilize as caixas de diálogo que aparecem para interagir com a aplicação conforme as opções do menu principal.

## Estrutura do Código

- `ContaTerminal`: Classe principal que contém o método `main` e a lógica para manipular o menu de opções e as chamadas para os métodos de conta.
- `Conta`: Classe que representa uma conta bancária, contendo atributos para o nome do titular e o saldo, além de métodos para depositar e sacar dinheiro.

## Considerações Finais

Esta aplicação foi desenvolvida como um projeto simples e educativo para entender os conceitos básicos de programação em Java e manipulação de dados simples em uma interface de terminal. A utilização de `JOptionPane` combina elementos gráficos simples com a lógica de terminal, facilitando a interação do usuário com a aplicação.

---

Para dúvidas e suporte, por favor, entre em contato através do email: [orudineyliemes@gmail.com].

Desfrute utilizando a sua aplicação de banco via terminal em Java!
