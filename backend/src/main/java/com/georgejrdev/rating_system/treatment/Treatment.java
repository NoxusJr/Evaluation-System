package com.georgejrdev.rating_system.treatment;

import com.georgejrdev.rating_system.executor.interfaces.Executor;
import com.georgejrdev.rating_system.utils.response.Response;

public class Treatment {
    
    static public Response treat(Executor executor) {
        try {
            String result = executor.execute();
            return new Response(result, 200);
        }  
        catch (Exception e) {
            return new Response(e.getMessage(), 500);
        }
    }
}