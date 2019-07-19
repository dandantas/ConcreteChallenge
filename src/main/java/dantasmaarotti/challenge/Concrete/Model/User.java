package dantasmaarotti.challenge.Concrete.Model;

import java.time.LocalDateTime;

public class User {
    private String name;
    private String email;
    private String pwd;
    private String phones;


    private Long id;
    private LocalDateTime created;
    private LocalDateTime modified;
    private LocalDateTime last_login;
    

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

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }
}
