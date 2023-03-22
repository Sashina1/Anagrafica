package it.softwareInside.AnagraficaAppLezione23.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.repository.PersonaRepository;
import jakarta.validation.Valid;

@Service
public class PersonaService {

	
	@Autowired
	PersonaRepository pr;
	
	
	public boolean addP(@Valid Persona persona) {
		
		try {
			pr.save(persona);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	/**
	 * cerca persona per id 
	 * da input
	 * @param codiceF
	 * @return
	 */
	public Persona findP(@Valid String codiceF) {
		
		try {
			return pr.findById(codiceF).get();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	/**
	 * cancella persona per id
	 * da input
	 * @param codiceF
	 */
	public void deleteP(@Valid String codiceF) {
		
		pr.deleteById(codiceF);
	}
	
	
	
	public Iterable<Persona> findAllP() {
		
		return pr.findAll();
	}
	
	
	/**
	 * cancella tutto database.
	 */
	public void deleteAllP() {
		
		 pr.deleteAll();
	}
	
	
	
	
	public boolean update(@Valid Persona persona) {
		
		return addP(persona);
	}
	
	
	
	
	/**
//	 * funzione che crea un ArrayList, 
//	 * e prende dal dataBase solo le persone con 
//	 * età superiore a 25 e le mette nell'ArrayList
//	 * @return
//	 */
//		public ArrayList<Persona> list(){
//		
//		ArrayList<Persona> list = new ArrayList<>();
//		try {
//			for (Persona element : findAllP()) {
//				if(element.getEta() >= 25)
//					list.add(element);
//			}
//			return list;
//			
//		} catch (Exception e) {
//			return null;
//		}
//		
//	}
//	
	
	/**
	 * funzione che torna le persone
	 *  con età maggiore di 25.
	 * @return
	 */
	public Collection<Persona> getAllPersoneMaggioriDi25(){
		try {
			return pr.getAllPersoneMaggioriDi25();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	
	
	
	/**
	 * funzione che torna le persone con
	 *  eta maggiore presa da input
	 * @param eta
	 * @return
	 */
	public Collection<Persona> getAllPersoneMaggiori(int eta){
		
		try {
			return pr.getAllPersoneMaggiori(eta);
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	
}
