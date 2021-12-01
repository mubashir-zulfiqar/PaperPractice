package GraphCode;

public class Graph {
	Vertex V[][];
	Graph(int no_Vertex)
	{
		V = new Vertex[no_Vertex][no_Vertex];
		for(int i=0;i<no_Vertex;i++)
		{
			for(int j=0;j<no_Vertex;j++)	
			{
				V[i][j] = new Vertex();
			}
		}
	}
	
	void Connect(int From,int To, int Complexity)
	{
		V[From][To].Complexity = Complexity;
	}
	
	public String toString()
	{
		String s= "";
		for(int i=0;i<V.length;i++)
		{
			for(int j=0;j<V.length;j++)	
			{
				if(V[i][j].Complexity!=0)
				{
					s= s + "Vtx "+i +" is Conected to Vtx "+ j+ " with Complexity "+V[i][j].Complexity +"\n";
				}
			}
		}
		return s;
	}
	
	
	

}
