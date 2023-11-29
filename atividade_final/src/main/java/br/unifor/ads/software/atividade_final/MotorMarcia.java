package br.unifor.ads.software.atividade_final;

MotorMarcia

public class MotorMarcia {
        private String tipo;
    private int potencia;


    public MotorMarcia(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
//CarolineMetodo
public static void main (String[]args){
  MotorMarcia motor = mew MotorMarcia("Gasolina",75);
        System.out.printIn("Tipo de motor:" + motor.getTipo())
        System.out.printIn("Potência do Motor:" + motor.getPotencia() + "Cavalos")
                
}
}
