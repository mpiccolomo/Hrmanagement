package it.marco.angularspringboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.marco.angularspringboot.model.Tipskill;
import it.marco.angularspringboot.repository.TipSkillRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("tipskill")
public class TipSkillController {

	@Autowired
	private TipSkillRepository tipskillRepository;
	
	
	
	@GetMapping("/totaleskill")
	public List<Tipskill> getTutteLeSkill() {

		return (List<Tipskill>) tipskillRepository.findAll();
	}
}
