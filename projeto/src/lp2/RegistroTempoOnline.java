package lp2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoEsperado;
    private int addTempo;

    public  RegistroTempoOnline (String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        tempoEsperado = 120;

    }
    public  RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;

    }
    public void adicionaTempoOnline(int tempo){
        this.addTempo = tempo;
        tempoOnline+= tempo;
    }
    public boolean atingiuMetaTempoOnline(){
        if( tempoOnline < tempoEsperado){
            return false;
        }
        else{
            return true;
        }
    }
    public String toString(){
        return nomeDisciplina + " " + tempoOnline + "/" + tempoEsperado;
    }
}
