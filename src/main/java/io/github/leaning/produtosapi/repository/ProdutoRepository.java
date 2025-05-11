// Define o pacote onde está localizado o repositório
package io.github.leaning.produtosapi.repository;

// Importa a classe Produto (modelo) que será manipulada pelo repositório
import io.github.leaning.produtosapi.model.Produto;

// Importações desnecessárias nesse caso (podem ser removidas para limpar o código):
// import jakarta.persistence.Id; -> Não é usada aqui
// import org.springframework.data.repository.Repository; -> Já estamos usando JpaRepository, que estende essa interface

// Importa a interface JpaRepository, que fornece métodos prontos para acessar o banco de dados (CRUD, paginação, etc.)
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Define a interface ProdutoRepository que herda de JpaRepository
// <Produto, String> indica:
// Produto — a entidade (modelo) que será gerenciada
// String — o tipo da chave primária (neste caso, o campo "id" é uma String)
public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> id(String id);

    List<Produto> findByNome(String nome);
    // Nenhum código adicional é necessário aqui por enquanto.
    // JpaRepository já fornece métodos prontos como:
    // - findAll()      → Buscar todos os produtos
    // - findById(id)   → Buscar um produto pelo ID
    // - save(produto)  → Inserir ou atualizar um produto
    // - deleteById(id) → Remover um produto pelo ID
}
