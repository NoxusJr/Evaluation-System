package com.georgejrdev.rating_system.executor;

import java.util.List;
import com.georgejrdev.rating_system.executor.interfaces.Executor;

public class Rate implements Executor {
    
    private List<List<String>> rates;
    private String type;
    
    public Rate(List<List<String>> rates) {
        setRates(rates);
        setType("rate");
    }

    @Override
    public String execute() throws Exception {
        // DB Logic here
        return "rate";
    }

    public List<List<String>> getRates() {
        return rates;
    }

    public void setRates(List<List<String>> rates) {
        this.rates = rates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
