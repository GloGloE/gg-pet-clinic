package glo.springframework.ggpetclinic.services;

import glo.springframework.ggpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
	Vet findByLastName(String lastName);
	Vet findById(Long id);
	Vet save(Vet owner);
	Set<Vet> findAll();
}
