package provaeoa.trabalho;

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
    
    public static void main(String[] args) {
        CriaArquivoDesordenado();
        
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
    
     public static void CriaArquivoOrdenado(){
       String chave = "11111111";
        String nome = "Nome1                                  1";
        String email = "email11                                1";
        String telefone = "telefone1111";         
        try{
            RandomAccessFile arq1 = new RandomAccessFile("E:\\arq1.dat","rw");
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
    
    public static void CriaArquivoDesordenado(){
        String chave = "11111111";
        String nome = "Nome1                                   ";
        String email = "email111gmail.com                       ";
        String telefone = "telefone1111";         
        try{
            RandomAccessFile arq1 = new RandomAccessFile("E:\\arq1Ordenado.dat","rw");
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
    
}
