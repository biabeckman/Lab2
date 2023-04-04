package lp2;
public class Descanso{
    private int horasD;
    private String status = "cansado";
    private int semanas;
    public void defineHorasDescanso(int horasD){
        this.horasD = horasD;

    }
    public void defineNumeroSemanas(int semanas){
        this.semanas = semanas;

    }
    public String getStatusGeral(){
        if(semanas > 0) {

            if ((horasD / semanas) >= 26) {
                status = "descansado";
            }
            else{
                status = "cansado";
        }
        }
        return status;
    }


}
