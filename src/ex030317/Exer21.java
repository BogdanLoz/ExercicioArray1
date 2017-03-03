package ex030317;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer21 {
    public Exer21(){
        ArrayList al = new ArrayList();
        
        al.add('b');
        al.add(3);
        al.add("Carruagens");
        al.add(8.56);
        al.add("caixas de armazenamento");
        showAl(al);
        addAl(al);
        showAl(al);
    }
    
    public void showAl(ArrayList al){
        System.out.println("Contents of al: " + al);
    }
    
    public ArrayList addAl(ArrayList al){
        String newI = null;
        System.out.println("Introduza:");
        newI = new Scanner(System.in).nextLine();
        al.add(newI);
        return al;
    }
}
