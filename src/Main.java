package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("UTP A Cinema");
            System.out.println("1.Login");
            System.out.println("2. register");
            System.out.println("3. Exit");
            System.out.println("Pick your choice : ");
            int pilihan = input.nextInt();
            input.nextLine();
        }

        switch (pilihan){
            case 1:
            System.out.println("Login to our system");
            System.out.println("Email: ");
            String email = input.nextLine();
            System.out.println("Passwor: ");
            String password = input.nextLine();
            System.out.println("Login Success");
        

            case 2: 
            System.out.println("Register to our system");
            System.out.println(" Fullname: ");
            String fullName = input.nextLine();
            System.out.println("Email: ");
            String email = input.nextLine();
            System.out.println("Passwors: ");
            String password = input.nextLine();
            System.out.println("Initial Balance: ");
            double balance = input.nextDouble;
            System.out.println("Successfully register User!");

            case 3:
            system.exit(0);
        }


    }
}
