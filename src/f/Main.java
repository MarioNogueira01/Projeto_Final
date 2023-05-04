package f;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<FiguraGeometrica> obstaculos = new ArrayList<>();

        Ponto[] robos = {new Ponto(0, 0), new Ponto(0, 1000), new Ponto(1000, 1000), new Ponto(1000, 0)};
        Ponto[] pontos = {new Ponto(0, 0), new Ponto(0, 1000), new Ponto(1000, 1000), new Ponto(1000, 0)};
        Ponto[] cargas = {new Ponto(200, 600), new Ponto(500, 800), new Ponto(800, 600), new Ponto(500, 200)};

        Robot[] robts = new Robot[4];
        Posto_carga[] postos = new Posto_carga[4];
        Carga[] cargas1 = new Carga[cargas.length];


        for (int i=0; i <robos.length;i++){
            robts[i] = new Robot(pontos[i]);
            postos[i] = new Posto_carga(pontos[i]);
        }

        for (int i=0; i < cargas.length;i++) {
            cargas1[i] = new Carga(cargas[i]);
        }



        Gestor gestor = new Gestor(cargas1,robts,postos);


        while (gestor.pedidos(cargas1) == 0) {

        }
    }
}
