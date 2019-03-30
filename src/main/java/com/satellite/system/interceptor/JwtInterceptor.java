package com.satellite.system.interceptor;

import com.satellite.system.bean.TUserDict;
import com.satellite.system.service.UserDictService;
import com.satellite.system.service.UserService;
import com.satellite.system.service.impl.UserDictServiceImpl;
import com.satellite.system.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserDictService userDictService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        String token = request.getHeader("token");
        if (token == null) {
            response.setStatus(401);
            return true;
        }

        String account = JwtUtil.getAccount(token);
        TUserDict userDict = userDictService.getToken(token);
        if(userDict == null){
            response.setStatus(401);
            return true;
        }
        String tokenId = userDict.getToken();
        boolean isExpire = JwtUtil.checkToken(token, account);

        if (tokenId == null || !tokenId.equals(token) || !isExpire) {
            response.setStatus(401);
            return true;
        }
        return true;
    }
}
