package com.nm.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nm.crud.bean.Department;
import com.nm.crud.dao.DepartmentMapper;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list = departmentMapper.selectByExample(null);
		return list;
	}

}
