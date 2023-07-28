import java.util.Scanner;

import java.util.Scanner;

public class Jugador {
<<<<<<< HEAD
	  private String nombre;

	    public Jugador(String nombre) {
	        this.nombre = nombre;
	    }

	    public char adivinarLetra() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print(nombre + ", ingresa una letra: ");
	        return scanner.next().toLowerCase().charAt(0);
	    }
}
=======
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public char adivinarLetra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(nombre + ", ingresa una letra: ");
        return scanner.next().toLowerCase().charAt(0);
    }
}
>>>>>>> 90d8f719d5e2c33434ebf05a8fd5a3b7b7108ff1
