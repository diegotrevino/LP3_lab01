import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vida,rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida++;
			System.out.println("Vida: "+vida+"\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if(rp == 7777)
				fl=true;
		}while(vida < 4 && !fl);
		if(fl == true)
		{
			System.out.println("Adiviniaste!!! ");
			System.out.println(Regalo.elegir(vida));
		}
		else
			System.out.println("ups, perdiste... ");
	}

}
