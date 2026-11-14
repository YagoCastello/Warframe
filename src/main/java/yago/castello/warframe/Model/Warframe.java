package yago.castello.warframe.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import yago.castello.warframe.Model.Enums.Build;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "warframe")
public class Warframe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome_player" ,length = 100, nullable = false)
    private String nomePlayer;

    @Column(name="nome_warframe" ,length = 100, nullable = false)
    private String nomeWarframe;
    private int lvl;
    private int forma;
    private Build build;

}
