import utils.*;

public class App {
    public static void main(String[] args) throws Exception {
        Personaje_mago belcebu = new Personaje_mago("Belcebu", 100, 250);
        belcebu.lanzar_ataque();
        belcebu.bloquear_ataque(20);
        belcebu.recibir_ataque(20);
    }
}
