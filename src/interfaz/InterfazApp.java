/**
 * @author josuerom
 * @date 22/09/2024 20:47:45
**/
package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Misionero;

public class InterfazApp {
    public static void main(String[] args) {
        Misionero misionero;
        ArrayList<String> lst;
        SearchStateSpaces sss;

        System.out.println("===: Misioneros & Canibales :===");        

//        misionero = new Misionero();
        misionero = new Misionero(3, 3, 1, 0, 0, 0);

        sss = new SearchStateSpaces("0 0 0 | 3 3 1", misionero, 5); 
        lst = sss.solve();

        System.out.println("Número de pasos: " + lst.size());
        while (!lst.isEmpty()) {
            System.out.println(lst.getFirst());
            lst.removeFirst();
        }
    }               
}