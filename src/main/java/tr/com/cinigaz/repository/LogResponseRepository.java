package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.cinigaz.entities.LogResponseEntity;

public interface LogResponseRepository extends JpaRepository<LogResponseEntity,Long> {
}
