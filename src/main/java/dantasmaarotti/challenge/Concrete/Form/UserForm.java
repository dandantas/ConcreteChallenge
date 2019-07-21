package dantasmaarotti.challenge.Concrete.Form;

import com.fasterxml.jackson.datatype.jsr310.deser.key.LocalDateKeyDeserializer;
import dantasmaarotti.challenge.Concrete.Model.User;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class UserForm {

    @NotEmpty @NotNull @Length(min = 3)
    private String name;

    @NotEmpty @NotNull @Length(min = 4)
    private String email;

    @NotEmpty @NotNull
    private String pwd;

    @NotEmpty @NotNull
    private String phone;

    public User convert() {
        return new User(name, email, pwd, phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
