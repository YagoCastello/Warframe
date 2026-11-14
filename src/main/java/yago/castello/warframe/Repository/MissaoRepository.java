package yago.castello.warframe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yago.castello.warframe.Model.Missao;

public interface MissaoRepository extends JpaRepository<Missao, Long> {
}
