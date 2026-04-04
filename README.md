# 🚀 FiscalXML Engine

Motor de processamento de XML fiscal desenvolvido em Java para leitura, mapeamento e manipulação de **Notas Fiscais Eletrônicas (NFe)**.

---

## 🧠 Sobre o projeto

O **FiscalXML Engine** é uma aplicação focada na interpretação de arquivos XML de NFe, convertendo dados estruturados em objetos Java para facilitar o consumo, análise e processamento dessas informações.

Este projeto foi desenvolvido com foco educacional e evolução para cenários reais de backend, aplicando boas práticas de organização, uso de dependências e modelagem de dados.

---

## ⚙️ Tecnologias utilizadas

* Java
* Maven
* Jackson Dataformat XML
* Programação Orientada a Objetos (POO)

---

## 🏗️ Arquitetura do projeto

O sistema segue uma separação em camadas simples e organizada:

```id="g4b3k2"
src/
└── main/
    └── java/
        └── com/pedroaugusto/fiscalxmlengine/
            ├── application/   # Classe principal (entry point)
            ├── entities/      # Modelos da NFe (mapeamento do XML)
            └── util/          # Leitura e processamento do XML
```

---

## 🔄 Fluxo da aplicação

### 🔹 1. Entrada

O sistema recebe o caminho de um arquivo XML de NFe.

### 🔹 2. Processamento

Utiliza o Jackson XML para converter o conteúdo em objetos Java.

```java id="z0y6tk"
XmlMapper xmlMapper = new XmlMapper();
NFe nfe = xmlMapper.readValue(file, NFe.class);
```

### 🔹 3. Saída

Os dados da NFe são acessados e manipulados via código Java.

---

## 📦 Gerenciamento com Maven

Dependência principal utilizada:

```xml id="o6p3wz"
<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.17.0</version>
</dependency>
```

---

## 🚀 Como executar o projeto

### ✅ Pré-requisitos

* Java 17 (ou superior)
* Maven instalado

---

### ▶️ Execução

```bash id="dx8n94"
# Clonar o repositório
git clone https://github.com/seu-usuario/fiscal-xml-engine.git

# Acessar a pasta
cd fiscal-xml-engine

# Compilar o projeto
mvn clean install
```

Execute a classe principal:

```id="t6u2j4"
FiscalXmlEngineApplication
```

---

## 📄 Exemplo de uso

Entrada:

```id="cfs2v6"
Caminho do XML: C:\temp\nfe.xml
```

Saída:

```id="z9d3l1"
Emitente: Empresa XYZ LTDA
CNPJ: 00.000.000/0001-00
Valor Total: 1500.00
```

---

## 🧩 Conceitos aplicados

* Desserialização de XML em objetos Java
* Separação de responsabilidades (camadas)
* Uso de bibliotecas externas via Maven
* Manipulação de dados estruturados

---

## 🎯 Objetivo

Este projeto foi desenvolvido para:

* Praticar leitura de XML em Java
* Simular processamento de dados fiscais reais
* Servir como base para aplicações backend mais robustas
* Evoluir para APIs e sistemas corporativos

---

## 🚧 Roadmap (melhorias futuras)

* ✔ Validação de XML com XSD da NFe
* ✔ Suporte a múltiplos layouts de NFe
* 🔄 Criação de API REST com Spring Boot
* 🔄 Exportação de dados (JSON / CSV)
* 🔄 Implementação de logs estruturados
* 🔄 Testes automatizados (JUnit)

---

## 🤝 Contribuição

Contribuições são bem-vindas!

Sinta-se à vontade para abrir **issues** ou enviar **pull requests** com melhorias.

---

## 📜 Licença

Este projeto está sob a licença MIT.

---

## 👨‍💻 Autor

**Pedro Augusto**
Estudante de Engenharia de Software com foco em desenvolvimento backend e construção de sistemas escaláveis.
