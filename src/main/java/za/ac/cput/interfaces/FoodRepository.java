package za.ac.cput.interfaces;
/* FoodRepository.java
 Entity for the Food
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Food;

import java.util.HashSet;
import java.util.Set;
public class FoodRepository implements InterfaceFoodRepository {

    private Set<Food> foodDB = null;
    private static FoodRepository repository = null;
    private FoodRepository(){
        foodDB = new HashSet<Food>();
    }

    public static FoodRepository getRepository(){
        if(repository == null){
            repository = new FoodRepository();
        }
        return repository;
    }

    @Override
    public Food create(Food food) {
        return null;
    }

    @Override
    public Food read(String s) {
        return null;
    }

    @Override
    public Food update(Food food) {
        return null;
    }

    @Override
    public Food delete(Food food) {
        return null;
    }

    @Override
    public Set<Food> getAll() {
        return null;
    }

}
