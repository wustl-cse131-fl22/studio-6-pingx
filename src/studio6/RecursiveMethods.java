package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {
	public static double geometricSum(int n) {
		if(n==0)
		{
			return 0;
		}
		else
		{
			return Math.pow(0.5,n)+geometricSum(n-1);
		}
	}

	/**
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		/*while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;*/
		
		if(p%q==0)
		{return q;}
		else
		{
			return gcd(q,p%q);
		}
		
	}
	

	/**
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		int index=array.length;
		index--;
		reversed=toReversedArray(array,reversed,index);
		return reversed;
	}
	public static int[] toReversedArray(int [] array, int [] reversed, int index)
	{
		if(index<0||array.length==0)
		{
			return reversed;
		}
		else
		{
			reversed[index]=array[array.length-1-index];
			return toReversedArray(array,reversed,index);
		}
	}
}
