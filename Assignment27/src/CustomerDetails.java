
public class CustomerDetails {
	int id;
	String name;
	float orderAmount;
	public CustomerDetails(int id, String name, float orderAmount) {
		this.id = id;
		this.name = name;
		this.orderAmount = orderAmount;
	}
	public void showDetails() {
		System.out.println("Customer Id:"+id);
		System.out.println("Customer name:"+name);
		System.out.println("Customer OrderAmount:"+orderAmount);
	}
	

}
