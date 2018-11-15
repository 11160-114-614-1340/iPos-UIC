package process.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import process.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
