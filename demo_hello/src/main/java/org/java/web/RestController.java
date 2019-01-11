package org.java.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by TC20021 on 2018/9/10.
 * Rest 风格接口
 */


@org.springframework.web.bind.annotation.RestController
public class RestController {
    //直接指定post请求，也有get请求
   /* @PostMapping("/url")
    public String rest(@ResponseBody Provice provice){
        return "hello";
    }*/


}
