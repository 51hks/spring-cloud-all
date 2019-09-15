package com.hks.rest;

import com.hks.comm.beans.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/ok")
    public Result<User> ok(){
        Result<User> r  = new Result<>();
        User user = new User();
        user.setId(1);
        user.setUserName("admin");
        r.setData(user);
        return r;
    }
}
