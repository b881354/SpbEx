package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Porder;

public interface PorderDao {
	//creat
	void add(Porder p);
	//read
	List<Porder> selectAll();
	
	
	void update(Porder p);
	
	List<Porder> selectById(int id);
	void delete(int id);
}
