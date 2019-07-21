package dantasmaarotti.challenge.Concrete.Controller;

import dantasmaarotti.challenge.Concrete.Form.LoginForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public ResponseEntity<?> login(@RequestBody @Valid LoginForm form){
        System.out.println(form.getEmail());
        System.out.println(form.getPwd());

        return ResponseEntity.ok().build();

    }
}
