package br.senai.rn.locadora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.models.Copia;


@Controller
@RequestMapping("/copia")
public class CopiaController extends AbstractController<Copia>{

	@Override
	public Class<Copia> getClassType() {
		return Copia.class;
	}
	
}

