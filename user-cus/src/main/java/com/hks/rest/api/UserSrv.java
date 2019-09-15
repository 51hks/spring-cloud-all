package com.hks.rest.api;

import com.hks.comm.beans.Result;
import com.hks.rest.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-srv" )
public interface UserSrv {

    @GetMapping("/ok")
     Result<User> ok() ;
}
