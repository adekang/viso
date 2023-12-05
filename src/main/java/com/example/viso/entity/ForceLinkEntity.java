package com.example.viso.entity;

import java.io.Serializable;
import java.util.Objects;

public class ForceLinkEntity implements Serializable {
    private String source;
    private String target;
    private Integer value;

    @Override
    public String toString() {
        return "ForceLinkEntity{" +
                "source='" + source + '\'' +
                ", target='" + target + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForceLinkEntity)) return false;
        ForceLinkEntity that = (ForceLinkEntity) o;
        return Objects.equals(source, that.source) && Objects.equals(target, that.target) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, value);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
