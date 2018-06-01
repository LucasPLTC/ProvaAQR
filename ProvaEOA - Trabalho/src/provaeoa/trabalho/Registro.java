/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaeoa.trabalho;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/**
 *
 * @author Lucas Carvalho
 */
public class Registro {
    
    private String chave;
    private String nome;
    private String email;
    private String telefone;
    
    
    public Registro(String chave, String nome, String email,String telefone){
        this.chave = chave;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public Registro(){
        
    }
    
    public void leRegistro(DataInput in)throws IOException{
        
    byte chave[] = new byte[8];
    byte nome[] = new byte[40];
    byte email[] = new byte[40];
    byte telefone[] = new byte[12];
    
    in.readFully(chave);
    in.readFully(nome);
    in.readFully(email);
    in.readFully(telefone);
    in.readByte();
    in.readByte();
    
    Charset enc = Charset.forName("ISO-8859-1");
    
    this.chave = new String(chave,enc);
    this.nome = new String(nome,enc);
    this.email = new String(email,enc);
    this.telefone = new String(telefone,enc);
        
    }
    
  
    
    public boolean terminaCom(String a, String b){
        a = a.trim();
        boolean result = false;
        if(a.endsWith(b)){
            result = true;
        }
        return result;
    }
    
    
    public void escreveEndereco(DataOutput dout) throws IOException
    {
        
        Charset enc = Charset.forName("ISO-8859-1");
        dout.write(this.chave.getBytes(enc));
        dout.write(this.nome.getBytes(enc));
        dout.write(this.email.getBytes(enc));
        dout.write(this.telefone.getBytes(enc));
        dout.write(" \n".getBytes(enc));
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
