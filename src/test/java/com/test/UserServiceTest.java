package com.test;

import com.satellite.system.service.UserService;
import com.satellite.system.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author:yuanhu
 * @Description:
 * @Date: Created in 21:02 2019/3/21
 * @Modified By:
 */
public class UserServiceTest {

    UserService userService;
    @Before
    public void init(){
        userService = new UserServiceImpl();
    }
    @Test
    public void testLogin(){
        Integer i = userService.login("yuanhu","dd");
        System.out.println(i);
    }
}
