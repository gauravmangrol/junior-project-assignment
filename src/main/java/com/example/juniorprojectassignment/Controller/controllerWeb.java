package com.example.juniorprojectassignment.Controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
@RequestMapping("/api/users/")
public class controllerWeb {
    String[] user = {"User A", "User B", "User C", "User D", "User E", "User F", "User G", "User H", "User I", "User J", "User K", "User L", "User M", "User N", "User O", "User P", "User Q", "User R", "User S", "User T", "User U", "User V", "User W", "User X", "User Y", "User Z"};
    String username = "username";
    String password="D$V$L08";

    //  task one
    @GetMapping
    public String[] getUser() {
        return user ;
    }

    // task two
    @GetMapping({"/{id}"})
    public ResponseEntity getUserById(@PathVariable int id){
        return new ResponseEntity<>(user[id-1], HttpStatus.OK);
    }

    //    @PostMapping({"/login"})
//    public ResponseEntity login(@RequestBody String uname, @RequestBody String pwd){
//        System.out.println(uname+" "+pwd);
//        if(password.equals(pwd))
//            return new ResponseEntity<>(uname, HttpStatus.OK);
//        else
//            return new ResponseEntity<>("invalid", HttpStatus.BAD_REQUEST);
//    }

}


