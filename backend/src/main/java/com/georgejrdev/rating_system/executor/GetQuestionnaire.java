package com.georgejrdev.rating_system.executor;

import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class GetQuestionnaire implements Executor{
    
    private int id;
    private String type;

    public GetQuestionnaire(int id) {
        setId(id);
        setType("questionnaire");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "questionnaire";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}