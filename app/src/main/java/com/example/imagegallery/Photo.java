package com.example.imagegallery;

public class Photo {
    private int id;
    private String photo_name;
    private String source_photo;

    public Photo(int id, String photo_name, String source_photo) {
        this.id = id;
        this.photo_name = photo_name;
        this.source_photo = source_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }

    public String getSource_photo() {
        return source_photo;
    }

    public void setSource_photo(String source_photo) {
        this.source_photo = source_photo;
    }
}
