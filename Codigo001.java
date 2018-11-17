import java.util.*;
public class Codigo001{
	private static Scanner sc;
	public static void main(String[]args){
		sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de números que se deban ordenar.");
		int n = sc.nextInt();
		int i = 0;
		String Mostrar = new String ("");
		int [] NRandom = new int [n];
		for(i = 0; i < n; i++){
			NRandom[i] = (int)((Math.random()) * 100);
		}
		Mostrar += NRandom[0];
		for (i = 1; i < n; i++){
			if (i == 1){
				if (NRandom[0] > NRandom[i]){
					Mostrar = NRandom[i] + " " + Mostrar;
				}
				else{
					Mostrar += " " + NRandom[i];
				}
			}
			else{
				if ((NRandom[i-1] > NRandom[i]) || (NRandom[0] > NRandom[i])){
					Mostrar = NRandom[i] + " " + Mostrar;
				}
				else{
					Mostrar += " " + NRandom[i];
				}
			}
		}
		System.out.println(Mostrar);
	}
}
