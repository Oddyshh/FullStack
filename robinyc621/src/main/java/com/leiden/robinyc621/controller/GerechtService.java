package com.leiden.robinyc621.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leiden.robinyc621.domein.Gerecht;

@Service
public class GerechtService {
	
	@Autowired				// BeanArchitecture - automatiseren van instantieren
	GerechtRepository gr; 	// has-a relatie met repository gemaakt
	
	public void slaGerechtOp() {
		System.out.println("in gerechtservice");
		gr.save(new Gerecht());
	}
	
	public void abc(String gerechtnaam) {
		Gerecht gerecht = new Gerecht();
		gerecht.setNaam(gerechtnaam);
		gr.save(gerecht);
	}
	
	public void def(List <Gerecht> gerechten) {
		System.out.println("In service " + gerechten.size());
		for (Gerecht g: gerechten ) {
			System.out.println(g.getNaam());
		}
		gr.saveAll(gerechten);
	}
	
	public void def1(Gerecht gerecht) {
		gr.save(gerecht);
	}
}
