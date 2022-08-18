
public class testing {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		if(a++ == --b) {
			System.out.println("2==2");
		}else {
			System.out.println("3==3");
		}
	}
}
