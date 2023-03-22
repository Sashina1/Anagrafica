package it.softwareInside.AnagraficaAppLezione23.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, String>{

	
	
	
	
	@Query(value = "SELECT * FROM persona WHERE eta >= 25", nativeQuery =  true)
	
	//List<Persona> getAllPersoneMaggioriDi25(); oppure:
	Collection<Persona> getAllPersoneMaggioriDi25();
	
	
	
	
	//seleziona solo le persone sopra l'eta inserita da input
	@Query(value = "SELECT * FROM persona WHERE eta >= ?1 ", nativeQuery =  true)
	Collection<Persona> getAllPersoneMaggiori(int etaPersona);
}
