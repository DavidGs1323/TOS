package technologiesofsoftware.blogspot.mx;

/**
 *@blog http://technologiesofsoftware.blogspot.mx/
 * @author AlejandroGS13
 */
public class TechnologiesofsoftwareBlogspotMx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Declaracion de variables
         */
        String sVariable = "Blog de programacion";
        String blog = "http://technologiesofsoftware.blogspot.mx/";
        int year = 2017;
        int dia = 10;
        String mes = "diciembre";
        /*
            Imprimir variables
         */
        System.out.println(sVariable);
        System.out.println(blog);
        /*
            Imprimir variables concatenadas
         */
        System.out.println(sVariable + ":\n" + blog + "\n" + 
                dia + "/" + mes + "/" + year);
    }

}
