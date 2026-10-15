# SofistiCar

Aplicativo desktop Java para gestão de serviços automotivos, desenvolvido com
Swing e Apache Ant.

## Requisitos

- JDK compatível com o projeto
- Apache Ant
- MySQL em execução
- Banco de dados `soberano` criado e preparado com o esquema necessário

As bibliotecas usadas pelo projeto estão na pasta `bibliotecas/`. O repositório
não inclui um script SQL para criar o banco.

## Configuração do banco

Defina as credenciais por variáveis de ambiente antes de iniciar o aplicativo.
`DB_URL` é opcional e, se omitida, usa
`jdbc:mysql://localhost:3306/soberano`.

Linux/macOS:

```sh
export DB_USER=seu_usuario
export DB_PASSWORD=sua_senha
export DB_URL=jdbc:mysql://localhost:3306/soberano
```

Windows PowerShell:

```powershell
$env:DB_USER = "seu_usuario"
$env:DB_PASSWORD = "sua_senha"
$env:DB_URL = "jdbc:mysql://localhost:3306/soberano"
```

## Compilar

Na raiz do projeto, execute:

```sh
ant clean jar
```

Arquivos gerados e configurações locais de IDE são ignorados pelo Git.
