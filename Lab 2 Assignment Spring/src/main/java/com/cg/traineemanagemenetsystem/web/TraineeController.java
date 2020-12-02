package com.cg.traineemanagemenetsystem.web;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.traineemanagemenetsystem.domain.Trainee;
import com.cg.traineemanagemenetsystem.service.MapValidationErrorService;
import com.cg.traineemanagemenetsystem.service.TraineeService;

@RestController
@RequestMapping("/api/trainee")
public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewTrainee(@Valid @RequestBody Trainee trainee, BindingResult result) {
		
		ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Trainee newTrainee = traineeService.saveOrUpdate(trainee);
		return new ResponseEntity<Trainee>(newTrainee, HttpStatus.CREATED);
	}
	
	@GetMapping("/id/{traineeId}")
	public ResponseEntity<?> getTraineeById(@PathVariable int traineeId){
		return new ResponseEntity<Trainee>( traineeService.findById(traineeId),HttpStatus.OK);
	}

	@GetMapping("/name/{traineeName}")
	public Iterable<Trainee> getTraineeByName(@PathVariable String traineeName){
		return traineeService.findByName(traineeName);
	}

	@GetMapping("/all")
	public Iterable<Trainee> getAllTrainees(){
		return traineeService.findAllTrainee();
	}
	
	@DeleteMapping("/{traineeId}")
	public ResponseEntity<?> deleteTrainee(@PathVariable int traineeId){
		traineeService.deleteByTraineeId(traineeId);
		return new ResponseEntity<String> ("Trainee with Id : "+traineeId+" Deleted!",HttpStatus.OK);
	}
	
	@RequestMapping(value = "{id}",method = RequestMethod.PUT)
	public Trainee update(@PathVariable int id, @RequestBody Trainee trainee) {
		trainee.setTraineeId(id);
		//because this is a PUT, e expect all attributes to be passed in. A PATCH will only need portion of attributes.
		Trainee existingTrainee = traineeService.findById(id);
		//Here we write session_id in ignoring this attribute to be copied because that is a primary key and in session which acts as a source it is null hence cause exception when we try to update.
		BeanUtils.copyProperties(trainee, existingTrainee,"session_id");
		return traineeService.saveOrUpdate(existingTrainee);
	}
	
	@RequestMapping(value = "/updateName/{id}",method = RequestMethod.PATCH)
	public Trainee updateByName(@PathVariable int id, @RequestBody Trainee trainee) {
		//because this is a PUT, e expect all attributes to be passed in. A PATCH will only need portion of attributes.
		Trainee existingTrainee = traineeService.findById(id);
		existingTrainee.setTraineeName(trainee.getTraineeName());
		return traineeService.saveOrUpdate(existingTrainee);
	}
	
	@RequestMapping(value = "/updateDomain/{id}",method = RequestMethod.PATCH)
	public Trainee updateByDomain(@PathVariable int id, @RequestBody Trainee trainee) {
		//because this is a PUT, e expect all attributes to be passed in. A PATCH will only need portion of attributes.
		Trainee existingTrainee = traineeService.findById(id);
		existingTrainee.setTraineeDomain(trainee.getTraineeDomain());
		return traineeService.saveOrUpdate(existingTrainee);
	}
	
	
	

}
