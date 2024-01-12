package Collettion;

import java.util.*;

public class Listas {

    public static void main(String[] args) {


        List nouvaList = new ArrayList<>();
        nouvaList.add("Gonzalo");
        nouvaList.add("Pedro");
        nouvaList.add("Gustavo");
        nouvaList.add("Juan Carlos");
        nouvaList.add("Alfredo");
        nouvaList.add("Hola");
        showEach(nouvaList);

        /*for(Object elem: nouvaList)
            System.out.println("hola " + elem + " bienvenido");

    }*/

 /*nouvaList.forEach(elemt -> {
     System.out.println("hola " + elemt + " bienvenido");
 });*/


        Set nuovoSet = new HashSet<>();

        nuovoSet.add("gonzalo");
        nuovoSet.add(2);
        nuovoSet.add(true);


        nuovoSet.add("hola ");

        showEach(nuovoSet);

    }

    public static void showEach(Collection col){

        col.forEach(el -> {

            if(el.equals("hola")){
                System.out.println(el);
            }else{
                System.out.println(el);
            }
        });


    }






}

