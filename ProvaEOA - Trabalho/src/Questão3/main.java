/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import provaeoa.trabalho.Registro;

/**
 *
 * @author Lucas Carvalho
 */
public class main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile arq1 = new RandomAccessFile("arq1Q3.dat","rw");
        RandomAccessFile arq2 = new RandomAccessFile("arq2Q3.dat","rw");
        RandomAccessFile arq3 = new RandomAccessFile("arq3Q3.dat","rw");
        
        long treg1 = (arq1.length())/102;
        long treg2 = (arq2.length())/102;
        long fim = treg2;
        long inicio = 0;
        long meio = fim/2;
        
        while(arq1.getFilePointer()<arq1.length()){
            Registro reg = new Registro();
            reg.leRegistro(arq1);
            
            while(arq2.getFilePointer() >= 0 && arq2.getFilePointer() < arq2.length()){
                Registro reg2 = new Registro();
                arq2.seek(meio*102);
                reg2.leRegistro(arq2);
                int ch1 = Integer.parseInt(reg.getChave().trim());
                int ch2 = Integer.parseInt(reg2.getChave().trim());
                if(ch1<ch2){
                    fim = meio-1;
                    meio= (inicio+fim)/2;
                }else if(ch1>ch2){
                    inicio = meio+1;
                    meio = (inicio+fim)/2;
                }else if(ch1 == ch2){
                    reg.escreveEndereco(arq3);
                    break;
                }
                if(inicio >=fim){
                    break;
                }
            }
            fim = treg2;
            inicio = 0;
            meio = (fim+inicio)/2;
            arq2.seek(inicio);
        }
        arq1.close();
        arq2.close();
        arq3.close();
        
        
        
    }
    
}
