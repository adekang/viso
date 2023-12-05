package com.example.viso.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SunburstEntity implements Serializable {

    private String name;
    private Integer value;


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value=" + value +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SunburstEntity)) return false;
        SunburstEntity that = (SunburstEntity) o;
        return Objects.equals(name, that.name) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
}
