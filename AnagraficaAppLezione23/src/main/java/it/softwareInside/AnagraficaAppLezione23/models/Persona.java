package it.softwareInside.AnagraficaAppLezione23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {

	
	
	
	@Id @Size( min = 5, max = 5, message = "violazione in codice fiscale")
	private String codiceF;
	
	
	
	@NotEmpty(message =  " la stringa nn può essere vuota")
	@NotNull(message= "la stringa nn può essere nulla")
	private String nome, cognome;
	
	
	
	
	@Min(value = 15)
	private int eta;
	
	
	
	
	
	
	
}
