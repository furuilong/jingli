package cn.bdqn.task.controller;

import cn.bdqn.task.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsynController {


    //hello 我的


    @Autowired
    AsynService asynService;
    @GetMapping("/hello")
    public  String hello(){
        asynService.hello();
      return "success";
    }



}
