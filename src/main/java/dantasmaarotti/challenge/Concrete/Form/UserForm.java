package dantasmaarotti.challenge.Concrete.Form;

import dantasmaarotti.challenge.Concrete.Model.User;

public class UserForm {

    private String name;
    private String email;
    private String pwd;
    private String phone;


    public User convert() {
        return new User(getName(), getEmail(), getPwd(), getPhone());
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
