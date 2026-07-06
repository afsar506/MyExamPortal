package com.exam.portal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class show {
   @GetMapping("/show")
    public String message()
    {
        return """
                Hello There, This is afsar khan, Have a good day 
                new feature added
                git bug fixed
                """;
    }
}
