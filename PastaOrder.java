package FastFood_startup;

import java.util.ArrayList;

public class PastaOrder 
{
	private double totalOrderCost;
	
	private final ArrayList<Pasta> pasta;
	
	public PastaOrder(ArrayList<Pasta> pasta)
	{
		this.pasta = pasta;
	}
	
	public void calcTotalPastaCost()
	{
		final double White_Sauce = 10.00;
		final double Red_Sauce = 20.00;
		
		for(Pasta p: pasta)
		{
			switch(p.getFlavours())
			{
			case "White_sauce":
				totalOrderCost += White_Sauce;
				break;
				
			case "Red_sauce":
				totalOrderCost += Red_Sauce;
				break;
				
			default:
				System.out.println("Invalid choice !!!!");
				break;
			}
			
//			String totalTypes = p.getTypes();
		}
	}
	
	public void PastaType()
	{
		for(Pasta type : pasta)
		{
			switch(type.getTypes())
			{
			case "Penne":
//				System.out.println("Penne type");
				break;
				
			case "Ditalini":
//				System.out.println("Ditalini type");
				break;
				
			default:
				System.out.println("Invalid type choice !!!");
				break;
			}
		}
	}
	
	public double getPastaCost()
	{
		return totalOrderCost;
	}
	
	public void PastaOrderSummary()
	{
		for(Pasta p:pasta)
		{
			System.out.println("Ordered a "+p.getFlavours()+" pasta of "+p.getTypes()+ " type.");
		}
		System.out.println("Total cost of pasta is : "+getPastaCost());
	}
}
