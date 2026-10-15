# 🔧 Sistema de Gestão de Oficina Mecânica

Aplicação desktop desenvolvida em **Java 8** como projeto acadêmico durante a graduação, com o objetivo de informatizar e facilitar o gerenciamento das atividades de uma oficina mecânica.

O sistema centraliza o cadastro de clientes, peças e serviços, permitindo também o gerenciamento de ordens de serviço, o controle de estoque, o registro de movimentações e a geração de relatórios gerenciais.

O projeto foi desenvolvido para aplicar conceitos de programação orientada a objetos, desenvolvimento de interfaces gráficas e integração com banco de dados relacional.

## 📋 Funcionalidades

### 👥 Cadastro de Clientes
- Cadastro e consulta de clientes.
- Gerenciamento das informações dos clientes.
- Centralização dos dados para facilitar o atendimento.

### 🔩 Cadastro de Peças
- Cadastro e gerenciamento de peças automotivas.
- Consulta de peças disponíveis.
- Organização dos produtos utilizados nos serviços da oficina.

### 🛠️ Cadastro de Serviços
- Cadastro dos serviços oferecidos pela oficina.
- Consulta e gerenciamento dos serviços disponíveis.
- Organização dos serviços para utilização nas ordens de serviço.

### 📝 Ordens de Serviço
- Registro e gerenciamento de ordens de serviço.
- Associação dos serviços realizados aos atendimentos da oficina.
- Organização das informações relacionadas à execução dos serviços.

### 📦 Controle de Estoque
- Gerenciamento das peças disponíveis.
- Registro de movimentações de estoque.
- Acompanhamento das entradas e saídas de produtos.
- Consulta das informações relacionadas à disponibilidade de peças.

### 📊 Relatórios
- Geração de relatórios para acompanhamento das informações do sistema.
- Consulta de dados operacionais da oficina.
- Apoio à organização e ao gerenciamento das atividades.

## 🧰 Tecnologias Utilizadas

| Tecnologia | Aplicação |
|---|---|
| Java 8 | Linguagem de programação |
| Java Swing | Desenvolvimento da interface gráfica desktop |
| MySQL 5 | Gerenciamento e persistência dos dados |
| JDBC | Integração entre a aplicação Java e o banco de dados, caso utilizado diretamente no projeto |

## 🏗️ Características do Sistema

O sistema foi desenvolvido como uma aplicação desktop, com interface gráfica construída em Java Swing e armazenamento de dados em banco de dados MySQL 5.

A solução reúne funcionalidades para gerenciar as principais operações de uma oficina mecânica, desde o cadastro de clientes e peças até o acompanhamento das ordens de serviço e das movimentações de estoque.

### Principais módulos

- **Clientes:** gerenciamento dos dados cadastrais.
- **Peças:** manutenção do catálogo de produtos.
- **Serviços:** gerenciamento dos serviços oferecidos.
- **Ordens de serviço:** registro e acompanhamento dos serviços da oficina.
- **Estoque:** controle de entradas e saídas de peças.
- **Relatórios:** consulta e apresentação de informações gerenciais.

## 🎯 Objetivos do Projeto

- Aplicar os conhecimentos adquiridos durante a graduação.
- Desenvolver uma aplicação desktop utilizando Java 8.
- Praticar conceitos de programação orientada a objetos.
- Implementar operações de cadastro, consulta e gerenciamento de dados.
- Integrar uma aplicação Java a um banco de dados relacional.
- Desenvolver funcionalidades para controle de estoque e ordens de serviço.
- Criar uma solução informatizada para apoiar a gestão de uma oficina mecânica.

## 🚀 Como Executar

### Pré-requisitos

Antes de executar a aplicação, verifique se os seguintes componentes estão disponíveis:

- JDK 8.
- MySQL 5.
- IDE compatível com Java, como NetBeans ou Eclipse.
- Driver JDBC compatível com a versão do MySQL utilizada.

### Instalação

**1. Clone o repositório**

```bash
git clone URL_DO_REPOSITORIO
```

**2. Abra o projeto**

Importe o projeto na IDE utilizada no desenvolvimento, respeitando sua estrutura original.

**3. Configure o banco de dados**

- Inicie o servidor MySQL.
- Crie o banco de dados necessário para a aplicação.
- Execute o script SQL de criação das tabelas, caso esteja disponível no repositório.
- Configure as credenciais e os parâmetros de conexão utilizados pela aplicação.

**4. Configure as dependências**

Verifique se o driver JDBC e as demais bibliotecas necessárias estão disponíveis no projeto.

**5. Execute a aplicação**

Compile o projeto e execute sua classe principal pela IDE.

> **Nota:** os comandos e as configurações exatas dependem da estrutura do projeto e dos arquivos disponibilizados no repositório.

## 📚 Contexto Acadêmico

Este projeto foi desenvolvido durante a graduação como exercício prático de desenvolvimento de software.

A proposta consistiu em criar uma aplicação desktop para auxiliar na administração de uma oficina mecânica, reunindo em um único sistema o gerenciamento de clientes, peças, serviços, ordens de serviço, estoque e relatórios.

O desenvolvimento proporcionou experiência prática com Java 8, construção de interfaces gráficas utilizando Swing e integração com banco de dados MySQL 5.

## 🔮 Possíveis Evoluções

O sistema pode servir como base para futuras melhorias, como:

- Desenvolvimento de uma API REST com Spring Boot.
- Migração para uma interface web.
- Implementação de autenticação e controle de acesso por perfil.
- Ampliação dos relatórios gerenciais.
- Implementação de notificações para estoque baixo.
- Integração com serviços externos.
- Modernização da estrutura e das tecnologias utilizadas.

## 👨‍💻 Autor

**William Almeida Dias**

Desenvolvedor de Software | Java Backend Developer

Projeto acadêmico desenvolvido durante a graduação.

---

*Sistema desktop para gerenciamento de oficinas mecânicas, desenvolvido com Java 8, Java Swing e MySQL 5.*
