package com.arvin.controller;

import com.arvin.model.UserInfo;
import com.arvin.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello ,spring boot";
    }

    @PostMapping(value = "/addUserInfo")
    public void addUserInfo(UserInfo userInfo){
        //userInfoRepository.save(userInfo);
    }

    @GetMapping(value = "/getAllUser")
    public List addUserInfo(){
        return userInfoService.getAllUser();
    }
}
