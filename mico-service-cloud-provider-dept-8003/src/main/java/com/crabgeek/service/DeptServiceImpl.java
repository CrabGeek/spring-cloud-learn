package com.crabgeek.service;

import com.crabgeek.entity.Dept;
import com.crabgeek.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: eurekademo
 * @description:
 * @author: Guipeng.Xie
 * @create: 2022-06-18 16:00
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}
