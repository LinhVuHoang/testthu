package com.example.hello_servlet.enity;

import com.example.hello_servlet.annotation.Column;
import com.example.hello_servlet.annotation.Id;
import com.example.hello_servlet.annotation.Table;

import java.sql.SQLData;

@Table
public class Food {
    @Id(autoIncrement = true)
    private int id;
    @Column()
    private String name;
    @Column
    private String thumbnail;
    @Column
    private String description;
    @Column
    private double price;
    @Column
    private String status;

    public Food() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Food(int id, String name, String thumbnail, String description, double price, String status) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.description = description;
        this.price = price;
        this.status = status;
    }
}
