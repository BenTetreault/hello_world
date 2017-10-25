// a simple program to practice common Github commands 

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        
	String name;

        System.out.println("Please enter your name");
        
        Scanner input = new Scanner(System.in);
        name = input.nextLine();

        System.out.println("Hello, " + name " my name is Alice");
	Sytem.exit(0);
    }
}

