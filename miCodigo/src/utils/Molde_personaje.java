package utils;

public abstract class Molde_personaje implements Personaje_principal{

    protected String nombre;
    protected int vida;
    protected int mana;

    public Molde_personaje(String nombre, int vida, int mana) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }    
}
