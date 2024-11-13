package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class GetWorkers implements Executor {
    
    private String type;

    public GetWorkers() {
        setType("user");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "workers";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
