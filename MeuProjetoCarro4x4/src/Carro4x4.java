public class Carro4x4 {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean tracao4x4;

    // Construtor
    public Carro4x4(String marca, String modelo, int ano, boolean tracao4x4) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tracao4x4 = tracao4x4;
    }

    // Métodos getter e setter para acessar e modificar os atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isTracao4x4() {
        return tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tração 4x4: " + (tracao4x4 ? "Sim" : "Não"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criar uma instância de Carro4x4
        Carro4x4 meuCarro = new Carro4x4("Toyota", "Hilux", 2022, true);

        // Exibir informações do carro
        meuCarro.exibirInformacoes();
    }
}