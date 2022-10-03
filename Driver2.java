package FastFood_startup;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {

    public static void printWelcomeMessage() {
        System.out.println("------------------------------------");
        System.out.println("Welcome to the Pizza and Pasta Order Program!");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printWelcomeMessage();

        ArrayList<Pizza> pizzas = new ArrayList<>();
        
        ArrayList<Pasta> p = new ArrayList<>();
        
        System.out.println("Order from below menu : \n1. Pizza\n2. Pasta");
        
//        if (scanner.next() == "1") {

        System.out.println("Enter the total pizzas you would like to order: ");
        int totalPizzas = scanner.nextInt();

        // Reading input regarding pizza size and pizza toppings
        for (int i = 0; i < totalPizzas; ++i) {
            Pizza pizza = new Pizza();

            ArrayList<String> toppings = new ArrayList<>();

            String pizzaSize;
            System.out.println("Enter the size of the pizza Large, Medium, Small: ");
            pizzaSize = scanner.next();
            pizza.setSize(pizzaSize);

            int totalToppings;
            System.out.println("Enter the total amount of toppings on the pizza: ");
            totalToppings = scanner.nextInt();

            for (int j = 0; j < totalToppings; ++j) {
                System.out.println("Enter the topping: ");
                String topping = scanner.next();
                toppings.add(topping);
            }

            pizza.setToppings(toppings);
            pizzas.add(pizza);
        }
//        }else {
//		System.out.println("Enter the total pasta you would like to order : ");
//		int totalPasta = scanner.nextInt();
//
//		for (int i = 0; i < totalPasta; i++) {
//			Pasta p1 = new Pasta();
//
//			ArrayList<String> flavours = new ArrayList<>();
//
//			String pastaType;
//			System.out.println("Enter thr type of pasta : - \nPenne \nDitalini");
//			pastaType = scanner.next();
//			p1.setTypes(pastaType);
//
//			int PastaFlavour;
//			System.out.println("Enter the sauce of pasta :- \n1. White \n2. Red");
//			PastaFlavour = scanner.nextInt();
//
//			for (int j = 0; j < PastaFlavour; j++) {
//				System.out.println("Enter the topping: ");
//				String pasta = scanner.next();
//				flavours.add(pasta);
//
//				p1.setFlavours(pasta);
//				p.add(p1);
//
//			}
//
//			PastaOrder order1 = new PastaOrder(p);
//			order1.calcTotalPastaCost();
//			order1.PastaOrderSummary();



        // Creating PizzaOrder object and relevant information with regards to order
        PizzaOrder order = new PizzaOrder(pizzas);
        order.CalcTotalPizzaCost();
		order.PizzaOrderSummary();


        // Cleanup
        scanner.close();
    }
//}
//    }
}