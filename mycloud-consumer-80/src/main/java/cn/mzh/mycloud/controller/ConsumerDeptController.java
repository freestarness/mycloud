package cn.mzh.mycloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.mzh.mycloud.vo.Dept;


@RestController
@RequestMapping("/consumer")
public class ConsumerDeptController {
	public static final String DEPT_GET_URL = "http://localhost:8001/dept/get/";
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping(value = "/dept/get")
	public Object get(Long id) {
		return this.restTemplate.getForObject(DEPT_GET_URL+id,Dept.class);
		
	}
}
