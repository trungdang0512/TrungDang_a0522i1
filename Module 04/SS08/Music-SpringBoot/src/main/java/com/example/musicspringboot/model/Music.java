package com.example.musicspringboot.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name= "name")
    @NotBlank
    @Size(max = 800, message = "Không vượt quá 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$",message = "Tên bài hát không đúng định dạng")
    private String name;

    @NotBlank
    @Size(max = 300, message = "Không vượt quá 300 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\s]*$",message = "Tên ca sĩ không đúng định dạng")
    private String artist;

    @NotBlank
    @Size(max = 1000, message = "Không vượt quá 1000 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\\\,]*$",message = "Không được chứa ký tự đặc biệt")
    private String type;

    private String link;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Music() {
    }

    public Music(Integer id, String name, String artist, String type, String link) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.type = type;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
