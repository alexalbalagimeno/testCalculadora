package org.iesam.calculadora;

public class Calculadora extends Object {

	public int sumar(int operando1, int operando2) {
		return operando1 + operando2;
	}

	public int restar(int operando1, int operando2) {
		return operando1 - operando2;
	}

	public int multiplicar(int operando1, int operando2) {
		return operando1 * operando2;
	}

	public int dividir(int operando1, int operando2) throws DivisioZeroException {
		if (operando2 == 0) {
			throw new DivisioZeroException("No es pot dividir entre 0");
		}
		return operando1 / operando2;
	}
}
