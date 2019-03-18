import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Figura> listaDeFiguras = new ArrayList<>();

        Figura triangulo = new Triangulo("Triangulo");
        Figura cuadrado = new Rombo("Cuadrado");
        Figura rombo = new Cuadrado("Rombo");

        String tipo;


        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(rombo);


        recorre("Paralelogramo",listaDeFiguras);
        recorre("Figura",listaDeFiguras);

    }

    private static void recorre(String tipo, ArrayList<Figura> listaDeFiguras) {
        for (Figura figura : listaDeFiguras) {
            if(figura.getClass().getSuperclass().getSimpleName() == tipo) {
                figura.pintar();
            }
        }
    }
}
