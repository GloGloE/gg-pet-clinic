package glo.springframework.ggpetclinic.services;

import glo.springframework.ggpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
	Owner findByLastName(String lastName);
}
