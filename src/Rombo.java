public class Rombo extends Paralelogramo {
    public Rombo(String tipoFigura) {
        super(tipoFigura);
    }

    public void pintar(){
        System.out.println(this.getClass().getSimpleName());
    }
}
