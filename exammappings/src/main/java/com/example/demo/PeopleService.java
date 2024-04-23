package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
	@Autowired
	private PeopleRepository pr;
	
	public List<People>findPagenated(int pageNo,int pageSize){
		PageRequest p1=PageRequest.of(pageNo, pageSize);
		Page<People>p2=pr.findAll(p1);
		return p2.toList();
		
	}
	public List<People> getPeopleById(Sort sort){
		return pr.findAll();
	}
	public People create(People p) {
		return pr.save(p);
	}
	public People update(People p) {
		return pr.save(p);
	}
	public void delete(Integer id) {
	pr.deleteById(id);;
	}
}
