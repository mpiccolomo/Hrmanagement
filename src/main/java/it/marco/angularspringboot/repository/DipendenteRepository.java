package it.marco.angularspringboot.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import it.marco.angularspringboot.model.Dipendente;

public interface DipendenteRepository extends CrudRepository<Dipendente, Integer >{ 
	
	
	//cerca dipendente per cognome 
	@Query(
			value = "SELECT * FROM hrmanagement.dipendente WHERE dipendente.cognome = ?", 
			nativeQuery = true)
	
	String   findByCognome(String cognome);
	
	//cerca dipendente per id
	@Query (
			value = "SELECT * FROM hrmanagement.dipendente WHERE dipendente.id = ?", 
			nativeQuery = true)
	
	String findById(long id);
	
	// lista dipendenti totale
	@Query (
			value = "SELECT * FROM hrmanagement.dipendente", 
			nativeQuery = true)
	
	String findAll(long id_dipendente);
	
	

    //metodo inserisci dipendente
	 @Modifying
     @Transactional
     @Query(
    	    value =  "INSERT INTO hrmanagement.dipendente ( matricola, nome, cognome, data_di_nascita, data_inizio) values (?,?,?,?,?)", 
    	    nativeQuery = true)
	 public void aggiungiDipendente( String matricola,String nome, String cognome, Date data_di_nascita, Date data_inizio);	

	 //Metodo cancella dipendente
	 @Modifying
	 @Transactional
	 @Query(
		    value = "DELETE FROM hrmanagement.dipendente WHERE id=?", 
		    nativeQuery = true)
		public void cancellaDipendente(long id);


	//metodo per modificare un dipendente
		 @Modifying
		 @Transactional
		 @Query(
			    value = "UPDATE hrmanagement.dipendente SET matricola=?, nome=?, cognome=?, data_di_nascita=?  WHERE id=?",
			     nativeQuery = true)
			public void modificaDipendente(String matricola, String nome, String cognome, Date data_di_nascita, long id);

}


