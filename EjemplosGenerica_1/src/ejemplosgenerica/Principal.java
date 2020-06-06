/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosgenerica;

/**
 *
 * @author MoisesDario
 */
public class Principal {
    
    public static void main(String[] args){
        //Lienal
        System.out.println("LINEAL");
        ListaSimple<Fruta> listaFruta = new ListaSimple<>();
        Fruta f1= new Fruta("Chincuya" , "verde");
        Fruta f2= new Fruta("Papausa" , "blanco");
        Fruta f3= new Fruta("Anona" , "blanco");
        Fruta f4= new Fruta("Caspirol" , "blanco");
        Fruta f5= new Fruta("Chilacayoye" , "verde");
        Fruta f6= new Fruta("Chicozapote" , "cafe");
        Fruta f7= new Fruta("Zapote colorado" , "rojo");
        Fruta f9= new Fruta("Rambutan" , "rojo");
        Fruta f8= new Fruta("jobo" , "verde");
        
        listaFruta.add(f1);
        listaFruta.add(f2);
        listaFruta.add(f3);
        listaFruta.add(f4);
        listaFruta.add(f5);
        listaFruta.add(f6);
        listaFruta.add(f7);
        listaFruta.add(f9);
        listaFruta.add(f8);
        
        System.out.println("Elementos: " + listaFruta.size());
        System.out.println("Lista Fruta: " + listaFruta);
        Search<Fruta> buscaFruta =  new Search<>(); //Objeto de tipo fruta
        Fruta buscar = new Fruta("jobo","uuyuyu");  //Metodo de buscar
        System.out.println("Encontrado posicion: " + buscaFruta.Lineal(listaFruta,buscar,true));
        
        //Binaria
        System.out.println("BINARIA");
        ListaSimple<Fruta> listaFrutaBinario = new ListaSimple<>();
        Fruta arrayObjetos[] = new Fruta[9]; //Creamos un array de Objetos de la clase de Fruta
        arrayObjetos[0]= new Fruta("Papausa" , "blanco");
        arrayObjetos[1]= new Fruta("Anona" , "blanco");
        arrayObjetos[2]= new Fruta("Caspirol" , "blanco");
        arrayObjetos[3]= new Fruta("Chilacayoye" , "verde");
        arrayObjetos[4]= new Fruta("Chicozapote" , "cafe");
        arrayObjetos[5]= new Fruta("Zapote colorado" , "rojo");
        arrayObjetos[6]= new Fruta("Rambutan" , "rojo");
        arrayObjetos[7]= new Fruta("jobo" , "verde");
        arrayObjetos[8]= new Fruta("Chincuya" , "verde");
        
        listaFrutaBinario.add(arrayObjetos[0]);
        listaFrutaBinario.add(arrayObjetos[1]);
        listaFrutaBinario.add(arrayObjetos[2]);
        listaFrutaBinario.add(arrayObjetos[3]);
        listaFrutaBinario.add(arrayObjetos[4]);
        listaFrutaBinario.add(arrayObjetos[5]);
        listaFrutaBinario.add(arrayObjetos[6]);
        listaFrutaBinario.add(arrayObjetos[7]);
        listaFrutaBinario.add(arrayObjetos[8]);
       
        System.out.println("Elementos: " + listaFruta.size());
        System.out.println("Lista Fruta: " + listaFrutaBinario);
        arrayObjetos[8] = new Fruta("Chincuya","verde");  //Metodo de buscar
        System.out.println("Encontrado posicion: " + buscaFruta.binariaIterativo(listaFrutaBinario,arrayObjetos[8],true));

    }
}
