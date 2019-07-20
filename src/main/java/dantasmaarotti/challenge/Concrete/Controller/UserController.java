package dantasmaarotti.challenge.Concrete.Controller;

import dantasmaarotti.challenge.Concrete.Controller.Dto.UserDto;
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

import java.net.URI;

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
    public ResponseEntity<UserDto> registration(@RequestBody UserForm form, BindingResult bindingResult, UriComponentsBuilder uriBuilder){
        //userService.save(userForm);
        User user = form.convert();
        //user.setPwd(bCryptPasswordEncoder.encode(user.getPwd()));
        userRepository.save(user);
        //return "registration works";
        URI uri = uriBuilder.path("/users/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new UserDto(user));

    }

}
