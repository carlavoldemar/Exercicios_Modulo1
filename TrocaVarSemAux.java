/*
 * Escreva um programa para trocar o valor de duas vari�veis,
 *  sem o uso de vari�veis auxiliares
 */
public class TrocaVarSemAux {

	public static void main(String[] args) {
		int a, b;
	      a = 15;
	      b = 27;

	      System.out.println("Antes da troca : a, b = " + a + ", " + b);

	      a = a + b; //42
	      b = a - b; //-12
	      a = a - b; //15-(-12)=27

	      System.out.println("Depois da troca : a, b = " + a + ", " + b);

	}

}
