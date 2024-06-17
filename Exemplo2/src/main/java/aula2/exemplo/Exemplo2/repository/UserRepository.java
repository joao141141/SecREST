package aula2.exemplo.Exemplo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import aula2.exemplo.Exemplo2.model.User;

public interface  UserRepository extends JpaRepository<User, Integer> {
  @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public static User findByUsername(@Param ("username") String username) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
}
}
