package com.example.toolshop;

public class Tool {
    private int id;
    private String name;
    private Double price;
    private int category;
    private int quality;
    private boolean isAvailable;
    private String imgUrl;

    public Tool(int id, String name, Double price, int category, int quality, boolean isAvailable, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quality = quality;
        this.isAvailable = isAvailable;
        this.imgUrl = imgUrl;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quality=" + quality +
                ", isAvailable=" + isAvailable +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}


