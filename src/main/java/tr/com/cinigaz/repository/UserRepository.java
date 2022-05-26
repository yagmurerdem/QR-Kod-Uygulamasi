package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.cinigaz.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByuserId (long userId);
}
