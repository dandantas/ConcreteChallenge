package dantasmaarotti.challenge.Concrete.Services;

import dantasmaarotti.challenge.Concrete.Model.User;
import dantasmaarotti.challenge.Concrete.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }
}
