package Model.entities;

import java.util.Arrays;

public class Carros {
    private String marca;
    private int id;
    private char[] chassi = new char[6]; // ✅ Correto
    private int ano;

    public Carros(String marca, int id, char[] chassi, int ano) {
        this.marca = marca;
        this.id = id;
        this.chassi = chassi;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setChasi(String placaChs) {
        if (placaChs.length() == 6) {
            chassi = placaChs.toCharArray();
        } else {
            System.out.println("O chassi deve ter exatamente 6 caracteres.");
        }
    }

    public void setChasi(char[] chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "marca='" + marca + '\'' +
                ", id=" + id +
                ", chassi=" + Arrays.toString(chassi) +
                ", ano=" + ano +
                '}';
    }
}
