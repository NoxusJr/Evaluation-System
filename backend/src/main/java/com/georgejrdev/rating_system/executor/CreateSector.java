package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class CreateSector implements Executor {
    
    private String name;
    private String type;

    public CreateSector(String name) {
        setName(name);
        setType("sector");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "sector";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}