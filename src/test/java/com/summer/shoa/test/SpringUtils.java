package com.summer.shoa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by p2p on 2017/8/4.
 */
public class SpringUtils {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }
}
