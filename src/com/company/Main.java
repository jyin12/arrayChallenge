package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int grades [] = {90, 95, 100, 98};
        int sum = 0;
        for(int i= 0; i < grades.length; i++)
        {
            sum = sum + grades[i];
        }
        int average = sum/grades.length;
        System.out.println(average);
        //or System.out.println((grades[0] + grades[1] + grades[2]) /3);



        int students[] = new int[1000];
        Scanner input = new Scanner(System.in);
        int grade;
        int i = 0;
        int sum = 0;
        int count = 0;
        while (true)
        {
            System.out.printf("Enter grade:");
            int grades1 = input.nextInt();
            
        }

    }
}
