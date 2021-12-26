package com.zjm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//检测用户身份的拦截器
//拦截目标对象：springmvc handler
public class CheckUserInterceptor implements HandlerInterceptor {

    // 该方法是在进入handler之前执行
    // 返回true：可以进入到handler中
    // 返回false：不放行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 获取session
        HttpSession session = request.getSession();

        // 获取资源的路径
        String path = request.getRequestURI();
        // 获取login的资源路径，再使用idexof函数，查找是否有login这个字符串（如果无就返回-1），因此只要其不等于-1就证明有。
        // 然后对login不进行拦截，防止陷入登录死循环
        if (path.indexOf("login") != -1) {
            System.out.println(path);
            return true;
        }
        //获取Register的资源路径，对注册页面进行放行，防止注册页面请求被拦截
        if (path.indexOf("Register") != -1) {
            System.out.println(path);
            return true;
        }
        //注销的时候或者关闭服务器和等待时间过长的时候。session会注销。
        // 这个用于判断session是存在，如果不存在证明session过期或者注销了。
        if (session.getAttribute("user") != null) {
            System.out.println(session.getAttribute("user"));
            return true;
        } else {
            // 转发到login.jsp页面
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
    }

    /*
     * 该方法是在执行handler之后执行 ，执行return之前执行 应用场景：有必要修改ModelAndView数据时，执行该方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv)
            throws Exception {

    }

    /*
     * 该方法是在执行handler之后执行，执行return之后执行 应用场景：查看异常信息
     *
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}