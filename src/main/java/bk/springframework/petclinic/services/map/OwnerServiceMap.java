package bk.springframework.petclinic.services.map;



import bk.springframework.petclinic.model.Owner;
import bk.springframework.petclinic.services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudServices<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public void delete(Owner object) {
        this.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

}
