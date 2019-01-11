package org.java.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by TC20021 on 2018/9/10.
 */
@Controller
public class sampleController {
  /*  @Autowired
     String hello;*/

  /*  @RequestMapping(value="/hi")
    @ResponseBody
    public String test(){
        return hello;
    }*/

    @GetMapping("/temp")
    public String test1(HttpServletRequest request){
        request.setAttribute("key","Hi,nice to meet you");
        return "index";
    }

}
