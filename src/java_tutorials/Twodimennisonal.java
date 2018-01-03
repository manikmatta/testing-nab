package java_tutorials;

public class Twodimennisonal {

	public static void main(String[] args) {
		
	int rows =3;
	int cols =3;
		
//		int sal[] = new int[3];
//		sal[0]=1;
//		sal[1]=1;
//		sal[2]=1;
//	sal[3]=1;
//		System.out.println(sal[0]);
		
				
		int table[][]= new int[rows][cols];
		
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=10;
		table[1][1]=11;
		table[1][2]=12;
		
		
		table[2][0]=10;
		table[2][1]=11;
		table[2][2]=12;
		
		System.out.println(table.length);
		System.out.println(table[0].length);
		
		System.out.println(table[0][0]);
		
		for (int i=0;i<table.length;i++)
		{
			for (int j=0;j<table[0].length;j++)
			{
				System.out.print(" " +table[i][j]);
			}
			System.out.println(" ");
		}
		

	}

}
