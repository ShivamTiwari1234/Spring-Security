package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.models.MyUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public String getstringDemo(){
        return "hello i am a demo String";
    }
    //Generated Password: aa5e88cf-96e3-483b-9ede-a7f6c1764792
    //new password: de44a974-40f9-44e5-a689-b3ab30747e3d

    //Jsessionid stored on browser(generated by browser/postman): 9D757B216DA20D6B0947129A83446F47
    //Jsessionid after login(generated by spring): C35024B75E608BDC6E077E90421AA49E

//    Request Comes to Backend:
//    1) JSESSIONID sent is of Unauthenticated session/user:
//        BE: verifies the session id and redirectes to /login api
//        FE: Browser calls /login api and backend returns the html code for login page
//        FE: Adds the credentials in login page and calls /login getApi
//        BE: verify the credentials based on username and password and generates new authenticated
//            JSESSIONID and pass it in the response headers as cookies
//        FE: Uses this new authenticated JSESSIONID for all the subsequent api calls
//    2) JSESSIONID sent is of authenticated session/user:
//            BE: verifies the session id and return the response of requested resource

//    @PostMapping("/developercode")
//    public String getDeveloperCode() {
//
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        MyUser myUser = (MyUser) authentication.getPrincipal();
//        return "Welcome "+myUser.getEmail()+"! I am executing developer code!";
//    }
    @PostMapping("/developerCode")
    public String getDeveloperCode(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUser myUser = (MyUser) authentication.getPrincipal();
        return "Welcome "+myUser.getEmail()+"! I am executing developer code!";
    }

    @GetMapping("/qacode")
    public String getQaCode() {
        return "Hello! I am executing qa code!";
    }

    @GetMapping("/technicalCode")
    public String getTechnicalCode() {
        return "Hello! I am executing technical code!";
    }

    @GetMapping("/generalCode")
    public String getGeneralCode() {
        return "Hello! I am executing general code!";
    }

    @GetMapping("/home")
    public String getHome() {
        return "Hello! I am executing home page code!";
    }

}