package ex030317;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class AddAluno {


   
    
    public AddAluno(){
       
       
        
        ArrayList<Aluno> al = new ArrayList<Aluno>();
        
        Aluno al1 = new Aluno("Ze",17,968273617);
        Aluno al2 = new Aluno("Manuel",10,968213647);
        Aluno al3 = new Aluno("Albano",11,968223647);
        Aluno al4 = new Aluno("Pitosco",15,968273647);
        Aluno al5 = new Aluno("Camarão",20,968373647);
        
        al.add(al1);
        al.add(al2);
        al.add(al3);
        al.add(al4);
        al.add(al5);
        
        ordenar(al);
        
        
        for(int i = 0;i<al.size();i++){
            System.out.println("Contents of al: " + al.get(i).getNome() + " Nota : " + al.get(i).getNota() + " contacto : " + al.get(i).getContacto() );
        }
    }
    public ArrayList ordenar(ArrayList al){
        
        Collections.sort(al, new Comparator<Aluno>(){
            public int compare(Aluno lu1,Aluno lu2){
                return (int) (lu2.getNota()-lu1.getNota());
            }
       
    });
   
     return al;
       
    }

    
}
