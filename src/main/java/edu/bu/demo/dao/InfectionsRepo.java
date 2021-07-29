package edu.bu.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import edu.bu.demo.model.Infections;

import java.util.List;

public interface InfectionsRepo extends JpaRepository<Infections,Integer>
{
	

	
}
