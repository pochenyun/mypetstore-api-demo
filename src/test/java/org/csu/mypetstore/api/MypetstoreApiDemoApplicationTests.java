package org.csu.mypetstore.api;

import org.csu.mypetstore.api.common.CommonResponse;
import org.csu.mypetstore.api.entity.Category;
import org.csu.mypetstore.api.entity.Manager;
import org.csu.mypetstore.api.persistence.CategoryMapper;
import org.csu.mypetstore.api.persistence.ManagerMapper;
import org.csu.mypetstore.api.service.ManagerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootTest
class MypetstoreApiDemoApplicationTests
{
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private ManagerService managerService;

    @Test
    void contextLoads()
    {
        System.out.println(getManager());
    }

    @ResponseBody
    public CommonResponse<Object> getManager()
    {
        return managerService.getManager();
    }

}
