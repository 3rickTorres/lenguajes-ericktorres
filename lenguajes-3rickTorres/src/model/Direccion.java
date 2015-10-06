/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Direccion {
    private String calle;
    private String colonia;
    private String municipio;  

  
    /*el constructor de defecto
    
    */
    public Direccion() {
    }
    
    
    
    
    
    /*el constructor donde se inicalizan los atributos
    
    */
    /**
     * 
     * @param calle El primer paramentro es el valor de la calle
     * @param colonia El segundo paramentro es el valor de la colonia
     * @param municipio El tercer paramentro es el valor del municipio
     */
    public Direccion(String calle, String colonia, String municipio) {
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
    }
    
    
    
    
    
    
    
    /**
     * @return Este método te regresa el valor que tiene el atributo calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle En este metodo debes de poner dentro del 
     * parentesis el valor que quieras o que desees que tenga la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
   


}



