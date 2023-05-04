package f;

public class Posto_carga {
    Ponto spot;
    boolean isCharging;

    Posto_carga(Ponto spot){
        this.spot = spot;
        this.isCharging = true;
    }

    public Ponto getSpot(){
        return spot;
    }
}
