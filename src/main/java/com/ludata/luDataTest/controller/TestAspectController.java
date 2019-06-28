package com.ludata.luDataTest.controller;


import com.ludata.luDataTest.utils.NetworkUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestAspectController {

    //记录器
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestAspectController.class);


    @RequestMapping("/Aspect/testAspact1")
    @ResponseBody
    public void testAspact1(HttpServletRequest request) throws  Exception{

        log.info("我就来了我进入到了/Aspect/testAspact1");
        log.error("错误了");
        log.error("进来就错误了");

        System.out.println("我正在执行这个内部方法开始 ");
        System.out.println("本机操作系统:"+ NetworkUtil.getOSName());
        System.out.println("本机MAC地址  :"+ NetworkUtil.getHostMacAddress());
        System.out.println("本机主板序列号  :"+ NetworkUtil.getHostMainBordNumber());
        System.out.println("本机CPU序列号  :"+ NetworkUtil.getHostCPUNumber());
        System.out.println("本机硬盘序列号  :"+ NetworkUtil.getHostDiskNumber());
        System.out.println("本机CPU线程数 :"+ NetworkUtil.getHostCPUTheadNumber());
        System.out.println("本机CPU核心数 :"+ NetworkUtil.getHostCPUCoreNumber());
        System.out.println("=============对方的信息================");
        System.out.println("对方的MAC地址  :"+ NetworkUtil.getHostMacAddress(request));
        System.out.println("我正在执行这个内部方法结束 ");
    }

}

