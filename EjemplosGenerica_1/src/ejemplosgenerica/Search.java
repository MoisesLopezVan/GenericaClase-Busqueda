/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosgenerica;

import java.util.ArrayList;

/**
 *
 * @author MoisesDario
 */
public class Search <T extends Comparable<T>>{
    
    public int Lineal(ListaSimple<T>a,T b, boolean d){
       int iter=0;
       for(int i=1; i <= a.size(); i++){
           if(b.compareTo(a.get(i)) == 0){
               if(d)
                   System.out.println("Iteraciones Lineal: " + iter);
               return i;
           }
           if(d)
                iter++;
       }  
       return -1;
    }
    
    public int binariaIterativo(ListaSimple<T> a, T b, boolean d){
        int resultado = -1;
        int iter = 0;
        int dato=0;
        int arreglo[]=null;
        int centro,inf=0;
        int sup=0;
        
        for(int i=1; i < a.size(); i++){           
            if(b.compareTo(a.get(i))== 0){
                while(inf <= sup){
                    if(d)
                        iter++;
                        System.out.println("Iteraciones Binario Iterativo: " + iter);
                    return i;
                }
                centro = (inf + sup) /2;

                if(arreglo[centro] == dato){
                    return centro;
                }else if(arreglo[centro] < dato)
                    inf = centro +1;
                else if(arreglo[centro] > dato)
                    sup = centro - 1; 

            } 
            if(d)
                iter++;
        }
        return -1;
    }
    
    public int binariaRecusiva(ListaSimple<T> a, T b, boolean d){
        int resultado = -1;
        int iter=0;
        int array[]=null;
        int firstElement = 0;
        int lastElement = 0; 
        int elementToSerach=0;

        for(int i=1; i < a.size(); i++){
            if(b.compareTo(a.get(i)) == 0){
                if(lastElement >= firstElement){                 
                    if(d)
                        iter++;
                        System.out.println("Iteraciones Binario Recursivo: " + iter);
                    return i;
                }
                int mid = firstElement + (lastElement - firstElement) / 2;

                if(array[mid] == elementToSerach)
                    return mid;
                if(mid > elementToSerach)
                    return binariaRecusiva(a, b,d);

                return binariaRecusiva(a, b,d);
            }          
            if(d)
                iter++;
        }
        return resultado;
    }
    
}
