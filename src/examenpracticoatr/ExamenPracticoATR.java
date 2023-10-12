/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenpracticoatr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author digis
 */
public class ExamenPracticoATR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*  System.out.println("Ingrese la palabra a prueba SIN ESPACIOS");
       String palabra2;
       palabra2=sc.next();
       //palabra[0]=palabra2;
        char[ ] nombre;
        nombre = new char[palabra2.length()];
        char[] palindromo;
        palindromo= new char[palabra2.length()];
        int tamanio= palabra2.length();
        for (int i = 0; i<tamanio ; i++) {
           // palabra[i]=palabra2.charAt(i);
          
            nombre[i]=palabra2.charAt(i);
            palindromo[i]=palabra2.charAt(i);
        }
        int desplazamiento=tamanio/2;
        int aux2=0;
        for (int i = 0; i <= desplazamiento; i++) {
             int aux=tamanio-i-1;
             if (nombre[i]==palindromo[aux]) {
                
                aux2+=1;
                if(aux2==desplazamiento){
                    System.out.println("Es palindromo");
                }
                
            }else if(nombre[i]==' '){
               int  aux3=aux-1;
            }else if(nombre[i]!=palindromo[aux]){
                i=desplazamiento;
                 System.out.println("No es palindromo");
            }
        }
        
        //System.out.println(nombre[1]);
    }*/
        
        //serie de 
        /**

        int serie, num1 = 0, num2 = 1, suma = 1;

        // Muestro el valor inicial
        System.out.println(num1);
        System.out.println("Ingrese el numero a donde quiere llegar");
        serie = sc.nextInt();
        if (serie == 1) {
            System.out.println("0,1");
        }
        for (int i = 1; i < serie + 1; i++) {
            if (num1==0&&num2==1) {
                System.out.println(" ");
            }else{
                 System.out.println("Resultado de la suma " + (suma));
            }
            // muestro la suma
           
            if (serie == 1) {
                System.out.println("0,1");
            }else{
                System.out.println(num1+" "+num2);
            }
            //primero sumamos
            suma = num1 + num2;

            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;

        }*/
        System.out.println("Ingrese el total de numeros a ingresar");
        int total= sc.nextInt();
        int[] numeros;
        numeros=new int[total];
        numeros[0]=1;
        for (int i = 0; i < total; i++) {
            System.out.println("ingresa el valor "+(i+1));
            numeros[i]=sc.nextInt();
        }
        int i, j, aux;
        for (i = 0; i < numeros.length - 1; i++) {
            for (j = 0; j < numeros.length - i - 1; j++) {                                                              
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        for (int k = 0; k < total; k++) {
            System.out.print(numeros[k]+",");
        }
                
    }

    
}
