package com.example.alb77.listcard;

/**
 * Created by alb77 on 3/14/2018.
 */

public class DataModel {

    String name;
    String version;
    int id_;
    int image;

    public DataModel(String name, String version, int id_, int image){
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;

    }

    public String getName(){
        return name;
    }

    public String getVersion(){
        return version;
    }

    public int getImage(){
        return image;
    }

    public int getId_(){
        return id_;
    }

}
