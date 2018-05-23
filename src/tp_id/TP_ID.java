/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_id;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author a21250195
 */
public class TP_ID {

    public static ArrayList<Livro> procuraArtigosWook(String autor) throws FileNotFoundException{
        String pesquisa=autor.replaceAll("//s","+");
        HttpRequestFunctions.httpRequest1("https://www.wook.pt/pesquisa/", pesquisa, "Obras.html");      
        String er = "<a class=\"title-lnk\" href=\"/livro/([a-z0-9-])/([0-9]+)\"></a>";
        
       Scanner ler = new Scanner(new FileInputStream("Obras.html"));
       Pattern p1 = Pattern.compile(er);
       Matcher m1;
       String linha;
       Livro liv=null;
       ArrayList<Livro> lista = new ArrayList();
         while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m1 = p1.matcher(linha);
              while (m1.find()) {
                   String nome=m1.group(1);
                    liv = new Livro(nome);
                    lista.add(liv);
              }
         }
         ler.close();
        return lista;
        
    }
        
    public static void main(String[] args) throws FileNotFoundException{
         String pesquisa = "Oscar Wilde";
         ArrayList<Livro> res = new ArrayList();
         res = procuraArtigosWook(pesquisa);
      
       for(int i=0; i<res.size(); i++){
        System.out.println("Nome : " +res.get(i).getTitulo());

                                      }
   
    }
    
}
