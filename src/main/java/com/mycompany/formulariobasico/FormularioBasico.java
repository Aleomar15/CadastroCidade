/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.formulariobasico;

/**
 *
 * @author Alexandre_Marinho
 */
public class FormularioBasico {
/*Antes de iniciar criar banco de dados :
    CREATE DATABASE cidades(cod int PRIMARY KEY NOT NULL, nomeCid varchar(100),nomeP varchar(100),populacao int*/
    public static void main(String[] args) {
        TelaCidades tl = new TelaCidades();
        tl.setLocationRelativeTo(tl);
        tl.setVisible(true);//tornar a tela visivel
    }
}
