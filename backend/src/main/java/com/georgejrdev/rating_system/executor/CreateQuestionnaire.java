package com.georgejrdev.rating_system.executor;

import java.util.List;
import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class CreateQuestionnaire implements Executor {
    
    private String name;
    private List<String> questions;
    private String type;

    public CreateQuestionnaire(String name, List<String> questions) {
        setName(name);
        setQuestions(questions);
        setType("questionnaire");
    }

    @Override
    public String execute() throws Exception {
        return "Questionnaire created";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}