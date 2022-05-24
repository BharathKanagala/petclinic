package bk.springframework.petclinic.services.map;



import bk.springframework.petclinic.model.Vet;
import bk.springframework.petclinic.services.CrudServices;

import java.util.Set;

public class VerServiceMap extends AbstractMapService<Vet, Long> implements CrudServices<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return this.findAll();
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        this.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return this.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return this.findById(id);
    }
}
