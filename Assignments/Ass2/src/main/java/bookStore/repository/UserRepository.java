package bookStore.repository;

import bookStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();

    User save(User user);
    @Transactional
    void deleteByUsername(String username);

    @Transactional
    @Modifying
    @Query("update User u set u.address = ?1 where u.username = ?2")
    void updateUser(String address, String username);
}
