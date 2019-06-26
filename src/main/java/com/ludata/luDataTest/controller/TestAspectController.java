package com.ludata.luDataTest.controller;


import com.ludata.luDataTest.utils.NetworkUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAspectController {


    @RequestMapping("/Aspect/testAspact1")
    @ResponseBody
    public void testAspact1() throws  Exception{

        System.out.println("我正在执行这个内部方法开始 ");
        System.out.println("本机操作系统:"+ NetworkUtil.getOSName());
        System.out.println("本机MAC地址  :"+ NetworkUtil.getHostMacAddress());
        System.out.println("本机主板序列号  :"+ NetworkUtil.getHostMainBordNumber());
        System.out.println("本机CPU序列号  :"+ NetworkUtil.getHostCPUNumber());
        System.out.println("本机CPU线程数 :"+ NetworkUtil.getHostCPUTheadNumber());
        System.out.println("本机CPU核心数 :"+ NetworkUtil.getHostCPUCoreNumber());
        System.out.println("我正在执行这个内部方法结束 ");
    }

}

