package Humanos;

public class ElixirOscuro implements jugarHumanos{
    public static int vida5 = 400;
    private int recursos2;
    
    public ElixirOscuro(){}
    
    public ElixirOscuro(int recursos2){
        this.recursos2 = recursos2;
    }

    public int getRecursos2() {
        return recursos2;
    }

    public void setRecursos2(int recursos2) {
        this.recursos2 = recursos2;
    }

    @Override
    public void atacar() {}

    @Override
    public void recolectar1() {
        ElixirOscuro elixiroscuro = new ElixirOscuro();
        elixiroscuro.setRecursos2(3000);
        System.out.println("Tienes: "+ elixiroscuro.getRecursos2() + " de elixir oscuro");
    }
}
