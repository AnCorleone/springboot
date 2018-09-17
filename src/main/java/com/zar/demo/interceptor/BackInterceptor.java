package com.zar.demo.interceptor;

import com.zar.demo.constant.AdminConstant;
import com.zar.demo.pojo.User;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/17 14:06
 * 描述     ${TODO}
 */
public class BackInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        boolean flag = true;
        final User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            flag = false;
        } else {
            // 对用户进行验证,是否正确
            if (user.getName().equals(AdminConstant.ADMIN_USER_NAME) && user.getPassword().equals(AdminConstant.ADMIN_PASSWORD)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
