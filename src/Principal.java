import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Figura> listaDeFiguras = getFiguras();

        recorre("Paralelogramo",listaDeFiguras);
        recorre("Figura",listaDeFiguras);

    }

    private static ArrayList<Figura> getFiguras() {
        ArrayList<Figura> listaDeFiguras = new ArrayList<>();

        Figura triangulo = new Triangulo("Triangulo");
        Figura cuadrado = new Cuadrado("Cuadrado");
        Figura rombo = new Rombo("Rombo");

        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(rombo);
        return listaDeFiguras;
    }

    private static void recorre(String tipo, ArrayList<Figura> listaDeFiguras) {
        for (Figura figura : listaDeFiguras) {
            if(figura.getClass().getSuperclass().getSimpleName() == tipo) {
                figura.pintar();
            }
        }
    }
}
