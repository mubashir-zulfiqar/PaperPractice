package GraphCode;

public class test {

	public static void main(String arg[])
	{
		Graph g1 = new Graph(4);
		g1.Connect(0, 0, 1);
		g1.Connect(0, 1, 1);
		g1.Connect(0, 2, 2);
		g1.Connect(0,3, 2);
		g1.Connect(1, 1, 1);
		g1.Connect(2, 1, 1);
		g1.Connect(2, 3, 2);
		System.out.println(g1);
	}
	
	
}
