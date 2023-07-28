public class JuegoAhorcadoApp {
    public static void main(String[] args) {
        System.out.println("¡Comienza el juego de ahorcado!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombreJugador = scanner.nextLine();

        System.out.print("Ingresa la palabra oculta para el juego: ");
        String palabraOculta = scanner.nextLine();

        JuegoAhorcado juego = new JuegoAhorcado(palabraOculta);
        Jugador jugador = new Jugador(nombreJugador);

        while (true) {
            System.out.println("Palabra actual: " + juego.mostrarPalabra());
            char letra = jugador.adivinarLetra();
            String resultado = juego.intentarLetra(letra);
            System.out.println(resultado);

            if (!new String(juego.mostrarPalabra()).contains("_") || juego.intentosRealizados >= juego.intentosMaximos) {
                break;
            }
        }
    }
}
