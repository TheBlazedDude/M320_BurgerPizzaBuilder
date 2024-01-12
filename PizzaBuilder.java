package ch.bbw.food;

public class PizzaBuilder implements PizzaBuilderInterface {
    //required fields
    private String type;
    private boolean hasDough;

    //optional fields
    private boolean hasTomatoSauce;
    private boolean hasHam;
    private boolean hasSpinach;
    private boolean hasCheese;
    private boolean hasEgg;
    private boolean hasPineapple;
    private boolean hasRucola;
    private boolean hasMascarpone;
    // ... other properties

    public PizzaBuilder(String type, boolean hasDough) {
        this.type = type;
        this.hasDough = hasDough; // in our Case we have a boolean and could just type this.hasDough = true;
    }

    public PizzaBuilder addTomatoSauce() {
        this.hasTomatoSauce = true;
        return this;
    }

    public PizzaBuilder addHam() {
        this.hasHam = true;
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.hasSpinach = true;
        return this;
    }

    public PizzaBuilder addCheese() {
        this.hasCheese = true;
        return this;
    }

    public PizzaBuilder addEgg() {
        this.hasEgg = true;
        return this;
    }

    public PizzaBuilder addPineapple() {
        this.hasPineapple = true;
        return this;
    }

    public PizzaBuilder addRucola() {
        this.hasRucola = true;
        return this;
    }

    public PizzaBuilder addMascarpone() {
        this.hasMascarpone = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }

    public String getType() {
        return type;
    }

    public boolean getDough() {
        return hasDough;
    }

    public boolean getTomatoSauce() {
        return hasTomatoSauce;
    }

    public boolean getHam() {
        return hasHam;
    }

    public boolean getSpinach() {
        return hasSpinach;
    }

    public boolean getCheese() {
        return hasCheese;
    }

    public boolean getEgg() {
        return hasEgg;
    }

    public boolean getPineapple() {
        return hasPineapple;
    }

    public boolean getRucola() {
        return hasRucola;
    }

    public boolean getMascarpone() {
        return hasMascarpone;
    }
    // ... other getters
}
