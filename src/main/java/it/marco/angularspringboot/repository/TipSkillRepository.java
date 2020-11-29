package it.marco.angularspringboot.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.marco.angularspringboot.model.Tipskill;



	public interface TipSkillRepository extends CrudRepository<Tipskill, Integer >{ 	
		
		
		// lista skill totale
		 @Modifying
	     @Transactional
		 @Query (
				value = "SELECT * FROM hrmanagement.tipskill", 
				nativeQuery = true)
		
		String findAll(long id_tip_skill);
	
	
	
}
