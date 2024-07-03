
public class SumOfElements {
	public static void main(String[] args) {
		//initialized list
		float prices[]= {563.24f,953.26f,789.25f,685.24f};
		System.out.println(prices.length);
		float sum=0.0f;
		for(int index=0;index<prices.length;sum+=prices[index],
				index++) {
			sum+=prices[index];
		}
		System.out.println("The original Array:");
		for(int index=0;index<prices.length;index++) {
			System.out.println(prices[index]);
		}
		System.out.println("Sum of Array Elements:"+sum);
		/*int i;
		i=10;
		System.out.println(i++);
		System.out.println(i++);
		
		System.out.println(i);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(i);
		final long tollfreeno=18002564764L;
		if(true) {
			
		}
		if(false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		
}
}
