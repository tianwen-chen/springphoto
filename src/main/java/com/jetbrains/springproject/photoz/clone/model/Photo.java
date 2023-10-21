package com.jetbrains.springproject.photoz.clone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("PHOTOZ")
public class Photo {

    @Id
    private Integer id;

    @NotEmpty
    private String fileName;

    private String contentType;

    @JsonIgnore
    private byte[] data;

    // raw data

    public Photo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.valueOf(id);
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setFileName(String originalFilename) {
        this.fileName = originalFilename;
    }

    public String getFileName() {
        return this.fileName;
    }
}
