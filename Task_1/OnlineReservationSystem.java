import java.util.*;
class AccountDetails{
    String name;
	String userName;
	String password;
    
    public void register() {                        //REGISTRATION PAGE
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Your Name - ");
		this.name = sc.nextLine();
		System.out.print("\nEnter Your Username - ");
		this.userName = sc.nextLine();
		System.out.print("\nEnter Your Password - ");
		this.password = sc.nextLine();
		System.out.println("\nRegistration completed..kindly login");

	}
    public boolean login() {            // LOGIN PAGE
		boolean isLogin = false;
		Scanner sc = new Scanner(System.in);
		while ( !isLogin ) {
			System.out.print("\nEnter Your Username - ");
			String Username = sc.nextLine();
			if ( Username.equals(userName) ) {
				while ( !isLogin ) {
					System.out.print("\nEnter Your Password - ");
					String Password = sc.nextLine();
					if ( Password.equals(password) ) {
						System.out.print("\nLogin successful!!");
						isLogin = true;
					}
					else {
						System.out.println("\nIncorrect Password");
					}
				}
			}
			else {
				System.out.println("\nUsername not found");
			}
		}
		return isLogin;
	}
}
public class OnlineReservationSystem{

	public static boolean[] seats = new boolean[10];
    public static void main(String[] args){
        System.out.println("        WELCOME to Online Seat Reservation System       ");
        System.out.println("1.Register\n2.Exit");
        System.out.println("Choose between 1 and 2 only");
        // int choice= takeIntegerInput(2);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if ( choice == 1 ) {
			AccountDetails b = new AccountDetails();
			b.register();
			while(true) {
				System.out.println("\n1.Login \n2.Exit");
				System.out.print("Enter Your Choice - ");
				int ch =sc.nextInt();       // takeIntegerInput(2);
				if ( ch == 1 ) {
					if (b.login()) {
						System.out.println("\n\n**********WELCOME BACK " + b.name + " **********\n");
						boolean isFinished = false;
						while (!isFinished) {
							System.out.println("\n1.View Seat Map \n2.Reserve a seat \n3.Cancel Reservation \n4.About \n5.Exit");
							System.out.print("\nEnter Your Choice - ");
							int c =sc.nextInt();        // takeIntegerInput(6);
							switch(c) {
								case 1:
								viewSeatMap();
								break;
								case 2:
								reserveSeat();
								break;
								case 3:
								cancelReservation();
								break;
								case 4:
								About();
								break;
								case 5:
								System.exit(0);
							}
						}
					}
				}
			}
		}

    }
     public static void viewSeatMap() {
        System.out.println("\nCurrent Seat Map:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.print("X "); // print an "X" if the seat is reserved
            } else {
                System.out.print((i + 1) + " "); // print the seat number if it's empty
            }
        }
        System.out.println();
    }

    public static void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
        } else if (seats[seatNumber - 1]) {
            System.out.println("Seat already reserved!");
        } else {
            seats[seatNumber - 1] = true; // reserve the seat
            System.out.println("Seat reserved!");
        }
        //scanner.close();
    }

    public static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
        } else if (!seats[seatNumber - 1]) {
            System.out.println("Seat not reserved!");
        } else {
            seats[seatNumber - 1] = false; // unreserve the seat
            System.out.println("Reservation canceled!");
        }
       // scanner.close();
    }

    public static void About(){
        System.out.println("\tMy name is Kartik Kumar Agrahari\n I developed this Java program as a part of my internship program conducted by Oasis Infobyte.\n Internship date 15 June 2023-15 July 2023");
    
    }


}