package polymorphism;

public class GoldCustomer extends Customer {
	private double saleRatio; //«“¿Œ¿≤ sales %
	
	public GoldCustomer(int customerId, String customerName ) {
		super(customerId,customerName); 
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); 
	}
	
	
}
