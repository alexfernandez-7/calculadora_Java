/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Calculador {
    private int numero1;
    private int numero2;
    public Calculador()
    {
      numero1=0;
      numero2=0;
    }
    public void cambiarNumero1( int numero1)
    {
    this.numero1=numero1;
    }
    public void cambiarNumero2( int numero2)
    {
     this.numero2=numero2;
    }
    public int sumar()
    {
     return numero1+numero2;
    }
    public int dividir()
    {
     return numero1/numero2;
   }
    public int restar()
    {
     return numero1-numero2;       
    }
    public int multiplicar()
    {
     return numero1*numero2;   
    }

    

    
}
