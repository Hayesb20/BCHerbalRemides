package edu.hanover.bcherbalremides;


public class BritishTea {
    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of Drinks
    public static final BritishTea[] britainDrinks = {
            new BritishTea("Twinings", "The most popular green tea in Britain", R.drawable.twinings),
            new BritishTea("PGTips", "A popular black tea from Britain", R.drawable.pgtips),
            new BritishTea("Assam", "Unique tea that is drank heavily in Britain", R.drawable.assam)
    };

    //Each Drink has a name, description, and an image resource
    private BritishTea(String name, String description, int imageResourceId) {
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
