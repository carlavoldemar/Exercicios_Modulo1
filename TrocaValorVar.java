/*
 * Escreva um programa para trocar o valor de duas variáveis.
 */
public class TrocaValorVar {

	public static void main(String[] args) {
		int var = 1;
		int var2 = 2;
		int aux = 0;
		aux = var2;
		var2 = var;
		var = aux;
		System.out.println(var);
		System.out.println(var2);
	}

}
