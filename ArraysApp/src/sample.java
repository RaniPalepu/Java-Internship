
public class sample {

	public static void main(String[] args) {
		float prices[]= {563.24f,953.26f,789.25f,685.24f};
		System.out.println(prices.length);
		float sum=0.0f;
		//for(int index=0;index<prices.length;index++,sum+=prices[index]){
			
		//}
		for(int index=0;index<prices.length;index++ ) {
			System.out.println(prices[index]);
		}
		for(float price : prices) {
			System.out.println(price);
		}
		

	}

}
