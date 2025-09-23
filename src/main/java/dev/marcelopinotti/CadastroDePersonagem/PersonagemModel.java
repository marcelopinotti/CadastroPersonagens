package dev.marcelopinotti.CadastroDePersonagem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //transforma a classe em uma entidade
@Table(name = "tb_cadastro")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera o id automaticamente
    private Long id;
    private String nome;
    private String genero;
    private int idade;
    private String desenho;

    public PersonagemModel() {
    }
    public PersonagemModel(Long id, String nome, String genero, int idade, String desenho) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.desenho = desenho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }
}
