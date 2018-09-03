package org.sxuns.spring.capter5.spitter.vo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
    private Long id;
    @NotNull
    @Size(min = 1,max = 20)
    private String firstName;
    @NotNull
    @Size(min = 1,max = 20)
    private String lastName;
    @NotNull
    @Size(min = 5,max = 20)
    private String userName;
    @NotNull
    @Size(min = 5,max = 20)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
