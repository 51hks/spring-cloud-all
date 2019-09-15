package com.hks.rest;

import com.hks.comm.beans.Result;
import com.hks.rest.api.UserSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    protected UserSrv userSrv;

    @GetMapping("/ok")
    public Result<User> ok(){
        Result<User>  result = userSrv.ok();
        System.out.println(result.getData());
        return result;
    }
}
