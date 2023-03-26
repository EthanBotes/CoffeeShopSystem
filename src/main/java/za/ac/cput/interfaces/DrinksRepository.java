package za.ac.cput.interfaces;
/* DrinksRepository.java
 Entity for the Drinks
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Drinks;


import java.util.HashSet;
import java.util.Set;
public class DrinksRepository implements InterfaceDrinksRepository {

    private Set<Drinks> drinksDB = null;
    private static DrinksRepository repository = null;
    private DrinksRepository(){
        drinksDB = new HashSet<Drinks>();
    }

    public static DrinksRepository getRepository(){
        if(repository == null){
            repository = new DrinksRepository();
        }
        return repository;
    }

    @Override
    public Drinks create(Drinks food) {
        return null;
    }

    @Override
    public Drinks read(String s) {
        return null;
    }

    @Override
    public Drinks update(Drinks food) {
        return null;
    }

    @Override
    public Drinks delete(Drinks food) {
        return null;
    }

    @Override
    public Set<Drinks> getAll() {
        return null;
    }

}
