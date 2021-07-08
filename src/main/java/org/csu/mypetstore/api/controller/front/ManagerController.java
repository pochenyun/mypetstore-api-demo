package org.csu.mypetstore.api.controller.front;

import org.csu.mypetstore.api.common.CommonResponse;
import org.csu.mypetstore.api.entity.Order;
import org.csu.mypetstore.api.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController
{
    @Autowired
    private ManagerService managerService;

    @GetMapping("")
    @ResponseBody
    public CommonResponse getManager()
    {
        return managerService.getManager();
    }

    @GetMapping("/{token}/orders")
    @ResponseBody
    public CommonResponse<List<Order>> getManagerOrders(@PathVariable("token") String token)
    {
        return null;
    }
}
