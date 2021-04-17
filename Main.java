
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

     public static void main(String [] args) {
         int origen;
         int destino;
         JFileChooser fc = new JFileChooser();
                             fc.setDialogTitle("Elije el archivo de texto que contiene el diccionario");
                             fc.showDialog(null, "Abrir");
                             File file = fc.getSelectedFile();
         Diccionario diccionario = new Diccionario(file);
		 Object[] lenguajes = { "Inglés","Español", "Francés"};
		 Object[] funciones = {"Ver diccionario", "Traducir una oración desde un archivo de texto","Traducir una oración desde el teclado", "Salir"};
		 int ro = 0;
		 while (ro != 2) {
			 ro = JOptionPane.showOptionDialog(null,
					 "¿Qué acción desea realizar?",// pregunamos el tipo de MAP
					 "Opciones",
					 JOptionPane.YES_NO_CANCEL_OPTION,
					 JOptionPane.QUESTION_MESSAGE,
					 null,
					 funciones,
					 funciones[0]);

                     switch (ro) {
                         case 0:
                             System.out.println(diccionario.toString());
                             break;
                         case 1:
                             JFileChooser fc1 = new JFileChooser();
                             fc1.setDialogTitle("Elije el archivo de texto a traducir");
                             fc1.showDialog(null, "Abrir");
                             File file1 = fc1.getSelectedFile();
                              origen = JOptionPane.showOptionDialog(null,
                                     "Seleccione el lenguaje de origen",
                                     "Lenguajes",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.QUESTION_MESSAGE,
                                     null,
                                     lenguajes,
                                     lenguajes[0]);
                              destino = JOptionPane.showOptionDialog(null,
                                     "Seleccione el lenguaje de destino",
                                     "Lenguajes",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.QUESTION_MESSAGE,
                                     null,
                                     lenguajes,
                                     lenguajes[0]);
                             try {;
                                 Scanner myReader = new Scanner(file);
                                 while (myReader.hasNextLine()) {
                                     String data = myReader.nextLine();
                                     System.out.println(diccionario.translate(data, origen, destino));
                                     // se finaliza el programa
                                     
                                 }
                             } catch (FileNotFoundException e) {
                                 System.out.println("An error occurred.");
                                 e.printStackTrace();
                             }
                             break;
                         case 2:
                              origen = JOptionPane.showOptionDialog(null,
                                     "Seleccione el lenguaje de origen",
                                     "Lenguajes",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.QUESTION_MESSAGE,
                                     null,
                                     lenguajes,
                                     lenguajes[0]);
                              destino = JOptionPane.showOptionDialog(null,
                                     "Seleccione el lenguaje de destino",
                                     "Lenguajes",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.QUESTION_MESSAGE,
                                     null,
                                     lenguajes,
                                     lenguajes[0]);
                             Scanner sc = new Scanner(System.in);
                             String sentence = sc.nextLine();
                             System.out.println(diccionario.translate(sentence, origen, destino));
                             break;
                         default:
                             ro = 3;
                             break;
                     }



		 }


	 }
}
