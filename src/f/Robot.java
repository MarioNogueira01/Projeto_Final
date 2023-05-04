package f;

public class Robot {
    Ponto inicio;
    double bateria;
    boolean isCharged;
    int estado;

    Robot(Ponto inicio){
        this.inicio = inicio;
        this.bateria = 100;
        this.isCharged = true;
        this.estado = 2;
    }

    /*
         Status robot
          0 = precisa de carregar;
          1 = A carregar
          2 = Pronto a usar;
          3 = Ocupado
   */

    public boolean isReady (Robot x){
        return x.estado == 2;
    }

    public void gasto_bateria(Robot x){
        if(x.estado == 3 || x.estado == 4 ) {
                this.bateria *= 0.99;
        }
        else {
                this.bateria *= 0.999;
        }
    }

    public double avaluation(Carga carga, Ponto destino){
        Populacao population = new Populacao();
        population.sort;
        Trajetoria traj = population.get(0);
        double count = 0;
        for(Ponto p : traj.getPontos()){
            count += 0.1;
        }
        return count;
    }

    public void nextStep(Ponto nextPoint){
        if(this.estado == 3){
            this.inicio = nextPoint;
            this.bateria -= 0.1;
        }
        else{
            this.bateria -= 0.01;
        }
    }


}
