package guru.springframework.sfgpetclinic.service;

import java.security.acl.Owner;
import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();
}
