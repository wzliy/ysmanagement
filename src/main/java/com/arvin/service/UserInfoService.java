package com.arvin.service;

import com.arvin.dao.UserInfoRepository;
import com.arvin.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userInfoService")
public class UserInfoService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    public List<UserInfo> getAllUser(){
        return userInfoRepository.findAll();
    }
}
