package dantasmaarotti.challenge.Concrete.Controller;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;

import dantasmaarotti.challenge.Concrete.Controller.Dto.UserDto;
import dantasmaarotti.challenge.Concrete.Form.UpdateUserForm;
import dantasmaarotti.challenge.Concrete.Form.UserForm;
import dantasmaarotti.challenge.Concrete.Model.User;
import dantasmaarotti.challenge.Concrete.Repository.UserRepository;
import dantasmaarotti.challenge.Concrete.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public String registration(Model model){
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @PostMapping
    @Transactional
    public ResponseEntity<UserDto> registration(@Valid @RequestBody UserForm form, UriComponentsBuilder uriBuilder){
        User user = form.convert();
        user.setLast_login(user.getCreated());
        //user.setPwd(bCryptPasswordEncoder.encode(user.getPwd()));
        userRepository.save(user);
        URI uri = uriBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new UserDto(user));

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> details(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent())
            return ResponseEntity.ok(new UserDto(user.get()));
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDto> update(@PathVariable Long id, @Valid @RequestBody UpdateUserForm form){

        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            User user = form.update(id, userRepository);
            return ResponseEntity.ok(new UserDto(user));
        }
            return ResponseEntity.notFound().build();






    }

}
