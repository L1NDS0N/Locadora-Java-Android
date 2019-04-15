package br.senai.rn.locadora.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senai.rn.locadora.models.Copia;

@Service
@Transactional
public class CopiaService extends GenericService<Copia>{}
