package mx.itesm.m1_srb_eje_trapecio;

/**
 * Created by saul on 27/1/2017.
 */

public class TrapecioEscaleno extends Trapecio {

    private double anguloAlfa;
    private double anguloBeta;
    private double lado1;
    private double lado2;

    public TrapecioEscaleno(double baseMayor, double baseMenor, double altura, double anguloAlfa, double anguloBeta) {
        super(baseMayor, baseMenor, altura);
        this.anguloAlfa = anguloAlfa;
        this.anguloBeta = anguloBeta;
        this.lado1 = Math.abs(calculaLado(anguloAlfa));
        this.lado2 = Math.abs(calculaLado(anguloBeta));
    }

    @Override
    public double calculaPerimetro() {
        return this.getBaseMayor() + this.getBaseMenor() + this.lado1 + this.lado2;
    }

    private double calculaLado(double angulo){
        return this.getAltura() / Math.sin(angulo);
    }

}
