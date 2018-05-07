package cn.mzh.mycloud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mzh.mycloud.service.DeptService;
import cn.mzh.mycloud.vo.Dept;

@RestController
@RequestMapping("/dept")
public class DeptRest {
	@Autowired
	DeptService deptService;
	@RequestMapping(value = "/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.deptService.selectByPrimaryKey(id);
		
	}
}
