package Vector;

public class Vetor {

	public static void main(String[] args) {
		double matriz[][] = new double[3][3];
		
		matriz[0][0] = 1.5;
		matriz[1][1] = 1.7;
		matriz[2][2] = 2.8;
		
		for (int i = 0; i<3;i++)
			System.out.println(matriz[i][i]);

	}

}
