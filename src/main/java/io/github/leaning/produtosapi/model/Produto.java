// Define o pacote onde está localizada a classe
package io.github.leaning.produtosapi.model;

// Importa as anotações necessárias do JPA (Jakarta Persistence API)
import jakarta.persistence.*;

// Indica que essa classe é uma entidade JPA, ou seja, será mapeada para uma tabela no banco de dados
@Entity
// Define o nome da tabela no banco como "tb_produto"
@Table(name = "tb_produto")
public class Produto {

    // Define o campo 'id' como chave primária da tabela
    @Id
    private String id;

    // Define que o campo 'nome' será mapeado para a coluna "nome" da tabela
    @Column(name = "nome")
    private String nome;

    // Define que o campo 'desc' será mapeado para a coluna "desc" da tabela
    @Column(name = "desc")
    private String desc;

    // Define que o campo 'preco' será mapeado para a coluna "preco" da tabela
    @Column(name = "preco")
    private double preco;

    // Métodos getters e setters — permitem acessar e modificar os atributos da classe

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método sobrescrito que retorna uma representação em texto do objeto Produto (muito útil para debug e logs)
    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", preco=" + preco +
                '}';
    }
}
