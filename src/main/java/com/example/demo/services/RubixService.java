package com.example.demo.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.Rubix;
import com.example.demo.repo.RubixRepository;
@Service

public class RubixService {
	
	@Autowired
	private RubixRepository rubixRepository;
	
public Optional<Rubix> saveData(Rubix rubic){
	return Optional.of(rubixRepository.save(rubic));
}
	

public List<Rubix> getAllData(){
return rubixRepository.findAll();
}

}
