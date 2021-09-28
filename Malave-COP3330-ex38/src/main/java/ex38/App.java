package ex38;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static int[]  filterEvenNumbers(int[] num)
    {
        int[] newArray = new int[num.length];
        for(int i = 0; i < num.length; i++ )
        {
            if(num[i]%2 == 0)
            {
                newArray[i] = num[i];
            }
        }
        return newArray;
    }
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println( "Enter a list of numbers, separated by spaces:" );
        while(sc.hasNextInt())
        {
            numbers.add(sc.nextInt());
        }
        int[] num = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++ )
        {
            num[i] = numbers.get(i);
        }

        int[] newNum = filterEvenNumbers(num);
        System.out.println( "The even numbers are" + newNum);
    }
}
