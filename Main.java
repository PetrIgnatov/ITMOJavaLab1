public class Main
{
	public static void main(String[] args)
	{
		short[] c = new short[13];
		for (int i = 0; i < 13; i++)
		{
		  c[i] = (short)(15-i); // Генерация 1 массива
		}
		double[] x = new double[18];
		for (int i = 0; i < 18; i++)
		{
		  x[i] = (double)Math.random()*8.0-3.0; // Генерация 2 массива
		}
		double[][] ans = new double[13][18];
		for (int i = 0; i < 13; i++)
    		{
      			for (int j = 0; j < 18; j++)
      			{
        			if (c[i] == 4)
        			{
          				ans[i][j] = (1-Math.asin(Math.pow((x[j]-1)/8.0,2))/0.5);
        			}
        			else if (c[i] == 5 || c[i] == 6 || c[i] == 9 || c[i] == 11 || c[i] == 13 || c[i] == 15)
        			{
          				ans[i][j] = Math.pow((Math.exp(Math.atan((x[j]-1)/8.0))-1)/4.0,Math.asin(Math.sin(x[j])));
        			}
        			else
        			{
        				ans[i][j] = Math.cos(Math.tan(Math.sin(Math.asin((x[j]-1)/8.0))));
        			}
        			System.out.printf("%5.2f ",ans[i][j]);
      			}
      			System.out.println();
    		}
	}
}
