package edu.hanover.bcherbalremides;


public class BritainDrink {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final BritainDrink[] britainDrinks = {
            new BritainDrink("Twinings", "The most popular green tea in Britain", R.drawable.twinings),
            new BritainDrink("PGTips", "A popular black tea from Britain", R.drawable.pgtips),
            new BritainDrink("Assam", "Unique tea that is drank heavily in Britain", R.drawable.assam)
    };

    //Each Drink has a name, description, and an image resource
    private BritainDrink(String name, String description, int imageResourceId) {
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
