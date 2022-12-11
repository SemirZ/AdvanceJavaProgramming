public class Restaurant {

    public static void main(String[] args) {


        Pizza pizza = new Pizza("Capricosa", 25);

        pizza.addSpice("tomato");
        pizza.addSpice("sour cream");

        Sandwich sandwich = new Sandwich("Sandwich with meat", 15);

        sandwich.addSpice("cucumber");
        sandwich.addSpice("tomato");
        sandwich.addSpice("onion");

        System.out.println(pizza.toString());
        System.out.println(sandwich.toString());



















    }


}
