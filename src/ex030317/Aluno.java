package ex030317;

import java.util.ArrayList;

public class Aluno {
    String nome;
    float nota;
    int contacto;

    public Aluno(String nome, float nota, int contacto) {
        this.nome = nome;
        this.nota = nota;
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
}
