package FastFood_startup;

import java.util.ArrayList;

public class PizzaOrder {
	private double totalOrderCost;

	private final ArrayList<Pizza> pizzas;

	public PizzaOrder(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public void CalcTotalPizzaCost() {
		final double Large_Cost = 70.00;
		final double Medium_Cost = 65.00;
		final double Small_Cost = 50.00;
		final double Cost_per_topping = 1.00;

		for (Pizza pizza : pizzas) {
			switch (pizza.getSize()) {
			case "Large":
				totalOrderCost += Large_Cost;
				break;

			case "Medium":
				totalOrderCost += Medium_Cost;
				break;

			case "Small":
				totalOrderCost += Small_Cost;
				break;

			default:
				totalOrderCost += 0.0;
				break;
			}

			int totalTopping = pizza.getToppings().size();
			totalOrderCost += totalTopping * Cost_per_topping;
		}

//		for (Pizza pizza : pizzas) {
//			switch (pizza.getPizzaCrust()) {
//
//			case "Thick":
//				break;
//
//			case "Thin":
//				break;
//
//			default:
//				System.out.println("Invalid crust choice..");
//				break;
//			}
//		}
	}

	public double getPizzaCost() {
		return totalOrderCost;
	}

	public void PizzaOrderSummary() {
		for (Pizza pizza : pizzas) {
			System.out.println("Ordered a " + pizza.getSize()+" size pizza of "
					+ pizza.getToppings() + " toppings");
		}
		System.out.println("Total cost of Pizza is : " + getPizzaCost());
	}
}
