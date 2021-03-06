import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.IdentityHashMap;
import java.util.Calendar;
import java.util.Date;

// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
class Ejercicio {
    public static void main(String[] args) throws FileNotFoundException {
        // Elimine la inicialización a las siguientes declaraciones.
        // Ejemplo:
        //     int i = 10;
        //       |
        //       v
        //     int i;
        //                                          Operador eliminar => d

        Integer i = new Integer("1234");
        FileInputStream fis = new FileInputStream("nombres.txt");
        IdentityHashMap odhm = new IdentityHashMap(1 << 8);
        Date fch = Calendar.getInstance().getTime();
        // Respuesta sugerida {{{
        //     Posicionate en el espacio subsecuente a la variable "i" y
        //     presiona dt;
        //     'd' es el operador "delete" y 't;' es una búsqueda inclusiva
        //     del carácter antes del ';' sobre la misma línea, por lo que
        //     juntos forman el comando compuesto:
        //     "borrar de aquí hasta el carácter anterior al punto y
        //     coma (inclusivo)"
        //     Repita la acción en las demás variables, posicionándose al
        //     final de sus nombres y presionando .
        // }}}
// *v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*v*
    }
}
// ¿Necesitas ver las instrucciones de nuevo?
// Puedes saltar entre el archivo anterior y el actual con
//  <C-O>    Salto anterior ("O" de "oldest")
//  <C-I>    Salto siguiente (Literalmente la "I" no tiene significado,
//           se eligió por estar al lado de la "O")

// vim: sts=4 ts=4 sw=4 ai sta nu fdm=marker tw=75
