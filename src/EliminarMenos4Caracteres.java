import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarMenos4Caracteres {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Fuego");
        cadenas.add("Tierra");
        cadenas.add("Mar");
        cadenas.add("Aire");

        Iterator<String> it = cadenas.iterator();
        while (it.hasNext()) {
            String cadena = it.next();
            if (cadena.length() < 4) {
                it.remove();
            }
        }

        System.out.println(cadenas);
    }
}
