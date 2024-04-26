package ExemploEstrutura;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploVetor {

	public static void main(String[] args) {
		int[] numeros = new int[3];

		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 3;

	for (int i = 0; numeros.length > i; i++) {
		//numeros[0] => Escreve 2
		//numeros[1] => Escreve 4
		System.out.println(numeros[i]);
	}
	
	int[][] bidimensional = new int[3][3];
	
	bidimensional[0][0] = 10;
	bidimensional[2][2] = 100;
	
	System.out.println();
	for(int i = 0; i< 3; i++) {
		System.out.println(" ");
		for(int j = 0; j < 3; j++) {
			System.out.println(bidimensional[i][j] + " ");
		}
		System.out.println(" ");
	}
	
	int[][][] terceiradimensao = new int[3][3][3];
	int[][][][] quartaDimensao = new int[3][3][3][3];
	
	LinkedList<Integer> listaLinked = new LinkedList<Integer>();
	
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	int[] vector = new int[10];
	
	vector[0] = 1;
	vector[1] = 2;
	vector[2] = 3;
	vector[3] = 4;
	vector[4] = 5;
	vector[5] = 6;
	vector[6] = 7;
	vector[7] = 8;
	vector[8] = 9;
	vector[9] = 10;
	
	array.add(1);
	array.add(2);
	array.add(3);
	array.add(4);
	array.add(5);
	array.add(6);
	array.add(7);
	array.add(8);
	array.add(9);
	array.add(10);
	
	listaLinked.add(1);
	listaLinked.add(2);
	listaLinked.add(3);
	listaLinked.add(4);
	listaLinked.add(5);
	listaLinked.add(6);
	listaLinked.add(7);
	listaLinked.add(8);
	listaLinked.add(9);
	listaLinked.add(10);
	
	for (int vetores : vector) {
		System.out.println(vetores);
	}
	System.out.println();
	for (int itens : array) {
		System.out.println(itens);
	}
	System.out.println();
	for (int lista : listaLinked) {
		System.out.println(lista);
	}
	}

}
