package za.ac.cput.interfaces;

import za.ac.cput.domain.Barista;
import za.ac.cput.domain.Customer;

import java.util.HashSet;
import java.util.Set;

public class BaristaRepository implements InterfaceBaristaRepository {

    private Set<Barista> baristaDB = null;
    private static BaristaRepository repository = null;

    private BaristaRepository(){baristaDB = new HashSet<Barista>();}

    public static BaristaRepository getRepository(){
        if (repository == null){
            repository = new BaristaRepository();
        }
        return repository;
    }

    @Override
    public Barista create(Barista customer) {
        return null;
    }

    @Override
    public Barista read(String s) {
        return null;
    }

    @Override
    public Barista update(Barista customer) {
        return null;
    }

    @Override
    public Barista delete(Barista customer) {
        return null;
    }

    @Override
    public Set<Barista> getAll() {
        return null;
    }

}
