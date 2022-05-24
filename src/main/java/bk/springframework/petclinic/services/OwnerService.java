package bk.springframework.petclinic.services;


import bk.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner, Long>{

    Owner findByLastName(String lastName);


}
