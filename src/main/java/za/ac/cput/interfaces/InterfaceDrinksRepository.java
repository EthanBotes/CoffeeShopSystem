package za.ac.cput.interfaces;
/* InterfaceDrinksRespository.java
 Entity for the Drinks
 Author: Reece Bergstedt - 221075240
 Date: 22 March 2023
*/
import za.ac.cput.domain.Drinks;
import za.ac.cput.domain.Food;

import java.util.Set;

public interface InterfaceDrinksRepository extends InterfaceRepository<Drinks, String> {

    public Set<Drinks> getAll();
}
