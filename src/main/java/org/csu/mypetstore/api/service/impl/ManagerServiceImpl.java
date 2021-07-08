package org.csu.mypetstore.api.service.impl;

import org.csu.mypetstore.api.common.CommonResponse;
import org.csu.mypetstore.api.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService
{
    @Autowired
    private ManagerService managerService;

    @Override
    public CommonResponse getManager()
    {
        return CommonResponse.createForLogin("管理员登录");
    }
}
