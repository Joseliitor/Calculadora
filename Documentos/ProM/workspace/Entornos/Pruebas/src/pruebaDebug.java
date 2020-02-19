import java.util.Scanner;

public class pruebaDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dimension;
		int[][] matriz;
		System.out.println("Inserta la dimension: ");
		dimension = sc.nextInt();
		sc.close();
		matriz = new int[dimension][dimension];
		for(int i=0;i<dimension;i++) {
			for(int j=0;j<dimension;j++) {
				matriz[i][j] = (int)(Math.random()*100);
			}
		}
		int mayor = elMayor(matriz);
		System.out.println("El mayor valor generado es: "+mayor);
		
		
	}
	
	
	public static int elMayor(int[][] matriz) {
		int mayor;
		mayor = 0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				if(matriz[i][j]>mayor)
					mayor = matriz[i][j];
			}
		}
		return mayor;
	}

}
