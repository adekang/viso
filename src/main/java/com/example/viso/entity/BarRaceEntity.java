package com.example.viso.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class BarRaceEntity  implements Serializable {

    /** 提交时间 **/
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date date;
    private String name;
    private String category;
    private Integer value;

    @Override
    public String toString() {
        return "BarRaceEntity{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BarRaceEntity)) return false;
        BarRaceEntity that = (BarRaceEntity) o;
        return Objects.equals(date, that.date) && Objects.equals(name, that.name) && Objects.equals(category, that.category) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, name, category, value);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
