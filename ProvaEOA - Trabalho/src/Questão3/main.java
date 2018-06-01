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
        
        while(arq2.getFilePointer()<arq2.length()){
            Registro reg = new Registro();
            reg.leRegistro(arq1);
            
        }
        
        
        
    }
    
}
