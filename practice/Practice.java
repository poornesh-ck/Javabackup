import java.util.ArrayList;
import java.util.Scanner;
class Practice{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> l= new ArrayList<>();
		for (int i=0;i<10;i++){
			l.add(sc.nextInt());

		}
		System.out.println(l);
		l.sort();
		System.out.println(l);
		
		
	}
}