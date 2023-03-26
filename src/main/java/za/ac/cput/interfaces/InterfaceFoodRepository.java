package za.ac.cput.interfaces;
/* InterfaceFoodRepository.java
 Entity for the Food
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Food;

import java.util.Set;

public interface InterfaceFoodRepository extends InterfaceRepository<Food, String> {

    public Set<Food> getAll();
}
