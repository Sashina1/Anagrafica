package it.softwareInside.AnagraficaAppLezione23.restController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.service.PersonaService;

@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	PersonaService ps;
	
	
	
	@PostMapping("/addP")
	public boolean addP(@RequestBody Persona persona) {
		
		return ps.addP(persona);
		
	}
	
	
	@PostMapping("/findP")
	public Persona findP(@RequestParam("cf") String codiceF) {
		
		return ps.findP(codiceF);
	}
	
	
	@DeleteMapping("/deleteP")
	public void deleteP(@RequestParam("cf") String codiceF) {
		
		ps.deleteP(codiceF);
	}
	
	
	@GetMapping("/findAllP")
	public Iterable<Persona> findAllP(){
		
		return ps.findAllP();
	}
	
	
	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		 
		ps.deleteAllP();
		
	}
	
	
	@PostMapping("/update")
	public boolean update(@RequestBody Persona persona) {
		
		return ps.addP(persona);
	}
	
	
	
//	@GetMapping("/list")
//	public ArrayList<Persona> list(){
//		
//		return ps.list();
//	}
//	
	
	
	
	
	@GetMapping("/prova")
	public Collection<Persona> getEta(){
		
		
		return ps.getAllPersoneMaggioriDi25();
	}
	
	
	
	@GetMapping("/prova2")
	public Collection<Persona> getEta2(@RequestParam("eta") int id){
		
		
		return ps.getAllPersoneMaggiori(id);
	}
	
	
}
