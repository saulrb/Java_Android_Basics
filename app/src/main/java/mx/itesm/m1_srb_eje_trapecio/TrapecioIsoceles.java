package mx.itesm.m1_srb_eje_trapecio;

/**
 * Created by saul on 27/1/2017.
 */

public class TrapecioIsoceles extends Trapecio {

    private double lado;

    public TrapecioIsoceles(double baseMayor, double baseMenor, double altura) {
        super(baseMayor, baseMenor, altura);
        this.lado = this.calculaLado();
    }

    @Override
    public double calculaPerimetro() {
        return this.getBaseMayor() + this.getBaseMenor() + this.lado * 2 ;
    }

    private double calculaLado(){
        double n = 0;
        n =  ( this.getBaseMayor() - this.getBaseMenor() ) / 2;
        return Math.sqrt(Math.pow(n,2) + Math.pow(this.getAltura(),2));
    }
}
