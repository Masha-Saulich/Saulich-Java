package Saulich;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		if (a.equals(b)) 
		{
            System.out.println("Строки идентичны");
        } 
		else 
		{
            System.out.println("Строки неидентичны");
        }
	}

}
