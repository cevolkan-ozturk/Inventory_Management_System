package com.cronycommunity.inventorymanagementsystem.api;

import java.util.Objects;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cronycommunity.inventorymanagementsystem.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.cronycommunity.inventorymanagementsystem.business.LoginService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
    private LoginService userService;


    @PostMapping("/login")
    public String login(@RequestBody User user ) {

     User oauthUser = userService.login(user.getLoginName(), user.getParola());
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "index";

     } else {
     return "login";
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
        return "redirect:/login";
    }
    
}
