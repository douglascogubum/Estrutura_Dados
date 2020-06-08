package application;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Atividade3 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>(5);
		ArrayDeque<Integer> pilha = new ArrayDeque<Integer>(5);
		ArrayDeque<Integer> fila = new ArrayDeque<Integer>(10);
		
		for (int i = 0; i < 5 ; i++) {
			lista.add(i + 1);
			pilha.push(lista.remove(0));
		}
		
		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
		}
		
		for (int i = 5; i < 10; i++) {
			lista.add(i + 1);
			pilha.push(lista.remove(0));
		}
		
		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
		}
		
		for(Integer queue : fila) {
			System.out.println(queue);
		}
	}
}
