/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import provaeoa.trabalho.Registro;

/**
 *
 * @author Lucas Carvalho
 */
public class main {
    public static void main(String[] args) throws IOException {
        
        //String Busc = JOptionPane.showInputDialog(null, "CEP", "Insira o CEP",0);
        ArrayList<Registro> Registros = new ArrayList<Registro>();
        try{
            RandomAccessFile arq1 = new RandomAccessFile("arq1Desordenado.dat","rw");
            RandomAccessFile arq2 = new RandomAccessFile("arq2Gmail.dat","rw");
            
            long fim = arq1.length();
            long atual;
            long QReg = 102;  
          
            
            
            
            while(arq1.getFilePointer()<arq1.length()){
                Registro reg = new Registro();
                reg.leRegistro(arq1);
                if(reg.terminaCom(reg.getEmail(),"gmail.com")){
                Registros.add(reg);
                }
            }
            
            
          
            for(Registro e:Registros){
                System.out.println("err");
                e.escreveEndereco(arq2);
            }
            
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}

    

