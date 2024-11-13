package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class CreateAdmin implements Executor {
    
    private String name;
    private String login;
    private String password;
    private String role;
    private String type;

    public CreateAdmin(String name, String login, String password) {
        setName(name);
        setLogin(login);
        setPassword(password);
        setRole("admin");
        setType("user");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "admin";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}