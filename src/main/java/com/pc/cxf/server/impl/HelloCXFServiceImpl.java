package com.pc.cxf.server.impl;

import com.pc.cxf.server.HelloCXFService;

/**
 * CXF的入门服务接口实现类
 * 
 * @author Switch
 * @data 2016年12月22日
 * @version V1.0
 */
public class HelloCXFServiceImpl implements HelloCXFService {

	@Override
	public String helloCXF(String name) {
		return "Hello " + name;
	}

	@Override
	public String byeCXF() {
		return "bye";
	}

}
