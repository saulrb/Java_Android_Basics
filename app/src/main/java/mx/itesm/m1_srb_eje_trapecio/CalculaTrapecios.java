package mx.itesm.m1_srb_eje_trapecio;

import java.util.ArrayList;

/**
 * Created by saul on 28/1/2017.
 */

public class CalculaTrapecios {

    public static void main(String[] args){
        ArrayList<Trapecio> trapecios = new ArrayList<Trapecio>();
        trapecios.add( new TrapecioEscaleno(10,8,7,60,30));
        trapecios.add( new TrapecioEscaleno(15,9,10,50,45));
        trapecios.add( new TrapecioIsoceles(10,8,6));
        trapecios.add( new TrapecioIsoceles(18,10,11));
        trapecios.add( new TrapecioRectangulo(14,7,6));
        trapecios.add( new TrapecioRectangulo(21,14,12));
        for( Trapecio trapecio: trapecios)
             System.out.println(" Area trapecio:".concat(String.valueOf(trapecio.despliegaTrapecio())));
    }

}
