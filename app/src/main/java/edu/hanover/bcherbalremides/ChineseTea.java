package edu.hanover.bcherbalremides;

public class ChineseTea {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final ChineseTea[] chinaDrinks = {
            new ChineseTea("Biluochun", "A common form on Chinese green tea", R.drawable.biluochun),
            new ChineseTea("Dianhong", "A popular Chinese black tea", R.drawable.dianhong),
            new ChineseTea("Pu-erh", "Unique to China, this tea is world renowned", R.drawable.puerh)
    };

    //Each Drink has a name, description, and an image resource
    private ChineseTea(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
