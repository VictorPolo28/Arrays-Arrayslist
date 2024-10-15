package com.example;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intercambio  {
    public static void main(String[] args) {
        //ingresamos los elementos
        int [] elementos ={5,10,20,3,85};

        //validamos los elemntos ingrresados
        System.out.println(Arrays.toString(elementos));
        //creamos el elemento  para luego modificarlo
        int primerElemento = elementos [0] = 85;
        
        int ultimoElemento = elementos [4] = 5;
        
        //validamos el nuevo orden
        System.out.println(Arrays.toString(elementos));

        //Verficar  Igualdad
        //ingresamos los   datos
        
        int [] Elementos2 ={5,10,2,3,25};

        //validamos igualdad
        Arrays.equals(elementos, Elementos2);

        //imprimimos el resultadp
        System.out.println("Son los datos giaules ?: " + Arrays.equals(elementos, Elementos2));

        //Encontrar el elemento máximo:
    
        
        //ordenamos  los datos de forma acendente
        Arrays.sort(elementos);

        //unavez ordenedos imprimos el ultimo numero ya que este sera el maximo

        System.out.println("El numero maximo  es : " + elementos[4]);

            //Encontrar el elemento mínimo:

        //Unavez ordenados imrpimos elprimer numero
        System.out.println("El numero minimos es: " + elementos[0]);

        //Suma de elementos:
        
        // serealiza la suma  sin ciclos
         int sumatotal = elementos[0] + elementos[1] +elementos[2] +elementos[3]+elementos[4];

         //mostros la suma total
         System.out.println("la suma total de  los elementos es: " +sumatotal);

         //calcualmos promedio
         int promedio = sumatotal / elementos.length;
         System.out.println("El promedio es: " + promedio);

         //Contar elementos pares: 
         
        //Validamos cuantos numeros pares hay en el arreglo con un switch para evitar usar ciclos

    int numerosPares = 0;
    int numerosImpares = 0;
     if (elementos [0] % 2 == 0) {
        numerosPares ++;
        
     }if (elementos [1] % 2 == 0) {
        numerosPares ++;
        
     }

     if (elementos [2] % 2 == 0) {
        numerosPares ++;
        
     }

     if (elementos [3] % 2 == 0) {
        numerosPares ++;
        
     }
      if (elementos [4] % 2 == 0) {
        numerosPares ++;
        
     }
           
     System.out.println("La cantidad   de numeros pares es: " + numerosPares);
        
         //Calcualamos los numeros impare
         if (elementos [0] % 2 != 0) {
            numerosImpares ++;
            
         }if (elementos [1] % 2 != 0) {
            numerosImpares ++;
            
         }
    
         if (elementos [2] % 2 != 0) {
            numerosImpares ++;
            
         }
    
         if (elementos [3] % 2 != 0) {
            numerosImpares ++;
            
         }
          if (elementos [4] % 2 != 0) {
            numerosImpares ++;
            
         }

         System.out.println("La cantidad   de numeros impares es: " + numerosImpares); 

         //Verificar si un elemento existe:

  
    
    //Validamos si el numero existe
     int numeroPerdido = Arrays.binarySearch(elementos,7 );
     System.out.println("El numero  esta en la posicion: " + numeroPerdido);
       
     //Invertir un arrayInvertir un array
   

       System.out.println("Orden actual " + Arrays.toString(elementos));
        //invertimos  elarray de manera manual
        
        int temp; // Variable temporal para almacenar valores durante el intercambio
        temp = elementos[0];
        elementos[0] = elementos[4];
        elementos[4] = temp;

temp = elementos[1];
elementos[1] = elementos[3];
elementos[3] = temp;

       System.out.println("Orden invertido : " + Arrays.toString(elementos));

         //ArraysList
         System.out.println("________________________________________");
         //Agregar un elemento al principio
         ArrayList<String> nombres = new ArrayList<String>();
         nombres.add("Julian");
         nombres.add("Mario");
         nombres.add("Yorman");
        
         
         //lista original
         System.out.println("la lista original es" + nombres);

         nombres.set(0,"Victor");

         //nueva lista
         System.out.println("Se agre un nuevo elemento al inicio: " + nombres);

         //Agregar un elemento al final
         nombres.add("Mayra");

         System.out.println("Se agre un nuevo elemento al final: " + nombres);

         //Eliminar el último elemento:
         nombres.remove("Mayra");

         System.out.println("Se elimino el ultimo elemento: " + nombres);

         //Eliminar el primer elemento:

         nombres.remove(0);
         System.out.println("Se removio el primer elemento" + nombres);

         //Obtener el último elemento:
         // validamos el  nuevo tamaño
         System.out.println("Tamaño actual de la lista" + nombres.size());

         //imprimimos el ultimo elemento
        System.out.println("El ultimo elemento este: " + nombres.get(1));

        //Obtener el primer elemento:
        System.out.println("El primer elemento es: " + nombres.get(0));

        //Verificar si el ArrayList está vacío
        System.out.println("Validamos  si la lista esta vacia: " + nombres.isEmpty() );

        //Obtener el tamaño del ArrayList:
        System.out.println("Tamaño actual de la lista" + nombres.size());

        //Verificar si un elemento existe:
        System.out.println("Validamos si la lista contiene   el  elemento Victor: " + nombres.contains("Victor"));

        //Obtener el índice de un elemento:
        System.out.println("Se obtiene el indice del elemento Mario: " + nombres.lastIndexOf("Mario"));
    }
}