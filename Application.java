package ch.bbw.food;

public class Application {
    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder("Margherita", true);
        Pizza margherita = pizzaBuilder.addCheese().addTomatoSauce().build();
        Pizza Prosciutto = pizzaBuilder.addHam().addCheese().addTomatoSauce().build();
        Pizza Hawaii = pizzaBuilder.addCheese().addTomatoSauce().addHam().addPineapple().build();
        Pizza Special = pizzaBuilder.addCheese().addTomatoSauce().addHam().addMascarpone().addRucola().build();
        BurgerDirector director = new BurgerDirector();

        Burger classicBurger = director.constructClassicBurger();
        Burger cheeseBurger = director.constructCheeseBurger();
        Burger chickenBurger = director.constructChickenBurger();
        Burger doubleCheeseBurger = director.constructDoubeCheeseBurger();

        // Other solution could be without director.
        // So instantiate new BurgerBuilder here and then call the add() methods and at last the build method.

        System.out.println("Your orders were: ");
        classicBurger.describeBurger();
        cheeseBurger.describeBurger();
        chickenBurger.describeBurger();
        doubleCheeseBurger.describeBurger();

        System.out.println("Your order is ");
        margherita.describePizza();
        Prosciutto.describePizza();
        Hawaii.describePizza();
        Special.describePizza();
    }
}
