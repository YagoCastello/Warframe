package yago.castello.warframe.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import yago.castello.warframe.Model.Enums.NvSindicato;
import yago.castello.warframe.Model.Enums.Relacao;

@Entity
@Table(name="sindicato")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sindicato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private NvSindicato  sindicato;

    @Enumerated(EnumType.STRING)
    private Relacao relacao;

    private Long Pontuacao;
}
