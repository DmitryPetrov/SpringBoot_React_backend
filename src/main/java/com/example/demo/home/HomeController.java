package com.example.demo.home;

import com.example.demo.entity.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage() {
        return "forward:/index.html";
    }*/

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public AppUser getAuthorizationPage(@RequestParam(value = "userName", required = true) String userName) {
        System.out.println("---->>" + userName);

        AppUser user = new AppUser(userName);
        return user;
    }
}
