package dantasmaarotti.challenge.Concrete.Controller;

import dantasmaarotti.challenge.Concrete.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserController extends JpaRepository<User, Long> {
    User findByName(String name);
}
