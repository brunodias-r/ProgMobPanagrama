package br.senac.rj.panagrama;

import static java.util.Arrays.*;

import java.util.Arrays;

public class Panagrama {
    private String frase;

    public Panagrama(String frase){
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    private boolean panagrama(String frase) {
        frase = frase.toLowerCase();
        frase = frase.replace(" ","");
        char[] fraseArray = frase.toCharArray();
        Arrays.sort(fraseArray);
        if(fraseArray.length<26 || fraseArray[0]!='a' && fraseArray[fraseArray.length - 1]!='z') return false;
        for(int i=0; i< fraseArray.length-1; i++)
            if(fraseArray[i+1]-fraseArray[i]>1) return false;
        return true;
    }

    public boolean verifica(){
        return panagrama(this.frase);
    }
}