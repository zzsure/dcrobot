package com.az.dcrobot.bitcoin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzsure
 * @date 2022/05/27
 */
@RestController
public class BitcoinController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
