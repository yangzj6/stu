package com.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   
   @RequestMapping("/usr/{name}")
   public String username(@PathVariable String name) {
	   
	   return "UserController   "+name+"2";
   }
	
}
