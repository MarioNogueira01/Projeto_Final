package f;

import java.util.Arrays;

public class Gestor {
    Carga[] cargas;
    Robot[] robos;
    int step = 1;

    public Gestor(Carga[] cargas, Robot[] robos, Posto_carga[] postos){
        for(int i = 0; i<4; i++){
            robos[i] = new Robot(ponto[i]);
        }
    }

    void selection(){

    }

    public int bestChoice(Carga carga, Ponto destino){
        double[] avaluationList;
        int n = robos.length;
        for(int i = 0; i < n; i++){
            avaluationList[i] = robos[i].avaluation(carga, destino);
        }
        int result;
        for(int i = 0; i < n; i++){
            if(avaluationList[i] > avaluationList[i+1] && robos[i].avaluation(carga, destino) < robos[i].bateria){
                result = i;
            }
        }
        return result;
    }

    public void simulationStep(Carga carga, Ponto destino){
        int c = bestChoice(carga, destino);


        this.step++;
    }



    public int pedidos(Carga[] carga){

        for (int i = 0; i <= carga.length;i++){
            Ponto loc = carga[i].location;

        }

        return carga.length;
    }





}
