package Lecture3;

import java.util.Arrays;

public class FruitDemo
{
	public static void main(String[] args)    
	{
		Fruit[] fruits = new Fruit[5];
		
       fruits[0] = new Fruit("Orange" ,3);
       fruits[1] = new Fruit("Apple", 10);
       fruits[2] = new Fruit("Kiwi" , 4);
       fruits[3] = new Fruit("Durian" , 1);
       fruits[4] = new Fruit("Apple", 1);

		Arrays.sort(fruits);

		// Output the sorted array of fruits
		for (Fruit f : fruits)
		{
			System.out.println(f.getName()+ " " + f.getWeight());
		}
}
		}