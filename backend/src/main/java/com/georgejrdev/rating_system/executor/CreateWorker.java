package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class CreateWorker implements Executor {
    
    private String name;
    private String login;
    private String password;
    private String sector;
    private String role;
    private String type;

    public CreateWorker(String name, String sector) {
        setName(name);
        setLogin();
        setPassword();
        setSector(sector);
        setRole("worker");
        setType("user");
    }

    @Override
    public String execute() throws Exception {
        return "Worker created";
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

    public void setLogin() {
        this.login = "generate";
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword() {
        this.password = "generate";
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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