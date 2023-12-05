package com.example.viso.entity;

import java.io.Serializable;
import java.util.Objects;

public class WordEntity implements Serializable {

    private String name;
    private Integer value;

    @Override
    public String toString() {
        return "WordEntity{" +
                "word='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordEntity)) return false;
        WordEntity that = (WordEntity) o;
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
