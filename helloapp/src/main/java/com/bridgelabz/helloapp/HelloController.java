package com.bridgelabz.helloapp;

import com.bridgelabz.hellorest.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    // UC1

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from maha";
    }

    // UC2

    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from MAHAAAA";
    }


    //UC3
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from MAHAAAA";
    }


    //UC4
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}