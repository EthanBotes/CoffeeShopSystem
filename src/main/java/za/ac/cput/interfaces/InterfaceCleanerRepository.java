package za.ac.cput.interfaces;

import za.ac.cput.domain.Cleaner;
import za.ac.cput.domain.Customer;

import java.util.Set;

public interface InterfaceCleanerRepository extends InterfaceRepository<Cleaner, String> {
    public Set<Cleaner> getAll();
}
