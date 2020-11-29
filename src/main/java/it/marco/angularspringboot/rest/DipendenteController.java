package it.marco.angularspringboot.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.marco.angularspringboot.model.Dipendente;
import it.marco.angularspringboot.pojo.DipendentePOJO;
import it.marco.angularspringboot.repository.DipendenteRepository;
import it.marco.angularspringboot.utility.Utility;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("dipendente")
public class DipendenteController {
	@Autowired
	private DipendenteRepository dipendenteRepository;
	
	@Autowired
	private Utility utility;
	

//	public DipendenteController(@Autowired DipendenteRepository dipendenteRepository) {
//		this.dipendenteRepository = dipendenteRepository;
//	}

//	@GetMapping("/firstName")
//	public String getNameDipendente(@RequestParam String nome) {
//		return dipendenteRepository.findByName(nome);
//	}

	@GetMapping("/lastName")
	public String getCognomeDipendente(@RequestParam String cognome) {
		return dipendenteRepository.findByCognome(cognome);
	}

//	@GetMapping("{id}")
//	public Optional<Dipendente> getDipendente(@PathVariable Long id) {
//			return dipendenteRepository.findById(id);
//	}

	@GetMapping("/diplist")
	public List<Dipendente> getTuttiDipendenti() {

		return (List<Dipendente>) dipendenteRepository.findAll();
	}



	// con request param
//	@PostMapping("/aggiungiDipendente")
//	public void AggiungiStudente(@RequestParam Long id_dipendente, String matricola, String nome, String cognome,
//			Date data_di_nascita, Date data_inizio) {
//		dipendenteRepository.aggiungiDipendente(id_dipendente, matricola, nome, cognome, data_di_nascita, data_inizio);
//
//	}
//	
	// con request body
	@PostMapping("/aggiungiDipendente")
	public String AggiungiDipendente(@RequestBody Dipendente dipendente) {
		//String date = utility.getData();
		//dipendenteRepository.aggiungiDipendente(dipendente.getId_dipendente(), dipendente.getMatricola(), dipendente.getNome(), dipendente.getCognome(), dipendente.getData_di_nascita(),new Date());
		System.out.println(" ---------------->"+dipendente.getDataDiNascita());
		System.out.println(" ---------------->"+dipendente.getMatricola());
		String result="";
		try {
		result="Inserimento avvenuto correttamente";	
		
		dipendenteRepository.aggiungiDipendente( dipendente.getMatricola(), dipendente.getNome(), dipendente.getCognome(), dipendente.getDataDiNascita(),new Date());
		}
		catch(Exception e){
			System.out.println(" ---------------->"+e.toString());
			result="inserimento non andato a buon fine";
		}
		return result;
	}
	
	@DeleteMapping("/cancellaDipendente")
	public void cancellaDipendente(@RequestParam long id) {
		//repository.findById(id).orElseThrow(StudentNotFoundException::new);
		dipendenteRepository.cancellaDipendente(id);
	}
	

//	@PutMapping("/modificaDipendente")
//	public void ModificaDipendente(@RequestBody DipendentePOJO dipendente) {
//		
//		dipendenteRepository.modificaDipendente(dipendente.getMatricola(), dipendente.getNome(), dipendente.getCognome(), dipendente.getId());
//	
//	}
	@PutMapping("/modificaDipendente")
	public void ModificaDipendente(@RequestBody DipendentePOJO dipendente) {
		
		dipendenteRepository.modificaDipendente(dipendente.getMatricola(), dipendente.getNome(), dipendente.getCognome(), dipendente.getData_di_nascita(), dipendente.getId());
	
	}
	
}
