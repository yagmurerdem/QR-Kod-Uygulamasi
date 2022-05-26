package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.cinigaz.entities.LogRequestEntity;

public interface LogRequestRepository extends JpaRepository<LogRequestEntity,Long> {
}
