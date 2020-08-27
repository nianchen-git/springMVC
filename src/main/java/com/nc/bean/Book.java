package com.nc.bean;

public class Book {
    private String name;
    private String author;
    private Double price;
    private Boolean ispublic;

    public Book() {
    }

    public Book(String name, String author, Double price, Boolean ispublic) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.ispublic = ispublic;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", ispublic=" + ispublic +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getIspublic() {
        return ispublic;
    }

    public void setIspublic(Boolean ispublic) {
        this.ispublic = ispublic;
    }
}
