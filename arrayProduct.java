//Steven Pierre, Avery Chiappetta-Aponte, Shijo Thomas
// Chapter 8 Group Lab, Group 2
public class arrayProduct
{
	public static void main(String args[])
	{
		int [] array = {5,1,2,6};
		System.out.println("The product of the array is " + arrayProduct.getProduct(array) );
	}

	public static int getProduct(int [] a)
	{
		int total = a[0];
		for (int i = 1; i < a.length; i++)
		{
			total = total * a[i];
		}
		return total;
	}
}
