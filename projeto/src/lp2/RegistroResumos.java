package lp2;

public class RegistroResumos {

    private int contaResumo;
    private int maxResumo;
    private Resumo[] resumos = new Resumo[100];


    public RegistroResumos(int numeroDeResumos) {
        this.maxResumo = numeroDeResumos;
        this.contaResumo = 0;
        this.resumos = new Resumo[100];

    }


    public void adiciona(String tema, String resumo) {
        int sizeArray = this.resumos.length;
        int i = this.contaResumo % sizeArray;
        this.resumos[i] = new Resumo(tema, resumo);
        this.contaResumo++;
        if(){}
    }

    public String[] pegaResumos() {
        String[] resumo2 = new String[contaResumo];
        for (int i = 0; i < contaResumo; i++) {
            resumo2[i] = resumos[i].getTema() + ": " + resumos[i].getTexto();
        }
        return resumo2;

    }

    public String imprimeResumos() {
        String print = "- " + this.contaResumo + " " + "resumos(s) cadastrado(s) \n- ";
        String separtor = " | ";
        for (int i = 0; i < this.contaResumo; i++) {
            print += this.resumos[i].getTema();
            if (!(i == contaResumo - 1)) {
                print += separtor;
            }
        }
        return print;
    }

    public int conta() {
        return (this.contaResumo);
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < contaResumo; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

}


