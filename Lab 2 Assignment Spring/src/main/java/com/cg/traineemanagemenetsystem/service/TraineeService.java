package com.cg.traineemanagemenetsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.traineemanagemenetsystem.domain.Trainee;
import com.cg.traineemanagemenetsystem.exception.TraineeIDException;
import com.cg.traineemanagemenetsystem.repository.TraineeJpaRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeJpaRepository traineeRep;
	
	public Trainee saveOrUpdate(Trainee trainee) {
		return traineeRep.saveAndFlush(trainee);
	}
	
	public List<Trainee> findByName(String traineeName){
		List<Trainee> traineeList = traineeRep.findByTraineeName(traineeName);
		if(traineeList.isEmpty()) {
			throw new TraineeIDException("No trainees available with name "+traineeName);
		}
		return traineeList;
	}
	
	public Trainee findById(int id) {
		Trainee trainee = traineeRep.findByTraineeId(id);
		if(trainee==null) {
			throw new TraineeIDException("No trainee with ID: "+id);
		}
		return trainee;
	}
	
	public Iterable<Trainee> findAllTrainee(){
		return traineeRep.findAll();
	}
	
	public void deleteByTraineeId(int id) {
		Trainee trainee = traineeRep.findByTraineeId(id);
		if(trainee==null) {
			throw new TraineeIDException("No trainee with ID: "+id);
		}
		traineeRep.deleteById(id);
	}

}
