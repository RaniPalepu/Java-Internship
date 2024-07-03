
public class StringOperator {

	public static void main(String[] args) {
		String str="Life is Beautiful";
		String str2=new String("Life Is Beautiful");
		System.out.println(str.length());
		char ch=str.charAt(1);
		System.out.println(ch);
		//substring
		String substring=str.substring(5,7);
		System.out.println(substring);
		String concatstr=str.concat(", Folk");
		System.out.println(concatstr);
		int counter=0;
		for(int index=0;index<str.length();index++) {
			char space=str.charAt(index);
			if(space==' ') {
				counter++;
			}
		}
		System.out.println("Number of spaces:"+counter);

	}

}
