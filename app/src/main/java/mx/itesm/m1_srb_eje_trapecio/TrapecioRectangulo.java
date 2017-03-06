package mx.itesm.m1_srb_eje_trapecio;

/**
 * Created by saul on 27/1/2017.
 */

public class TrapecioRectangulo extends Trapecio {

    private double lado1;
    private double lado2;

    public TrapecioRectangulo(double baseMayor, double baseMenor, double altura) {
        super(baseMayor, baseMenor, altura);
        this.lado1 = altura;
        this.lado2 = this.calculaLado2();
    }

    @Override
    public double calculaPerimetro() {
        return this.getBaseMayor() + this.getBaseMenor() + this.lado1 + this.lado2;
    }

    private double calculaLado2(){
        return Math.sqrt(Math.pow((this.getBaseMayor() - this.getBaseMenor()), 2) + Math.pow(this.lado1, 2));
    }

}
