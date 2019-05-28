import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	String job;
	int id;
	Char1 char1 = new Char1();
	Char2 char2 = new Char2();
	Char3 char3 = new Char3();
	Char4 char4 = new Char4();
	Char5 char5 = new Char5();
	Char6 char6 = new Char6();

	public Main() {
		int i = 1;
		
		// TODO Auto-generated constructor stub
//		Char1 char1 = new Char1();
//		Char2 char2 = new Char2();
//		Char3 char3 = new Char3();
//		Char4 char4 = new Char4();
//		Char5 char5 = new Char5();
//		Char6 char6 = new Char6();
//		char2.Paint();
//		char1.test();
//		char2.test();
//		char3.test();
//		char4.test();
//		char5.test();
//		char6.test();
		System.out.println("Simulasi kelompok kemampuan");
		System.out.println("1.Char1");
		System.out.println("2.Char2");
		System.out.println("3.Char3");
		System.out.println("4.Char4");
		System.out.println("5.Char5");
		System.out.println("6.Char6");
		System.out.println("Input (Info/Cook/Drive/Work/Paint) : ");
		String input = scan.nextLine();
//		String[] str=input.split(" ");
//		job = str[0];
//		id = Integer.parseInt(str[1]);
		switch (input) {
		case "Info":
			info();
			break;
		case "Cook":
			cook();
			break;
		case "Drive":
			drive();
			break;
		case "Work":
			work();
			break;
		case "Paint":
			paint();
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
	
	public void info() {
		System.out.println("Input (1...6) : ");
		id = scan.nextInt();scan.nextLine();
		switch (id) {
		case 1:
			char1.test();
			break;
		case 2 :
			char2.test();
			break;
		case 3 :
			char3.test();
			break;
		case 4 :
			char4.test();
			break;
		case 5 :
			char5.test();
			break;
		case 6 :
			char6.test();
			break;
		default:
			System.out.println("Error info()");
			break;
		}
	}
	
	public void cook() {
		System.out.println("Input (1...6) : ");
		id = scan.nextInt();scan.nextLine();
		switch (id) {
		case 1:
			System.out.println("Char1 tidak implementasi method tersebut");
			break;
		case 2 :
			System.out.println("Char2 tidak implementasi method tersebut");
			break;
		case 3 :
			char3.Cook();
			break;
		case 4 :
			char4.Cook();
			break;
		case 5 :
			System.out.println("Char2 tidak implementasi method tersebut");
			break;
		case 6 :
			char6.Cook();
			break;
		default:
			System.out.println("Error cook()");
			break;
		}
		
	}

	public void drive() {
		System.out.println("Input (1...6) : ");
		id = scan.nextInt();scan.nextLine();
		switch (id) {
		case 1:
			System.out.println("Char1 tidak implementasi method tersebut");
			break;
		case 2 :
			System.out.println("Char2 tidak implementasi method tersebut");
			break;
		case 3 :
			char3.Drive();
			break;
		case 4 :
			System.out.println("Char4 tidak implementasi method tersebut");
			break;
		case 5 :
			char5.Drive();
			break;
		case 6 :
			char6.Drive();
			break;
		default:
			System.out.println("Error drive()");
			break;
		}
	
	}

	public void work() {
		System.out.println("Input (1...6) : ");
		id = scan.nextInt();scan.nextLine();
		switch (id) {
		case 1:
			System.out.println("Char1 tidak implementasi method tersebut");
			break;
		case 2 :
			System.out.println("Char2 tidak implementasi method tersebut");
			break;
		case 3 :
			char3.Work();
			break;
		case 4 :
			char4.Work();
			break;
		case 5 :
			char5.Work();
			break;
		case 6 :
			System.out.println("Char6 tidak implementasi method tersebut");
			break;
		default:
			System.out.println("Error work()");
			break;
		}
	
	}
	
	public void paint() {
		System.out.println("Input (1...6) : ");
		id = scan.nextInt();scan.nextLine();
		switch (id) {
		case 1:
			System.out.println("Char1 tidak implementasi method tersebut");
			break;
		case 2 :
			char2.Paint();
			break;
		case 3 :
			char3.Paint();
			break;
		case 4 :
			char4.Paint();
			break;
		case 5 :
			System.out.println("Char5 tidak implementasi method tersebut");
			break;
		case 6 :
			System.out.println("Char6 tidak implementasi method tersebut");
			break;
		default:
			System.out.println("Error paint()");
			break;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
