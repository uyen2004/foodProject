package uyen.foodProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uyen.foodProject.Entity.UserEntity;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findByEmaiAndPassword(String email, String password);
}
