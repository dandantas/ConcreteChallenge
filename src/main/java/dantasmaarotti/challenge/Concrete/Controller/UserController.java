package dantasmaarotti.challenge.Concrete.Controller;

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
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult){
        userService.save(userForm);
        //User user = userForm.convert();
        //user.setPwd(bCryptPasswordEncoder.encode(user.getPwd()));
        userRepository.save(userForm);
        return "registration works";
    }

}
