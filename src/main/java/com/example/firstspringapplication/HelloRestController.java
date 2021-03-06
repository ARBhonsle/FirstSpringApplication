package com.example.firstspringapplication;


import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    private static Logger log = org.slf4j.LoggerFactory.getLogger(HelloRestController.class);
    // localhost:8080/hello
    // localhost:8080/hello/
    // localhost:8080/hello/message
    // localhost:8080/hello/home
    @RequestMapping(value = {"", "/", "/message", "/home"})
    public String sayHello() {
        return "Hello Bridgelabz";
    }

    // localhost:8080/hello/query?name=Alex
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // localhost:8080/hello/getRequestParamInQuery?fname=Alex&lname=Ben
    @RequestMapping(value = {"/getRequestParamInQuery"}, method = RequestMethod.GET)
    public String sayHelloName(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname) {
        return "Hello " + fname + " " + lname + "!";
    }

    // localhost:8080/hello/getQuery?fname=Alex&lname=Ben
    @RequestMapping(value = {"/getQuery"}, method = RequestMethod.GET)
    public String sayHelloTest(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname) {
        return "Hello " + fname + " " + lname + "!";
    }

    // localhost:8080/hello/param/Alex
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // localhost:8080/hello/paramTest/Alex
    @GetMapping("/paramTest/{name}")
    public String sayHelloParamTest(@PathVariable(required = false) String name) {
        return "Hello " + name + "!";
    }

    // http://localhost:8080/hello/put/Alex?lastName=Ben
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }

    // localhost:8080/hello/post
    //  JSON body
    //  {
    //    "firstName" : "Alex",
    //    "lastName" : "Ben"
    //  }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    // localhost:8080/hello/put/Student
    //  JSON body
    //  {
    //    "name" : "Alex",
    //    "rollNo" : 12,
    //    "isActive" : false
    //  }
    @PutMapping("/putStudent")
    public String sayHelloStudent(@RequestBody Student student){
        // System.out.println(student.display());
        log.info(student.display());
        return "Hello "+ student.display();
    }

}
