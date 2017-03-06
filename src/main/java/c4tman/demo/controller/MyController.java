package c4tman.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by C4TMAN on 2017/2/28.
 */

@RestController
public class MyController {

    @RequestMapping(value="/hello.11", method = RequestMethod.GET)
    public String hello(){
        return "hello interceptor";
    }
}
