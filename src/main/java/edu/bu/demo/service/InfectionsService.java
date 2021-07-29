package edu.bu.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bu.demo.dao.InfectionsRepo;
import edu.bu.demo.model.Infections;
@Service
public class InfectionsService {
	@Autowired
	InfectionsRepo repo;

	
	
	@RequestMapping("/infections/{countryCode}")
	public Optional<Infections> getInfection(@PathVariable("countryCode")int countryCode)
	{
		return repo.findById(countryCode);
		
	}
	
	@PostMapping(path="/infections",consumes= {"application/json"})
	public Infections addInfection(@RequestBody Infections infection)
	{
		repo.save(infection);
		return infection;
	}
	@GetMapping(path="/infections")
	public List<Infections> getInfections()
	{
		return repo.findAll();
			
	}
	@PutMapping(path="/infections",consumes= {"application/json"})
	public Infections saveOrUpdateInfection(@RequestBody Infections infection)
	{
		repo.save(infection);
		return infection;
	}
	

}
