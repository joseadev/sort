
import java.util.*;

public class ordenacion {
	
	
	// Creciente = true.
	// Decreciente = false;
	private boolean orden = true;

	public static void main(String[] args) {
		
		ordenacion ordenador = new ordenacion();
		ordenador.procesar();
		System.exit(0);
	}

	public ordenacion() {
	}
	
	private void procesar() {

		ComparatorIF<Integer> comparador = new ComparatorInteger<Integer>();
		orden = true;
		ArrayList<Integer> vector = new ArrayList<Integer>();
		vector.add(5);
		vector.add(6);
		vector.add(9);
		vector.add(3);
		vector.add(4);
		vector.add(6);
		vector.add(1);
		SortIF<Integer> algoritmo = new HeapSort<Integer>();
		ArrayList<Integer> vectorOrdenado = algoritmo.sort(vector, comparador, orden);
		for (Integer n: vectorOrdenado) {
			System.out.print(n.toString());
			System.out.print(" ");
		}
		
	}

}
