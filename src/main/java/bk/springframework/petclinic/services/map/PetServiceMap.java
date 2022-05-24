package bk.springframework.petclinic.services.map;



import bk.springframework.petclinic.model.Pet;
import bk.springframework.petclinic.services.CrudServices;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudServices<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        this.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return this.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return this.findById(id);
    }
}
