# Trabalho da Disciplina de Programação Web

Desenvolver uma aplicação Web utilizando JSF para gerenciamento de uma pequena locadora. Nesse exemplo hipotético não existe diferenciação entre cliente e funcionários, ou seja, qualquer pessoa poderá alugar filmes ou cadastrar novos filmes sem a necessidade de um login. As seguintes funcionalidades devem ser implementadas:

1. A locadora deve ser inicializada com 3 filmes quaisquer salvos no banco de dados.


2. Página para cadastrar filmes (titulo, data de lançamento, nota, descrição, quantidade). Exibe o formulário de cadastro e uma tabela dos filmes já cadastrados. É necessário validar os dados inseridos. Os filmes são adicionados ao banco juntamente os filmes da questão 1.  
    * Título não pode ser vazio.
    * A data de lançamento deve ser um objeto do tipo Date.
    * A nota deve ser um inteiro de 1 até 5.
    * Descrição deve conter pelo menos 10 caracteres .
    * Quantidade deve ser um número maior que zero.
    * Botões cadastrar e cancelar.
    
    
3. Página para listar filmes para aluguel disponíveis deve conter:  
    * Tabela com os filmes disponíveis.
    * Botões (ou links) para adicionar filmes na cesta de aluguel. A cesta de aluguel deve ser armezanada numa sessão do cliente.
    * Um filme adicionado ma cesta de aluguel deve sair do estoque da loja.
    * Impedir que o cliente coloque no carrinho um produto que não está no estoque.
    
    
4. Página para listar produtos presentes na cesta de aluguel.
    * Disponibilizar botões (ou links) para remover produtos da cesta de aluguel.
    * Um produto removido da cesta de aluguel deve voltar ao estoque da locadora.
    * Botão para confirmar o aluguel deve realizar o cálculo do valor a ser pago.
    * Botão para limpar a cesta de aluguel deve remover todos os itens da cesta mesmo tempo.
