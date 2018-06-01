package provaeoa.trabalho;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import provaeoa.trabalho.Registro;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Carvalho
 */
public class CriaArquivos {
    
    public static void main(String[] args) throws FileNotFoundException {
        CriaArquivoOrdenadoQ1();
        CriaArquivoDesordenadoEmailQ2();
        CriaArquivosOrdenadoQ3();
        CriaArquivosDesordenadoQ3();
        
    }
    
    
            
    public static void GravaArq(RandomAccessFile arq1,String chave, String nome, String email, String telefone, String contador, String contador2) throws IOException{
        chave = chave.replaceAll(contador,contador2);
        nome = nome.replaceAll(contador,contador2);
        email = email.replaceAll(contador,contador2);
        telefone = telefone.replaceAll(contador,contador2);
        try{
        Registro r1 = new Registro(chave,nome,email,telefone);
        r1.escreveEndereco(arq1);
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
    
     public static void CriaArquivoOrdenadoQ1(){
       String chave = "11      ";
        String nome = "Nome11                                  ";
        String email = "email11                                 ";
        String telefone = "telefone1111";         
        try{
            RandomAccessFile arq1 = new RandomAccessFile("arq1.dat","rw");
            Registro r1 = new Registro(chave,nome,email,telefone);
            r1.escreveEndereco(arq1);
            GravaArq(arq1,chave,nome,email,telefone,"1","2");
            GravaArq(arq1,chave,nome,email,telefone,"1","3");
            GravaArq(arq1,chave,nome,email,telefone,"1","4");
            GravaArq(arq1,chave,nome,email,telefone,"1","5");
            GravaArq(arq1,chave,nome,email,telefone,"1","6");
            GravaArq(arq1,chave,nome,email,telefone,"1","7");
            GravaArq(arq1,chave,nome,email,telefone,"1","8");
            GravaArq(arq1,chave,nome,email,telefone,"1","9");
           
            
            
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
    public static void CriaArquivoDesordenadoEmailQ2(){
        String chave = "11111111";
        String nome = "Nome1                                   ";
        String email = "email111gmail.com                       ";
        String telefone = "telefone1111";         
        try{
            RandomAccessFile arq1 = new RandomAccessFile("arq1Desordenado.dat","rw");
            Registro r1 = new Registro(chave,nome,email,telefone);
            r1.escreveEndereco(arq1);
            GravaArq(arq1,chave,nome,"email111gmail.com                       ",telefone,"1","3");
            GravaArq(arq1,chave,nome,"email11                                 ",telefone,"1","5");
            GravaArq(arq1,chave,nome,"email11                                 ",telefone,"1","6");
            GravaArq(arq1,chave,nome,"email111gmail.com                       ",telefone,"1","8");
            GravaArq(arq1,chave,nome,"email11                                 ",telefone,"1","9");
            GravaArq(arq1,chave,nome,"email11                                 ",telefone,"1","0");
            GravaArq(arq1,chave,nome,"email111gmail.com                       ",telefone,"1","2");
            GravaArq(arq1,chave,nome,"email11                                 ",telefone,"1","4");
           
            
            
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
    
    public static void CriaArquivosDesordenadoQ3(){
       String chave = "1       ";
        String nome = "Nome11                                  ";
        String email = "email1                                  ";
        String telefone = "telefone11  ";         
        try{
            RandomAccessFile arq1 = new RandomAccessFile("arq1Q3.dat","rw");
            Registro r1 = new Registro(chave,nome,email,telefone);
            r1.escreveEndereco(arq1);
            GravaArq(arq1,chave,nome,email,telefone,"1 ","15");
            GravaArq(arq1,chave,nome,email,telefone,"1","4");
            GravaArq(arq1,chave,nome,email,telefone,"1 ","16");
            GravaArq(arq1,chave,nome,email,telefone,"1","8");
            GravaArq(arq1,chave,nome,email,telefone,"1 ","13");
            GravaArq(arq1,chave,nome,email,telefone,"1","9");
            GravaArq(arq1,chave,nome,email,telefone,"1 ","17");
            GravaArq(arq1,chave,nome,email,telefone,"1 ","12");
            
            
        
            
            
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
    
     public static void CriaArquivosOrdenadoQ3(){
       String chave = "1       ";
        String nome = "Nome11                                  ";
        String email = "email1                                  ";
        String telefone = "telefone11  ";         
        try{
           
            RandomAccessFile arq2 = new RandomAccessFile("arq2Q3.dat","rw");
            Registro r2 = new Registro(chave,nome,email,telefone);
            
            GravaArq(arq2,chave,nome,email,telefone,"1","2");
            GravaArq(arq2,chave,nome,email,telefone,"1","3");
            GravaArq(arq2,chave,nome,email,telefone,"1","5");
            GravaArq(arq2,chave,nome,email,telefone,"1","6");
            GravaArq(arq2,chave,nome,email,telefone,"1","7");
            GravaArq(arq2,chave,nome,email,telefone,"1 ","10");
            GravaArq(arq2,chave,nome,email,telefone,"1 ","11");
            GravaArq(arq2,chave,nome,email,telefone,"1 ","14");
            
            
           
            
            
        }catch(Exception e){
            System.out.println("error");
        }
    }
}
