package org.bedu.agenda.dto;

public class ContactDTO {
    
    private String name;
    private String telephone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ContactDTO(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }
}
