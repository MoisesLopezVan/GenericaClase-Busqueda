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
public class Fruta implements Comparable<Fruta>{
    private String nombre;
    private String color;
    
    public Fruta(String n, String c){
        nombre = n;
        color = c;
    }
    
    @Override
    public int compareTo(Fruta f){
        return getNombre().compareTo(f.getNombre());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public String toString(){
       return nombre+"-"+color;
   }
    
}
