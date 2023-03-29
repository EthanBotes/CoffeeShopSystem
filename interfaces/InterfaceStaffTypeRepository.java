package za.ac.cput.interfaces;

/*
InterfaceStaffTypeRepository.java
Class for interfaces.InterfaceStaffTypeRepository
Author: Ethan Andrew Botes 220101299
 */



import za.ac.cput.domain.Staff;
import za.ac.cput.domain.StaffType;

import java.util.Set;

public interface InterfaceStaffTypeRepository {
    public Set<StaffType> getAll();



}
