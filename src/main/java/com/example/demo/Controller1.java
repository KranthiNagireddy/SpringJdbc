package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller1 {
    @Autowired
    JdbcTemplate jdbc;
    //jdbc variable will be initialized by the spring container automatically by autoWired(dependancy injection)
    
    @RequestMapping("/")
    public String welcome() {
        //jdbc.execute("insert into webuser (id,name) values ('100','abcd@1')");
        return "Welcome to jdbc program";    
    }
    @RequestMapping("/add")
    public String addRecord() {
        jdbc.execute("insert into demo(id,name) values ('101','qwer@123')");
        return "New web user added into the database table";    
    }
}