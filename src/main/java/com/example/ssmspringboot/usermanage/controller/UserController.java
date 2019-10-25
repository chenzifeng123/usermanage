package com.example.ssmspringboot.usermanage.controller;

import com.example.ssmspringboot.usermanage.dao.UserMapper;
import com.example.ssmspringboot.usermanage.po.User;
import com.example.ssmspringboot.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpSession;
import java.util.List;

//用户控制器类
@Controller
public class UserController {
    /*//依赖注入
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/listUser")
    public String listUser(Model model) {
        //调用dao层
        User user = userMapper.selectUserByName("wx");
        List<User> users=userMapper.findAll();
        model.addAttribute("users", users);
        return "listUser";
    }*/


    //依赖注入
    @Autowired
    private UserService userService;
    //用户登录
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String usercode, String password, Model model, HttpSession session){
        //通过账号密码查询用户
        User user = userService.findUser(usercode,password);
        if(user != null) {
            //将用户对象添加道Session
            session.setAttribute("USER_SESSION",user);
            //跳转到主页面
            return "customer";
        }

        model.addAttribute("msg","账号密码错误，请重新输入！");
        return "login";
    }

    //模拟其他类中跳转到客户管理页面的方法
    @RequestMapping(value = "/toCustomer.action")
    public String toCustomer(){
        return "customer";
    }
    /**
     *退出登录
     */
    @RequestMapping(value ="/logout.action")
    public String logout(HttpSession session) {
        //消除 Session
        session.invalidate();
        //重定向到登录页面的眺转方法
        return "redirect:login.action" ;
    }
    /**向用户登录页面跳转 */
    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

}
