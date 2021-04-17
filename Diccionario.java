
import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejia
 */
public class Diccionario {
    private BinarySearchTree[] diccionario;
    public Diccionario(File file){
        diccionario = new BinarySearchTree[3];
        for(int i = 0; i <3;i++){
            diccionario[i] = new BinarySearchTree();
        }
        try {
			 Scanner myReader = new Scanner(file);
			 while (myReader.hasNextLine()) {
				 String data = myReader.nextLine();
				 String[] values = data.split(",");
                                 ArrayList vals = new ArrayList();
                                 vals.add(values[0].toUpperCase());
                                 vals.add(values[1].toUpperCase());
                                 vals.add(values[2].toUpperCase());
                                 ComparableAssociation worde = new ComparableAssociation(values[0].toUpperCase(), vals);
                                 ComparableAssociation words = new ComparableAssociation(values[1].toUpperCase(), vals);
                                 ComparableAssociation wordf = new ComparableAssociation(values[2].toUpperCase(), vals);
				 diccionario[0].add(worde);
                                 diccionario[1].add(words);
                                 diccionario[2].add(wordf);
			 }

		 } catch (FileNotFoundException e) {
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		 }
    }

    @Override
    public String toString() {
        return "Diccionario{" + diccionario[0].toString() + '}';
    }
    
    public String translate(String sentence, int lorigen,int ldestino){
        String tsentence = " ";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            ComparableAssociation c = new ComparableAssociation();
            c.setkey(words[i].toUpperCase());
            if(diccionario[lorigen].get(c) == null){
                tsentence = tsentence+" " + words[i].toUpperCase();
            }else{
            	tsentence = tsentence+" "+((ArrayList)((ComparableAssociation) diccionario[lorigen].get(c)).getValue()).get(ldestino);					 }

            }
        return tsentence;
    }
    
}
