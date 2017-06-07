package Controll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Service.*;
import Model.*;
/**
 * Created by mazhanfeng on 2017/3/22.
 */
@Controller
@RequestMapping(value="/hello",method = RequestMethod.GET)
public class hello {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String SayHello()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        UserServicesImpl service=(UserServicesImpl) ctx.getBean("userService");
        User u=new User();
        u.SetUserName("mazhanfeng");
        u.Setpassword("123456");
        return service.add(u);
    }
}
