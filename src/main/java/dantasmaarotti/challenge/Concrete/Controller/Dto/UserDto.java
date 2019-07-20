package dantasmaarotti.challenge.Concrete.Controller.Dto;

import dantasmaarotti.challenge.Concrete.Model.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String pwd;
    private String phones;
    private LocalDateTime created;

    public UserDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.pwd = user.getPwd();
        this.phones = user.getPhones();
        this.created = user.getCreated();
    }



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhones() {
        return phones;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public static List<UserDto> convert(List<User> users){
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }
}
