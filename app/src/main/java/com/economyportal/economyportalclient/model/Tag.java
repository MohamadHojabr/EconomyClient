package com.economyportal.economyportalclient.model;

/**
 * Created by mohamad on 10/31/2016.
 */

public class Tag {


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    String Name;
    Integer Id;
    public Tag(String name, Integer id, String s) {
        this.Name = name;
        this.Id = id;

    }
    @Override
    public String toString() {
        return("id is  : " + Id + "name is : "+ Name);
    }
}
