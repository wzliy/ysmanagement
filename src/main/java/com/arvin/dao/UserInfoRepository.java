package com.arvin.dao;

import com.arvin.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

}
