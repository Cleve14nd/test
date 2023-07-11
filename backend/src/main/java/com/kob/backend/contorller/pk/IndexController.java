package com.kob.backend.contorller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: IndexController
 * Package: com.kob.backend.contorller.pk
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/7/11 18:29
 * @Version 1.0
 */

@Controller
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";
    }
}
