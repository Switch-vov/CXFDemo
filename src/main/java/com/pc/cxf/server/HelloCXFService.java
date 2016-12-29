package com.pc.cxf.server;

import javax.jws.WebService;

/**
 * CXF的入门服务接口
 * 
 * @author Switch
 * @data 2016年12月22日
 * @version V1.0
 */
// 在接口上加上该注解，表明该接口注册为一个Web Service
@WebService
public interface HelloCXFService {
	/**
	 * 入门服务一
	 * @param name 随便一个名字
	 * @return 
	 */
	public String helloCXF(String name);
	/**
	 * 入门服务二
	 * @return
	 */
	public String byeCXF();
}
