package com.example.viso.entity;

import java.io.Serializable;
import java.util.Objects;

public class ForceNodeEntity implements Serializable {
    String name;
    Integer value;

    @Override
    public String toString() {
        return "ForceNodeEntity{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForceNodeEntity)) return false;
        ForceNodeEntity that = (ForceNodeEntity) o;
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
