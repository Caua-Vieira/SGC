/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;

/**
 *
 * @author cauas
 */
public class AutorizacoesSaidas {
    private Membros membros;
    private String evento;
    private LocalDate data;

    public AutorizacoesSaidas(Membros membros, String evento, LocalDate data) {
        this.membros = membros;
        this.evento = evento;
        this.data = data;
    }

    public Membros getMembros() {
        return membros;
    }

    public void setMembros(Membros membros) {
        this.membros = membros;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
}
