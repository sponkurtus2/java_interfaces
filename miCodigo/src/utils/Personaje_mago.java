package utils;

public class Personaje_mago extends Molde_personaje {

    public Personaje_mago(String nombre, int vida, int mana) {
        super(nombre, vida, mana);
    }


    @Override
    public void lanzar_ataque() {

        if (mana >= 30) {
            System.out.println(nombre + " te ha lanzado un hechizo de fuego...");
            mana -= 30;
        } else {
            System.out.println("Accion no disponible, no cuentas con suficiente mana.");
        }

    }

    @Override
    public void bloquear_ataque(int daño) {
        daño = daño / 2;
        vida = vida - daño;
        System.out.println(nombre + " se ha defendido del ataque, y solo recibio la mitad del daño, vida actual: " + vida);
    }

    @Override
    public void recibir_ataque(int daño) {
        
        if (vida <= 0) {
            System.out.println("No se puede recibir ataque, el personaje ya esta muerto.");
        } else {
            System.out.println("Recibiste" + daño + " de daño, tu vida actual es de: " + (vida - daño));
        }

    }

    
    
    
}
