package ch.noseryoung.demo.domain.user.dto;

public class UserDTO {

    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public UserDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDTO setUsername(String username) {
        this.username = username;
        return this;
    }
}
