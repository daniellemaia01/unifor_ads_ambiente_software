public class CarroHibrido {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean motorEletrico;

    // Construtor
    public CarroHibrido(String marca, String modelo, int ano, boolean motorEletrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motorEletrico = motorEletrico;
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

    public boolean isMotorEletrico() {
        return motorEletrico;
    }

    public void setMotorEletrico(boolean motorEletrico) {
        this.motorEletrico = motorEletrico;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Motor Elétrico: " + (motorEletrico ? "Sim" : "Não"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criar uma instância de CarroHibrido
        CarroHibrido meuCarro = new CarroHibrido("Toyota", "Prius", 2022, true);

        // Exibir informações do carro
        meuCarro.exibirInformacoes();
    }
}