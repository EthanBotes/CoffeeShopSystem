package za.ac.cput.interfaces;

/*
InterfaceStaffRepository.java
Class for interfaces.InterfaceStaffRepository
Author: Ethan Andrew Botes 220101299
 */


import za.ac.cput.domain.Staff;

import java.util.Set;

public interface InterfaceStaffRepository extends InterfaceRepository<Staff, String>{
    public Set<Staff> getAll();


}
