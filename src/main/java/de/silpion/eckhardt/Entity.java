package de.silpion.eckhardt;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@javax.persistence.Entity

public class Entity extends PanacheEntity {
    public String name;
    public String address;
}
