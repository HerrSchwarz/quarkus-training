package de.silpion.eckhardt;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.util.Date;

@javax.persistence.Entity

public class Entity extends PanacheEntity {
    public String name;
}
