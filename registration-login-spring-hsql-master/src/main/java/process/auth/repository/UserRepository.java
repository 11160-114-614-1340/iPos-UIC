package process.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import process.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
