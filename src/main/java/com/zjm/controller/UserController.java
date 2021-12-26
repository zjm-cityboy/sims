package com.zjm.controller;


import com.zjm.pojo.User;
import com.zjm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    //构造注入，为引用类型赋值
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String login(User user, Model model,HttpSession session) {
        System.out.println(user);
        if (userService.queryUserByUsernameAndPassword(user) == null) {
            model.addAttribute("login_error", "账号或者密码有误请重新输入");
        } else {
            // 登记登录信息,否则后面会查询信息会因为session.getAttribute("user") 等于null被拦截
            session.setAttribute("user", user);
            //登录成功重定向到登录页面
            return "redirect:/student/studentInfo";
        }
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toAddUser() {
        //  跳转到register.jsp 页面
        return "register";
    }
    @RequestMapping("/Register")
    public String addUser(User user, String password, String passwordAgain, Model model) {
        //注册时输入两次密码不一致
        if (!password.equals(passwordAgain)) {
            model.addAttribute("pattern_error", "您输入的两次密码不一致请重新输入");
            return "register";
        }
        //用户信息已经存在
        User u = userService.queryUserByUsernameAndPassword(user);
        if (u != null) {
            model.addAttribute("exist_error", "用户已存在");
            return "register";
        }
        userService.addUser(user);
        return "login";
    }

    @RequestMapping("/logout")
    public String doLogout(HttpSession session) {
        // 销毁session
        session.invalidate();
        return "login";
    }
}


