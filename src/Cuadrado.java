public class Cuadrado extends Paralelogramo {
    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    public void pintar(){
        System.out.println(this.getClass().getSimpleName());
    }

}
