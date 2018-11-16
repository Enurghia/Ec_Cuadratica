import java.util.Scanner;

public class Ec_Cuadratica {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		double Delta = 0;
		double a = 0;	//Valor cuadr�tico
		double b = 0;	//Valor lineal
		double c = 0;	//Valor libre
		double X1 = 0;
		double X2 = 0;
		System.out.print("Para calcular las ra�ces de una ecuaci�n cuadr�tica."+"\n"+
			"Ingrese los terminos que se les soliciten."+"\n"+"Ingrese t�rmino "
						+ "cuadr�tico (Coeficiente que acompa�e a X^2):"+"\n");
		a = sc.nextDouble();
		if (a == 0){
			System.out.print("El t�rmino cuadr�tico no puede ser 0."+"\n");
		}
		else{
			System.out.print("Ingrese t�rmino lineal (Coeficiente que acompa�e a X):"+"\n");
			b = sc.nextDouble();
			System.out.print("Ingrese t�rmino libre:"+"\n");
			c = sc.nextDouble();
			Delta = (b*b) - (4*a*c);
			if (Delta >= 0){
				X1= (-b + Math.sqrt(Delta)) / (2 * a);
				X2= (-b - Math.sqrt(Delta)) / (2 * a);
				System.out.print("Las ra�ces de la ecuaci�n cuadr�tica es:"+
				"\n" + "X1: " + (float)X1 + "\n" + "X2: " + (float)X2);
			}
			else {
				System.out.print("El resultado es complejo."+"\n");
				Delta = -Delta;
				X1= (-b)/(a*2);
				X2= (Math.sqrt(Delta)/(a*2));
				System.out.print("Las ra�ces de la ecuaci�n cuadr�tica es:"+
				"\n" + "X1: " + X1 + " + " + (float)X2 + "i" + "\n" + "X2: "
				+ X1 + " - " + (float)X2 + "i");
			}
		}
	}

}
