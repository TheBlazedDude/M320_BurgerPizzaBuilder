package ch.bbw.food;

public class Pizza extends Food {

    private String type;
    private boolean hasDough;
    private boolean hasTomatoSauce;
    private boolean hasHam;
    private boolean hasSpinach;
    private boolean hasCheese;
    private boolean hasEgg;
    private boolean hasPineapple;
    private boolean hasRucola;
    private boolean hasMascarpone;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.type = pizzaBuilder.getType();
        this.hasDough = pizzaBuilder.getDough();
        this.hasTomatoSauce = pizzaBuilder.getTomatoSauce();
        this.hasHam = pizzaBuilder.getHam();
        this.hasSpinach = pizzaBuilder.getSpinach();
        this.hasCheese = pizzaBuilder.getCheese();
        this.hasEgg = pizzaBuilder.getEgg();
        this.hasPineapple = pizzaBuilder.getPineapple();
        this.hasRucola = pizzaBuilder.getRucola();
        this.hasMascarpone = pizzaBuilder.getMascarpone();
    }

    @Override
    public void addIngredient(String ingredient) {
        super.addIngredient(ingredient);
    }

    public void describePizza() {
        System.out.println("Your pizza is a " + this.type + "Pizza and contains contains:");
        if (this.hasDough) {
            System.out.println("Dough");
        }
        if (this.hasTomatoSauce) {
            System.out.println("Tomato Sauce");
        }
        if (this.hasHam) {
            System.out.println("Ham");
        }
        if (this.hasSpinach) {
            System.out.println("Spinach");
        }
        if (this.hasCheese) {
            System.out.println("Cheese");
        }
        if (this.hasEgg) {
            System.out.println("Egg");
        }
        if (this.hasPineapple) {
            System.out.println("Pineapple");
        }
        if (this.hasRucola) {
            System.out.println("Rucola");
        }
        if (this.hasMascarpone) {
            System.out.println("Mascarpone");
        }
    }

}
