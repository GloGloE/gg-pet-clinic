package glo.springframework.ggpetclinic.model;

import java.io.Serializable;

/**
 * Created by Glo 16.1.2019.
 *
 * Simple JavaBean domain object with an id property.
 * Used as a base class for objects which need this property.
 */

public class BaseEntity implements Serializable
{
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
