package dantasmaarotti.challenge.Concrete.Form;

import dantasmaarotti.challenge.Concrete.Model.User;
import dantasmaarotti.challenge.Concrete.Repository.UserRepository;
import org.apache.tomcat.jni.Local;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class UpdateUserForm {

    @NotEmpty
    @NotNull
    @Length(min = 3)
    private String name;

    @NotEmpty @NotNull @Length(min = 4)
    private String email;

    @NotEmpty @NotNull
    private String pwd;

    @NotEmpty @NotNull
    private String phone;


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

    public User update(Long id, UserRepository userRepository) {
        User user = userRepository.getOne(id);

        user.setName(this.name);
        user.setEmail(this.email);
        user.setPwd(this.pwd);
        user.setPhones(this.phone);
        user.setModified(LocalDateTime.now());

        return user;
    }
}
