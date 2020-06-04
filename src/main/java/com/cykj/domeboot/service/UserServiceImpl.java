package com.cykj.domeboot.service;


import com.cykj.domeboot.entity.TbUser;
import com.cykj.domeboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resources;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TbUser userLogin(TbUser tbuser) {
        return userMapper.login(tbuser);
    }
}
