package lp2;

public class controlarDisciplina {
    private String nomeDisciplina;
    private int horasEstudo;

    private double[] notas;

    private double media;

    public controlarDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];

    }
    public void cadastraHoras(int horas){
        this.horasEstudo = horas;
    }
    public void cadastraNota(int nota,double valorNota){
        this.notas[nota - 1] = valorNota;
    }


    public boolean aprovado(){
        this.media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        if(media >= 7.0){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return nomeDisciplina + " " + horasEstudo + " " + media + "[" + notas[0]+", " + notas[1]+", " + notas[2]+", " + notas[3] + "]";
    }

}