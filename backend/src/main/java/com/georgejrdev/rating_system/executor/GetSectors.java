package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class GetSectors implements Executor {
    
    private String type;
    
    public GetSectors() {
        setType("sector");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "sectors";
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
