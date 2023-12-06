package com.example.viso.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Data
@TableName("data")
public class PaperEntity implements Serializable {

    private String submitter;
    private String authors;
    private String title;
    private String journal;
    private String doi;
    private String categories;

    @TableField(value = "abstract")
    private String paperAbstract;

    private String updateDate;

    @Override
    public String toString() {
        return "PaperEntity{" +
                "submitter='" + submitter + '\'' +
                ", authors='" + authors + '\'' +
                ", title='" + title + '\'' +
                ", journal='" + journal + '\'' +
                ", doi='" + doi + '\'' +
                ", categories='" + categories + '\'' +
                ", paperAbstract='" + paperAbstract + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaperEntity)) return false;
        PaperEntity that = (PaperEntity) o;
        return Objects.equals(submitter, that.submitter) && Objects.equals(authors, that.authors) && Objects.equals(title, that.title) && Objects.equals(journal, that.journal) && Objects.equals(doi, that.doi) && Objects.equals(categories, that.categories) && Objects.equals(paperAbstract, that.paperAbstract) && Objects.equals(updateDate, that.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submitter, authors, title, journal, doi, categories, paperAbstract, updateDate);
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setPaperAbstract(String paperAbstract) {
        this.paperAbstract = paperAbstract;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
