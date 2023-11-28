public class Veiculo{
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Ford", "Fiesta");
        veiculo.acelerar();
        veiculo.frear();
    }

    public void acelerar() {
        System.out.println("O Veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O Veículo está freando.");
    }
}