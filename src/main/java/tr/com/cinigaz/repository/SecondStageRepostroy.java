package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.cinigaz.entities.SecondStageEntity;


@Repository
public interface SecondStageRepostroy extends JpaRepository<SecondStageEntity, Long> {
    SecondStageEntity getByTesisatKodAndIslemGuid(String tesisatKod, String islemGuid);
}