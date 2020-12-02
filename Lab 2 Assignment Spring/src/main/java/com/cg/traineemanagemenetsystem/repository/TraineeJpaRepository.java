package com.cg.traineemanagemenetsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.traineemanagemenetsystem.domain.*;

@Repository
public interface TraineeJpaRepository extends JpaRepository<Trainee, Integer> {
	public List<Trainee> findByTraineeName(String traineeName);
	public Trainee findByTraineeId(int id);
}
