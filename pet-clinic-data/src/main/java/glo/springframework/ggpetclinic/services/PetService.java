package glo.springframework.ggpetclinic.services;

import glo.springframework.ggpetclinic.model.Pet;

import java.util.Set;

public interface PetService
{
	Pet findByLastName(String lastName);
	Pet findById(Long id);
	Pet save(Pet owner);
	Set<Pet> findAll();
}
