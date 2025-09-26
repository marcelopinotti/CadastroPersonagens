package dev.marcelopinotti.CadastroDePersonagem.Personagens;


import dev.marcelopinotti.CadastroDePersonagem.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


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
    private String nome;
    private String genero;
    private int idade;
    private String desenho;

    @ManyToOne   // Muitos personagens para uma missao
    @JoinColumn(name = "missoes_id") // nome da chave estrangeira
    private MissoesModel missoes;


}
