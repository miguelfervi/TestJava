import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Figura> listaDeFiguras = new ArrayList<>();

        Figura triangulo = new Triangulo("Triangulo");
        Figura cuadrado = new Rombo("Cuadrado");
        Figura rombo = new Cuadrado("Rombo");


        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(rombo);

        for (Figura figura : listaDeFiguras) {
            if(figura.getClass().getSuperclass().getSimpleName() == "Paralelogramo") {
                figura.pintar();
            }
        }

        for (Figura figura : listaDeFiguras) {
            if(figura.getClass().getSimpleName() == "Triangulo") {
                figura.pintar();
            }
        }


    }
}
