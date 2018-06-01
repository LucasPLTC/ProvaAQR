/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
            RandomAccessFile arq1 = new RandomAccessFile("E:\\arq1.dat","rw");
            RandomAccessFile arq2 = new RandomAccessFile("E:\\arq2.dat","rw");
            
            long fim = arq1.length();
            long atual;
            long QReg = 102;  
            System.out.println(QReg);
            System.out.println(fim);
            
            
            arq1.seek(fim-QReg);
            System.out.println(arq1.getFilePointer());
            
            
            while(arq1.getFilePointer()>0){
                atual = arq1.getFilePointer();
                Registro reg = new Registro();
                reg.leRegistro(arq1);
                System.out.println(reg.getChave());
                Registros.add(reg);
                arq1.seek(atual-QReg);
            }
            if(arq1.getFilePointer()==0){
                Registro reg = new Registro();
                reg.leRegistro(arq1);
                System.out.println(reg.getChave());
                Registros.add(reg);
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
