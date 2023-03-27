package za.ac.cput.interfaces;

import za.ac.cput.domain.Barista;

import java.util.Set;

public interface InterfaceBaristaRepository extends InterfaceRepository<Barista, String> {

    public Set<Barista> getAll();

}
