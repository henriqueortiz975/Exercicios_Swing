# Exercícios swing

---

## **Exercício 1 - Cadastro de Usuário**

Crie um programa com um formulário para cadastrar usuários. Utilize **duas classes**:

### 📌 **Requisitos**

1. **Classe `Usuario`** (modelo de dados)
    - Atributos: `nome`, `email`, `telefone`
    - Método `toString()` para exibir os dados formatados
2. **Classe `TelaCadastro`** (interface gráfica)
    - Campos:
        - `JTextField` para nome
        - `JTextField` para email
        - `JTextField` para telefone
        - `JButton` "Salvar"
        - `JTextArea` para exibir os usuários cadastrados
    - Ao clicar no botão "Salvar", crie um objeto da classe `Usuario` e exiba os dados na área de texto

---

## **Exercício 2 - Calculadora de Notas**

Crie um sistema para calcular a média de um aluno. Utilize **três classes**:

### 📌 **Requisitos**

1. **Classe `Aluno`**
    - Atributos: `nome`, `nota1`, `nota2`
    - Método `calcularMedia()`
    - Método `toString()` que exibe nome e média
2. **Classe `GerenciadorNotas`** (lógica)
    - Método `verificarSituacao(double media)`: retorna `"Aprovado"` se média ≥ 7, senão `"Reprovado"`
3. **Classe `TelaNotas`** (interface gráfica)
    - Campos:
        - `JTextField` para nome
        - `JTextField` para nota 1
        - `JTextField` para nota 2
        - `JButton` "Calcular"
        - `JLabel` para exibir a média e a situação (aprovado/reprovado)

---

## **Exercício 3 - Gerenciador de Produtos**

Crie um sistema para gerenciar produtos de um estoque. Utilize **três classes**:

### 📌 **Requisitos**

1. **Classe `Produto`**
    - Atributos: `nome`, `preco`, `quantidade`
    - Método `calcularTotal()`: retorna `preco * quantidade`
2. **Classe `GerenciadorProdutos`**
    - Método `adicionarProduto(Produto p)` (armazena os produtos)
    - Método `listarProdutos()`
3. **Classe `TelaEstoque`** (interface gráfica)
    - Campos:
        - `JTextField` para nome
        - `JTextField` para preço
        - `JTextField` para quantidade
        - `JButton` "Adicionar"
        - `JTextArea` para listar os produtos cadastrados

---

Esses exercícios reforçam:

✔️ Uso de classes para organizar o código

✔️ Manipulação de eventos Swing

✔️ Trabalhar com dados e exibição na interface gráfica
