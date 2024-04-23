package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
		@Autowired
		private PeopleService ps;
		@GetMapping("/people")
		public List<People>getAllPeople(@PathVariable int pageNo,@PathVariable int pageSize){
			return ps.findPagenated(pageNo, pageSize);
		}
		@GetMapping("/sorting")
		public List<People>getPeopleById(@PathVariable String s){
			Sort sort=Sort.by(s);
			return ps.getPeopleById(sort);
		}
		@PostMapping("/people")
		public People create(@RequestBody People p) {
			return ps.create(p);
		}
		@PutMapping("/people/{id}")
		public People update(@RequestBody People p) {
			return ps.update(p);
		}
		@DeleteMapping("/people/{id}")
		public void delete(@PathVariable Integer id) {
		ps.delete(id);
		}
}
