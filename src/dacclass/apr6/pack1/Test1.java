package dacclass.apr6.pack1;
// main class can either be public or default 
//private class abc //error

 public class Test1
 {
 
	private class abc{}//ok inner class can be private 
	int x;       //default variable 
	public int y;
	private int z;
	protected int k;
	
	public void show()
	{
		x=10;
		y=20;
		z=30;
		k=33;
	}
}
