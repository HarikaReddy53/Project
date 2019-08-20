package com.eg.mod.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.eg.mod.repository.MentorSkillsRepository;
import com.example.demo53.mentorskills;

@RestController
@RequestMapping(value = { "/user" })
public class MentorSkillsController {

	@Autowired
	MentorSkillsRepository mentorskillrepo;

	mentorskills mentorskills = new mentorskills();

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<mentorskills> getUserById(@PathVariable("id") int id) {
		System.out.println("Fetching User with id " + id);
		mentorskills mentorskills = mentorskillrepo.findById(id);
		if (mentorskills == null) {
			return new ResponseEntity<mentorskills>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<mentorskills>(mentorskills, HttpStatus.OK);
	}

	@PostMapping(value = "/create", headers = "Accept=application/json")
	public ResponseEntity<Void> createEmployee(@RequestBody mentorskills mentorskills, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + mentorskills.getName());
		mentorskillrepo.creatementorskills(mentorskills);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/employee/{id}").buildAndExpand(mentorskills.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<mentorskills> getAllUser() {
		List<mentorskills> tasks = mentorskillrepo.getEmployee();
		return tasks;

	}

	@PutMapping(value = "/update", headers = "Accept=application/json")
	public ResponseEntity<String> updateEmployee(@RequestBody mentorskills currentEmployee) {
		mentorskills mentorskills = mentorskillrepo.findById(currentEmployee.getId());
		if (mentorskills == null) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		mentorskills.setId(currentEmployee.getId());
		mentorskills.setName(currentEmployee.getName());
		mentorskills.setCountry(currentEmployee.getCountry());
		mentorskillrepo.update(mentorskills);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<mentorskills> deleteUser(@PathVariable("id") int id) {
		mentorskills mentorskills = mentorskillrepo.findById(id);
		if (mentorskills == null) {
			return new ResponseEntity<mentorskills>(HttpStatus.NOT_FOUND);
		}
		mentorskillrepo.deleteEmployeeById(id);
		return new ResponseEntity<mentorskills>(HttpStatus.NO_CONTENT);
	}

	@PatchMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<mentorskills> updateEmployeePartial(@PathVariable("id") int id,
			@RequestBody mentorskills currentEmployee) {
		mentorskill mentorskills = mentorskillrepo.findById(id);
		if (mentorskills) == null) {
			return new ResponseEntity<mentorskills>(HttpStatus.NOT_FOUND);
		}

		employeeService.updateEmployeePartial(currentEmployee, id);
		return new ResponseEntity<mentorskills>(mentorskills, HttpStatus.OK);
	}
}
