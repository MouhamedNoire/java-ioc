package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /**
         * Injection des dependances par instanciation statique => new
         */
        DaoImplV2 d  = new DaoImplV2();
        /** Injection via constructor **/
        MetierImpl metierImpl = new MetierImpl(d);
        /**metierImpl.setDao(d); /** Injection via setter */
        System.out.println("RES = "+metierImpl.calcul());
    }
}
