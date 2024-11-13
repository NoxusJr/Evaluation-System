package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class SendCodeToConfirmAdminAccount implements Executor {
    
    private String type;

    public SendCodeToConfirmAdminAccount() {
        setType("code");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "code";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
