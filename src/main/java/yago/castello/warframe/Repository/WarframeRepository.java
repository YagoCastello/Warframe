package yago.castello.warframe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yago.castello.warframe.Model.Warframe;

public interface WarframeRepository extends JpaRepository<Warframe, Long> {
}
