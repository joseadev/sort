

public class ComparatorInteger<T> extends ComparatorBase<T> {

	public ComparatorInteger() {
		super ();
	}

	/**
	 * Compara dos elementos para indicar si el primero es menor, igual o mayor que el segundo elemento.
	 * @param e1 el primer  elemento.
	 * @param e2 el segundo elemento.
	 * @return el orden de los elementos. 
	 */
	@Override
	public int compare (T i1, T i2) {
		Integer int1 = (Integer) i1;
		Integer int2 = (Integer) i2;
		if (int1 == int2) return ComparatorIF.EQUAL;
		if (int1 > int2) return ComparatorIF.GREATER;
		if (int1 < int2) return ComparatorIF.LESS;
		return 0;
	}
}
