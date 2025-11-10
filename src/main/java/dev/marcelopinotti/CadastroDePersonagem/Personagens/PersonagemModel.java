package dev.marcelopinotti.CadastroDePersonagem.Personagens;


import dev.marcelopinotti.CadastroDePersonagem.Carros.CarrosModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Entity //transforma a classe em uma entidade
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data  // Todos os getters e setters
@ToString
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera o id automaticamente
    private Long id;
    @Column(unique = true, nullable = false) // nome unico e nao nulo
    private String nome;
    private String genero;
    private int idade;
    private String desenho;

    @OneToMany(mappedBy = "personagens",cascade = CascadeType.ALL) // cascadetype all para salvar em cascata
    private List<CarrosModel> carros;


}
