package com.example.ietirailway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnName {
    @GetMapping
    public String returnName(){
        return "Miguel Salamanca";
    }
}
