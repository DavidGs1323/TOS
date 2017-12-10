package technologiesofsoftware.blogspot.mx;

/**
 *@blog http://technologiesofsoftware.blogspot.mx/
 * @author AlejandroGS13
 */
public class TechnologiesofsoftwareBlogspotMx {
    public static void main(String[] args) {
        int iNumero;
        int iNumero2 = 10;
        int iSuma = 10;
        int iResta = 5;
        String sResultado = "El resultado es:";
        /*
        Operaciones basicas
        */
//        La variable iNumero guardara el resultado de la suma de iNumero2
//        y iSuma
        iNumero = iNumero2 + iSuma;
//        La variable iNumero guardara el resultado de la resta de iNumero2 
//        y iSuma
        iNumero = iNumero2 - iResta;
//      Operacion de suma "Concatenacion con variable String"
        sResultado = sResultado + iNumero;
        /*
        Suma directa a las variables
        */
        iNumero2 += iSuma;
        iNumero2 /= 10;
        sResultado += iNumero2; 
        System.out.println(sResultado);

        /*
        Operaciones dentro de los sout
        */
        int iNum1 = 20;
        int iNum2 = 10;
        System.out.println("iNum1 * iNum2 = "+(iNum1*iNum2));
        System.out.println("iNum1 + iNum2 = "+(iNum1+iNum2));
        System.out.println("iNum1 / iNum2 = "+(iNum1/iNum2));
        System.out.println("iNum1 % iNum2 = "+(iNum1%iNum2));
        System.out.println("iNum1 * 10 = "+(iNum1*10));
    }

}
