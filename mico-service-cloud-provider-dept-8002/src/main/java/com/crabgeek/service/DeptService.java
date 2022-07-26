package com.crabgeek.service;

import com.crabgeek.entity.Dept;

import java.util.List;

public interface DeptService {

    Dept get(Integer deptNo);

    List<Dept> selectAll();
}
