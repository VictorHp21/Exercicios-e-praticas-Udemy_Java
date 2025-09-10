package application;

import model.entities.Box;
import model.entities.Eletronicos;
import model.entities.Fruta;
import model.entities.Livro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        File box_todos_os_itens = new File("C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Treinos\\box_todos_os_itens.txt.txt");

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Fruta("Banana"));
        frutas.add(new Fruta("Maçã"));
        frutas.add(new Fruta("Laranja"));
        frutas.add(new Fruta("Morango"));

        List<Eletronicos> eletronicos = new ArrayList<>();
        eletronicos.add(new Eletronicos("Mouse"));
        eletronicos.add(new Eletronicos("Teclado"));
        eletronicos.add(new Eletronicos("Monitor"));
        eletronicos.add(new Eletronicos("Mouse Pad"));

        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Livro Bela "));
        livros.add(new Livro("Livro Ana "));
        livros.add(new Livro("Livro Rapido"));
        livros.add(new Livro("Livro Gigante"));

        Box<Fruta> frutasBox = new Box<Fruta>().addLista(frutas);
        frutasBox.getItems().sort(null);


        Box<Eletronicos> eletronicosBox = new Box<Eletronicos>().addLista(eletronicos);
        eletronicosBox.getItems().sort(Comparator.comparing(Eletronicos -> Eletronicos.getNome()));

        Box<Livro> livrosBox = new Box<Livro>().addLista(livros);
        livrosBox.getItems().sort(Comparator.comparing(Livro -> Livro.getNome()));



        System.out.println("Box de frutas: ");
        printList(frutasBox);
        System.out.println("-------------------------");
        System.out.println("Box de eletronicos: " );
        printList(eletronicosBox);
        System.out.println("-------------------------");
        System.out.println("Box de livros: ");
        printList(livrosBox);
        System.out.println("-------------------------");

        Box<Object> boxAll = new Box<Object>();

        copy(frutasBox,boxAll);
        copy(eletronicosBox,boxAll);
        copy(livrosBox,boxAll);




        System.out.println("Box com todos os itens: ");
        printList(boxAll);

        salvarBoxEmArquivo(boxAll, box_todos_os_itens.getPath());



    }

    public static <T> void copy (Box <? extends T> source, Box<? super T> destiny) {
        for (T item : source.getItems()) {
            destiny.add(item);
        }
    }

    public static void printList(Box<?> Box){
        for (Object item : Box.getItems()) {
            System.out.println(item + " ");
        }



    }

    public static void salvarBoxEmArquivo(Box<?> box, String box_todos_os_itens) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(box_todos_os_itens))) {
            for (Object item : box.getItems()) {
                writer.write(item.toString());
                writer.newLine();
            }
            System.out.println("Arquivo salvo: " + box_todos_os_itens);
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }
}
