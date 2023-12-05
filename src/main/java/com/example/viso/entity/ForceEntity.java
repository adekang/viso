package com.example.viso.entity;

import java.util.List;
import java.util.Objects;

public class ForceEntity {
    List<ForceLinkEntity> link;
    List<ForceNodeEntity> node;

    @Override
    public String toString() {
        return "ForceEntity{" +
                "link=" + link +
                ", node=" + node +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForceEntity)) return false;
        ForceEntity force = (ForceEntity) o;
        return Objects.equals(link, force.link) && Objects.equals(node, force.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, node);
    }

    public List<ForceLinkEntity> getLink() {
        return link;
    }

    public void setLink(List<ForceLinkEntity> link) {
        this.link = link;
    }

    public List<ForceNodeEntity> getNode() {
        return node;
    }

    public void setNode(List<ForceNodeEntity> node) {
        this.node = node;
    }
}
