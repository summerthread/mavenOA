package com.summer.shoa.test;

import org.junit.Test;

/**
 * Created by p2p on 2017/8/4.
 */
public class SessionFactoryTest extends SpringUtils{
    @Test
    public void testSessionFactory(){
        context.getBean("sessionFactory");
    }
}
