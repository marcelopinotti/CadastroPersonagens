package dev.marcelopinotti.CadastroDePersonagem.Missoes;

import dev.marcelopinotti.CadastroDePersonagem.Personagens.PersonagemModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String universo;

    @OneToMany(mappedBy = "missoes")    // uma missao com muitos personagens
    private List<PersonagemModel> personagens;



}
