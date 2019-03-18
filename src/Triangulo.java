public class Triangulo extends Figura {

    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void pintar(){
        System.out.println(this.getClass().getSimpleName());
    }
}
