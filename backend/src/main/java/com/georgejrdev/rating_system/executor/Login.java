package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class Login implements Executor {
    
    private String login;
    private String password;
    private String type;
    
    public Login(String login, String password) {
        setLogin(login);
        setPassword(password);
        setType("user");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "login";
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
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}