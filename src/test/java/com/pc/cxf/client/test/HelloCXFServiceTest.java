package com.pc.cxf.client.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pc.cxf.client.HelloCXFService;

/**
 * 测试CXF服务
 * 
 * @author Switch
 * @data 2016年12月22日
 * @version V1.0
 */
public class HelloCXFServiceTest {
	ApplicationContext context = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testService() {
		// 获取代理对象
		HelloCXFService proxy = context.getBean("cfxClient", HelloCXFService.class);
		// 调用方法
		System.out.println(proxy.helloCXF("Switch"));
		System.out.println(proxy.byeCXF());
	}
}
