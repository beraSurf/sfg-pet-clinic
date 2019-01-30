package guru.springframework.sfgpetclinic.model;

import java.security.acl.Owner;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocaleDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocaleDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocaleDate birthDate) {
        this.birthDate = birthDate;
    }
}
