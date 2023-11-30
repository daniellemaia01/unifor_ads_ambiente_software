
package br.unifor.ads.software.atividade_final;

//MotorMarcia


public class MotorMarcia {
    private String tipo;
    private int potencia;


    public MotorMarcia (String tipo, int potencia) {
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
    
    //Método Criado por Danielle
    
    public void statusMotor( ) {
    	System.out.println(this.getTipo());
    	System.out.println(this.getPotencia());
    	
    }
}
