import java.util.Scanner;

public class Trans_DecimalBaseN {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner (System.in);
		double A;		//Decimal
		int B;			//Base
		String C = new String("");
		System.out.println("Ingrese el número de base decimal que desee transformar.");
		A = sc.nextDouble();
		System.out.println("Ingrese la base la que desea transformar (De 2 a 16).");
		B = sc.nextInt();
		if (B < 2){
			System.out.println("No existe esa base.");
		}
		else{
			if(B > 16){
				System.out.println("No se permite esa base.");
			}
			else{
				C = CambioBase(A,B);
				System.out.println("El número "+A+" en la base "+B+" es: "+C);
			}
		}
	}

	public static String CambioBase(double Decimal, int Base){
		int Aux;
		double Aux1 = Decimal - (int)Decimal;
		double Aux2 = Decimal - (int)Decimal;
		String CambioDec = new String(""+Aux1);
		int Aux3 = (CambioDec.length()) - 2;
		String Cambio = new String("");
		while((int)Decimal > 0){
			Aux = (int)Decimal % Base;
			switch(Aux){
			case 10:
				Cambio = "A"+Cambio;break;
			case 11:
				Cambio = "B"+Cambio;break;
			case 12:
				Cambio = "C"+Cambio;break;
			case 13:
				Cambio = "D"+Cambio;break;
			case 14:
				Cambio = "E"+Cambio;break;
			case 15:
				Cambio = "F"+Cambio;break;
			default:
				Cambio = Aux+Cambio;break;
			}
			Decimal /= Base;
		}
		if(Aux1 != 0){
			Aux2 *= Math.pow(10, Aux3);
			Cambio = Cambio+",";
			CambioDec = "";
			while((int)Aux2 > 0){
				Aux = (int)Aux2 % Base;
				switch(Aux){
				case 10:
					CambioDec = "A"+CambioDec;break;
				case 11:
					CambioDec = "B"+CambioDec;break;
				case 12:
					CambioDec = "C"+CambioDec;break;
				case 13:
					CambioDec = "D"+CambioDec;break;
				case 14:
					CambioDec = "E"+CambioDec;break;
				case 15:
					CambioDec = "F"+CambioDec;break;
				default:
					CambioDec = Aux+CambioDec;break;
				}
				Aux2 /= Base;
			}
			Cambio += CambioDec;
		}
		return Cambio;
	}
	
}