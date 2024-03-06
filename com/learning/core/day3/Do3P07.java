<<<<<<< HEAD
package com.learning.core.day3;

import java.util.Scanner;

public class Do3P07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = str.length();
        int n = (int) Math.pow(2, length);
        
        for (int i = 0; i < n; i++) 
        {
            StringBuilder sq = new StringBuilder();
            for (int j = 0; j < length; j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    sq.append(str.charAt(j));
                }
            }
            System.out.print(sq+" ");
        }
	}

}
=======
package com.learning.core.day3;

import java.util.Scanner;

public class Do3P07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = str.length();
        int n = (int) Math.pow(2, length);
        
        for (int i = 0; i < n; i++) 
        {
            StringBuilder sq = new StringBuilder();
            for (int j = 0; j < length; j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    sq.append(str.charAt(j));
                }
            }
            System.out.print(sq+" ");
        }
	}

}
>>>>>>> 2fe23d38fc0011e70d3e80d5a62599f49f5284b5
