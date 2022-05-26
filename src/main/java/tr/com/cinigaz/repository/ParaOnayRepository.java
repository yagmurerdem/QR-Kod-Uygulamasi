package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.cinigaz.entities.ParaOnayEntity;

public interface ParaOnayRepository extends JpaRepository<ParaOnayEntity,Long> {
    ParaOnayEntity findParaOnayEntityByparaOnayId(Long paraOnayId);

}
