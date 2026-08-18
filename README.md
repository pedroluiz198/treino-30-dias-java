# 🚀 Desafios Práticos de Programação em Java - 30 Dias

Este repositório contém a resolução de desafios práticos de programação e simulações de demandas corporativas (Sprint Tickets) desenvolvidos ao longo de um ciclo intensivo de **30 Dias de Java**.

O foco principal do projeto foi a aplicação prática dos pilares de **Orientação a Objetos (POO)**, tratamento resiliente de exceções, manipulação de dados e arquitetura de código limpo.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

- **Linguagem:** Java (JDK 21)
- **IDE:** Eclipse IDE
- **Versionamento:** Git & GitHub

---

## 📦 Módulos e Funcionalidades Desenvolvidas

O projeto está organizado na pasta `src/` em pacotes temáticos, simulando cenários reais de mercado:

### 💼 Módulos Corporativos e Regras de Negócio

* **`banco` / `contaBancaria`:** Sistema financeiro com controle de saques e depósitos, utilizando **Exceções Customizadas** (`SaqueMaiorException`, `DepositoInvalidoException`) para encapsular regras de segurança.
* **`suporte`:** Sistema de Helpdesk para gestão de chamados de TI, com controle de status (`ABERTO`, `EM_ANDAMENTO`, `CONCLUIDO`), prioridades e relatórios filtrados por ID.
* **`rhEOperacoes` / `rh`:** Gerenciador de folha de pagamento aplicando **Herança e Polimorfismo** entre funcionários CLT e Estagiários para cálculo de adicionais e custo total da empresa.
* **`persistencia`:** Módulo de gravação e leitura de dados em arquivos de texto (`.txt`) utilizando `BufferedWriter`, `BufferedReader` e estrutura `try-with-resources`.
* **`ecommecer` / `loja`:** Carrinho de compras de e-commerce com cálculo de subtotal, aplicação de cupons de desconto percentuais e encerramento de pedido.
* **`restaurante`:** Gestão de comandas e mesas com alteração de estados do pedido (`em preparo`, `pronto`, `pago`) e cálculo automatizado de taxa de serviço (10%).
* **`financas`:** Gerenciador de extrato financeiro pessoal com categorias e balanço dinâmico entre receitas e despesas.

### 🧩 Exercícios de Lógica & Estruturas Base

* **`cinema`:** Mapa de assentos de sala de cinema interativo utilizando matrizes bidimensionais (`boolean[][]`).
* **`biblioteca` / `barbearia` / `veiculo`:** Exercícios de encapsulamento, criação de construtores e gerenciamento de listas (`ArrayList`).

---

## 🎯 Principais Conceitos de Java Aplicados

1. **Orientação a Objetos:** Classes, Atributos Privados, Encapsulamento (Getters e Setters), Construtores e Métodos.
2. **Herança e Polimorfismo:** Reuso de código com `extends`, sobrescrita de métodos com `@Override` e chamadas `super()`.
3. **Coleções (`java.util`):** Manipulação avançada de `ArrayList`, busca por ID e iterações.
4. **Tratamento de Exceções:** Uso de blocos `try-catch-finally`, cláusulas `throws`, `throw new` e Exceções Personalizadas.
5. **Entrada/Saída (I/O):** Leitura e escrita em arquivos com `FileWriter` e `FileReader`.

---

## 👨‍💻 Autor

Desenvolvido por **Pedro Luiz** durante a jornada de consolidação em Java Backend.
