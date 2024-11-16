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

    private String generateRandomValue() {
        StringBuilder randomValue = new StringBuilder();
        String[] characters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
        "w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X",
        "Y","Z","0","1","2","3","4","5","6","7","8","9","-","_","."};
    
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * characters.length);
            randomValue.append(characters[random]);
        }
    
        String value = randomValue.toString();
        return value;
    }
    
    private boolean checkIfUnique(String value) {
        return true;
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
        String login;

        do {
            login = generateRandomValue();
        } while (!checkIfUnique(login));
        
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword() {
        this.password = generateRandomValue();
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