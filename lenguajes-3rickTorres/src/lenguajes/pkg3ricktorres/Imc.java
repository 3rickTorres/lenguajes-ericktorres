/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.pkg3ricktorres;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
    
    public Imc(){
        peso=150f;
        altura=1.11f;
        }
    public float calcular(){
    float resultadoImc=peso/(altura*altura);
    return resultadoImc;
    }
    
}
