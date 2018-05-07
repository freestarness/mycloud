package cn.mzh.mycloud.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mzh.mycloud.mapper.DeptMapper;
import cn.mzh.mycloud.service.DeptService;
import cn.mzh.mycloud.vo.Dept;


@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	public int deleteByPrimaryKey(Long deptno) {
		// TODO Auto-generated method stub
		return deptMapper.deleteByPrimaryKey(deptno);
	}

	public int insert(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.insert(record);
	}

	public int insertSelective(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.insertSelective(record);
	}

	public Dept selectByPrimaryKey(Long deptno) {
		// TODO Auto-generated method stub
		return deptMapper.selectByPrimaryKey(deptno);
	}

	public int updateByPrimaryKeySelective(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Dept record) {
		// TODO Auto-generated method stub
		return deptMapper.updateByPrimaryKey(record);
	}
}
