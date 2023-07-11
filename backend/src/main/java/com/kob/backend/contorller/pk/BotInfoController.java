package com.kob.backend.contorller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: BotInfoController
 * Package: com.kob.backend.contorller.pk
 * Description:
 *
 * @Author Cleve14nd
 * @Create 2023/7/11 18:48
 * @Version 1.0
 */

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public String getBotinfo(){
        return "test test";
    }

}
