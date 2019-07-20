package dantasmaarotti.challenge.Concrete.Services;

import dantasmaarotti.challenge.Concrete.Model.User;

public interface UserService{

    void save(User user);

    User findByName(String name);
}
