package br.senai.rn.locadora.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.models.Filme;

@Controller
@RequestMapping("/filme")
public class FilmeController extends AbstractController<Filme>{

	@Override
	public Class<Filme> getClassType() {
		// TODO Auto-generated method stub
		return Filme.class;
	}
}
