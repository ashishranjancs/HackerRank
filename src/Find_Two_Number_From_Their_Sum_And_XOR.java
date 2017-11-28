import java.util.Scanner;

public class Find_Two_Number_From_Their_Sum_And_XOR {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Sum of Two Number: ");
		System.out.println("Enter XOR of Two Number: ");
		
		int sum = in.nextInt();
		int xor = in.nextInt();
		int x = 0;
		int count = 0;
		int result = 0;
		
		for(int i = 1; i < sum/2; i++){
			int remain = sum - i;
			x =  (remain^i);
			if(x == xor){
				count++;
				result = i;
				System.out.println("Value are : " + result + " and " + (sum-result));
				break;
			}
		}
		if(count < 1){
			System.out.println("No Such Number Exist");
		}
	}

}
