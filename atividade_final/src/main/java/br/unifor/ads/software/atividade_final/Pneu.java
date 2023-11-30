// Classe João Neto

package br.unifor.ads.software.atividade_final;

public class Pneu {

    private String Marca;

    private int tamanho;

    public Pneu(String Marca, int tamanho){
        this.Marca = Marca;
        this.tamanho = tamanho;

    }

    public void exibirpneuinfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Tamanho: " + this.tamanho);
    }

    public String getMarca() {
        return Marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


}
public static void main(String[] args) {
    Pneu meuPneu = new Pneu("Pirelli", 16);
        meuPneu.exibirpneuinfo();
}


