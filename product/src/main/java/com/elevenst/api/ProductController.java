package com.elevenst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable String productId){
        /*
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        */
        throw new RuntimeException("I/O Exception");
        //System.out.println("call: "+productId);
        //return "[productId = " + productId + " at " + System.currentTimeMillis() + "]";
    }

}