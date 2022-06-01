package com.cxd.service.impl;

import com.cxd.dao.system.SysUserMapper;
import com.cxd.entity.system.SysUser;
import com.cxd.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cxd
 * @description:
 * @create: 2022-06-01 08:06
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(Integer id) {
        return null;
    }
}
