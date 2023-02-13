package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PlantPlacesController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String read() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		return "index";
	}
}