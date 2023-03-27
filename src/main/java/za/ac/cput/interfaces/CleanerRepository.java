package za.ac.cput.interfaces;

import za.ac.cput.domain.Cleaner;

import java.util.HashSet;
import java.util.Set;

public class CleanerRepository implements InterfaceCleanerRepository {

    private Set<Cleaner> cleanerDB = null;
    private static CleanerRepository repository = null;
    private CleanerRepository(){
        cleanerDB = new HashSet<Cleaner>();
    }

    public static CleanerRepository getRepository(){
        if(repository == null){
            repository = new CleanerRepository();
        }
        return repository;
    }


    @Override
    public Cleaner create(Cleaner cleaner) {
        return null;
    }

    @Override
    public Cleaner read(String s) {
        return null;
    }

    @Override
    public Cleaner update(Cleaner cleaner) {
        return null;
    }

    @Override
    public Cleaner delete(Cleaner cleaner) {
        return null;
    }

    @Override
    public Set<Cleaner> getAll() {
        return null;
    }
}
