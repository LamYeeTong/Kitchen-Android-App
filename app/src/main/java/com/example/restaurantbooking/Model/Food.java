package com.example.restaurantbooking.Model;

public class Food {

    private String Name;
    private String Image;
    private String Description;
    private String MenuId;
    private String Difficulty;
    private String Time;
    private String Ingredients;

    public Food() {
    }

    public Food(String name, String image, String description, String menuId, String difficulty, String time, String ingredients) {
        Name = name;
        Image = image;
        Description = description;
        MenuId = menuId;
        Difficulty = difficulty;
        Time = time;
        Ingredients = ingredients;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public String getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }
}
