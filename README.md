# DesafioAlura — Aplicação de Controle de Fluxo Bancário 🏦

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Alura](https://img.shields.io/badge/Alura-Oracle%20Next%20Education-0056b3?style=for-the-badge&logo=alura&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![License](https://img.shields.io/badge/Licença-MIT-green?style=for-the-badge)

<p align="center">
  <strong>Projeto prático desenvolvido para consolidar estruturas de repetição, condicionais e manipulação de dados em Java através da simulação de operações bancárias virtuais via console.</strong>
</p>

[Funcionalidades](#-funcionalidades) •
[Demonstração](#-demonstração-da-execução) •
[Tecnologias](#-tecnologias-utilizadas) •
[Como Executar](#-como-executar) •
[Regras de Negócio](#-regras-de-negócio-e-validações) •
[Autor](#-autor)

</div>

---

## 📌 Sobre o Desafio

Este projeto é a entrega do **Desafio Prático** do módulo *"Java: criando a sua primeira aplicação"* da **Alura**, parte integrante do programa **Oracle Next Education (ONE)**.

O objetivo do desafio é construir um sistema em console capaz de inicializar os dados de um cliente bancário e permitir a execução em tempo real de operações financeiras essenciais (consulta de saldo, recebimento e transferência de valores), garantindo a integridade dos dados e tratamento de entradas inválidas.

---

## 🚀 Funcionalidades

- 👤 **Inicialização de Dados do Cliente**: Exibe nome do titular, tipo de conta (Corrente/Poupança) e saldo inicial formatado.
- 📋 **Menu Interativo de Opções**:
  - `1 - Consultar saldos`: Exibe o saldo bancário atualizado em reais (`R$`).
  - `2 - Receber valor`: Permite efetuar depósitos e créditos, somando imediatamente ao saldo da conta.
  - `3 - Transferir valor`: Realiza envios de dinheiro com verificação estrita de saldo disponível.
  - `4 - Sair`: Encerra o programa de forma elegante com mensagem de despedida.
- 🛡️ **Validação de Regras de Negócio**:
  - Impede transferências com valor maior que o saldo disponível na conta.
  - Impede transferências de valores nulos ou negativos.
  - Notifica o usuário sobre opções inválidas digitadas no menu.
- 🔁 **Loop Contínuo**: A aplicação permanece ativa processando comandos até que o usuário escolha explicitamente a opção de saída.

---

## 🖥️ Demonstração da Execução

```text
***********************
Dados iniciais do cliente:

Nome:            Manoel David
Tipo conta:      Corrente
Saldo inicial:   R$ 2500,00
***********************

Operações:

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 1
O saldo atual é R$ 2500.00

Digite a opção desejada: 2
Informe o valor a receber:
500
Saldo atualizado R$ 3000.00

Digite a opção desejada: 3
Informe o valor que deseja transferir:
4000
Não há saldo suficiente para fazer essa transferência.

Digite a opção desejada: 3
Informe o valor que deseja transferir:
1200
Saldo atualizado R$ 1800.00

Digite a opção desejada: 4
Programa finalizado com sucesso. Obrigado por utilizar nossos serviços bancários!
```

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: [Java JDK 17](https://www.oracle.com/java/) ou superior
- **Entrada e Saída**: `java.util.Scanner` para leitura dinâmica do teclado via console
- **Tipos de Dados**: `double` e formatação monetária padrão
- **Controle de Fluxo**: Estrutura de repetição `while` e condicionais `if / else if / else` (ou `switch case`)
- **Ambiente de Desenvolvimento**: [IntelliJ IDEA](https://www.jetbrains.com/idea/) / VS Code / Eclipse

---

## 📂 Estrutura do Repositório

```bash
DesafioAlura/
├── src/
│   └── Main.java              # Classe principal com o fluxo e menu bancário
├── .gitignore                 # Arquivos e diretórios ignorados pelo Git
└── README.md                  # Documentação completa do projeto
```

---

## ⚙️ Como Executar

### Pré-requisitos
Certifique-se de ter o **Java JDK** (versão 11 ou superior, recomendado 17) instalado na sua máquina:

```bash
java -version
```

### Passo 1: Clonar o Repositório
```bash
git clone https://github.com/ManoelDavidDev/DesafioAlura.git
cd DesafioAlura
```

### Passo 2: Compilar e Executar via Terminal

```bash
# Navegue até o diretório onde está o código-fonte
cd src

# Compile o arquivo Java
javac Main.java

# Execute o programa
java Main
```

### Passo 3: Executar via IntelliJ IDEA ou VS Code
1. Abra a IDE de sua preferência.
2. Selecione a opção **Open / Abrir Pasta** e selecione o diretório clonado `DesafioAlura`.
3. Certifique-se de que o SDK do projeto está configurado para Java 17+.
4. Abra o arquivo `Main.java` e clique no botão verde de **Run** (`Shift + F10` ou `Ctrl + F5`).

---

## 📊 Regras de Negócio e Validações

| Operação | Entrada Esperada | Ação do Sistema | Validação de Segurança |
|:---|:---|:---|:---|
| **1 - Consulta** | Opção `1` | Exibe o saldo no instante atual | Leitura instantânea sem efeito colateral |
| **2 - Receber** | Opção `2` + Valor monetário | Adiciona o valor digitado ao saldo | Rejeita valores negativos |
| **3 - Transferir** | Opção `3` + Valor monetário | Subtrai o valor do saldo se `valor <= saldo` | Bloqueia transferência se saldo for insuficiente |
| **4 - Sair** | Opção `4` | Interrompe o loop de execução | Encerramento limpo e liberação do Scanner |
| **Opção Inválida** | Qualquer outro caractere | Alerta que a opção é inexistente | Repete o menu sem travar a aplicação |

---

## 💡 Aprendizados e Habilidades Desenvolvidas

- [x] Lógica de programação orientada a requisitos reais de negócio.
- [x] Uso de acumuladores e manipulação de estado em memória durante o ciclo de vida da aplicação.
- [x] Prevenção de exceções e tratamento de cenários alternativos (saldo insuficiente).
- [x] Boas práticas de nomenclatura de variáveis, indentação e legibilidade de código Java.

---

## 👨‍💻 Autor

Feito com dedicação por **Manoel David**! 👋

[![GitHub](https://img.shields.io/badge/GitHub-ManoelDavidDev-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/ManoelDavidDev)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Manoel%20David-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/manoeldaviddev/)

---

## 📜 Licença

Este projeto está sob a licença [MIT](LICENSE). Sinta-se livre para estudar, modificar e aprimorar o código!

<div align="center">
  <sub>Desafio desenvolvido como parte da Formação Java na Alura | Oracle Next Education</sub>
</div>
