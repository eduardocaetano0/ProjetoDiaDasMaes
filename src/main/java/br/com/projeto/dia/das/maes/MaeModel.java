package br.com.projeto.dia.das.maes;

import jakarta.persistence.*;

// Entity transforma classe em uma entidade no banco de dados
// JPA - Java Persistence API
@Entity
@Table(name = "tb_nome")
public class MaeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;


    public MaeModel() {
    }

    public MaeModel(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
