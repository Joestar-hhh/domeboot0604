package com.cykj.domeboot.mapper;

import com.cykj.domeboot.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    TbUser login(TbUser tbUser);
}
