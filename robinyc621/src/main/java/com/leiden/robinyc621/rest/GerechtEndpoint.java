package com.leiden.robinyc621.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leiden.robinyc621.controller.GerechtService;
import com.leiden.robinyc621.domein.Gerecht;

@RestController
public class GerechtEndpoint {
	
	@Autowired			
	GerechtService gs;	// has-a relatie met service
	
	@GetMapping("start")	
	public void herewego() {
		System.out.println("hij doet het");
		gs.slaGerechtOp(); // uit service
	}
	
	@GetMapping("beginnen")	
	public String herewego2() {
		System.out.println("hij doet het");
		return "de tekst <input> die ik teruggeef";
	}
	
	@GetMapping("allegerechten")	
	public List<Gerecht> herewego4() {
		System.out.println("hij doet het goed");
		Gerecht pizza = new Gerecht();
		Gerecht pasta = new Gerecht();
		ArrayList<Gerecht> gerechten = new ArrayList();
		gerechten.add(pizza);
		
		
		pizza.setId(1);
		pizza.setAantalIngredienten(4);
		pizza.setNaam("Pizza Funghi");
		pizza.setBereidingstijd(15);
		pizza.setOmschrijving("Pizza met champignons");
		pizza.setVegetarisch(true);

		//gs.def(pizza);
		
		gerechten.add(pasta);
		pasta.setId(1);
		pasta.setAantalIngredienten(4);
		pasta.setNaam("Pasta Carbonara");
		pasta.setBereidingstijd(15);
		pasta.setOmschrijving("Pasta met room, ei en spekjes");
		pasta.setVegetarisch(false);

		gs.def(gerechten);
		
		return gerechten;
	}
	
	@GetMapping("geefeengerecht/{eennaam}")	
	public Gerecht herewego7(@PathVariable String eennaam) {
		System.out.println("hij doet het goed " + eennaam);
		return new Gerecht();
	}
	
	@GetMapping("gerecht/{gerechtnaam}")
	public String voorhetechie(@PathVariable String gerechtnaam) {
		System.out.println("Nieuw gerecht: " + gerechtnaam);
		gs.abc(gerechtnaam);
		return "Nieuw gerecht: " + gerechtnaam;
	}
}

