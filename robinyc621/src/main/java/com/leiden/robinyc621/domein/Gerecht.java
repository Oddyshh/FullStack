package com.leiden.robinyc621.domein;

//import java.time.LocalDateTime;
//import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Gerecht {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int aantalIngredienten;
	private String naam;
	private String omschrijving;
	private boolean vegetarisch;
	//private LocalDateTime tijd;
	//private LocalDate dag;
	private int bereidingstijd;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAantalIngredienten() {
		return aantalIngredienten;
	}
	public void setAantalIngredienten(int aantalIngredienten) {
		this.aantalIngredienten = aantalIngredienten;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public boolean isVegetarisch() {
		return vegetarisch;
	}
	public void setVegetarisch(boolean vegetarisch) {
		this.vegetarisch = vegetarisch;
	}
	public int getBereidingstijd() {
		return bereidingstijd;
	}
	public void setBereidingstijd(int bereidingstijd) {
		this.bereidingstijd = bereidingstijd;
	}
	
	
	

}
