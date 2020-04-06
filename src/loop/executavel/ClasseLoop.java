package loop.executavel;

public class ClasseLoop {
	public static void main(String[] args) {
		loopWhile();
		System.out.println("*********************");
		loopDoWhile();
		System.out.println("*********************");
		loopFor();
	}
	public static void loopWhile() {
		/*estrutura de repeti��o while*/
		int num = 0;
		while (num <= 10) {/*verifica e depois executa*/
			System.out.println("O n�mero atual � : " + num);
			num++;
		}
	}
	public static void loopDoWhile() {
		/*estrutura de repeti��o do while*/
		int num = 0;
		do {/*executa e depois verifica*/
			System.out.println("O n�mero atual � : " + num);
			num++;
		}while(num <= 10);
	}
	public static void loopFor() {
		/*estrutura de repeti��o for*/
		for(int num = 0; num <= 10; num++) {/*verifica e depois executa*/
			System.out.println("O n�mero atual � : " + num);
		}
		System.out.println("*********************");
		for(int num2 = 10; num2 >= 0; num2--) {
			System.out.println("O n�mero atual � : " + num2);
		}
		System.out.println("*********************");
		/*com break (parada)*/
		for(int num3 = 0; num3 <= 10; num3++) {
			if (num3 == 7) {
				System.out.println("Encontrei o n�mero " + num3 + " que estava sendo procurado");
				break;
			}
			System.out.println("O n�mero atual � : " + num3);
		}
		System.out.println("*********************");
		/*com continue (continuar)*/
		for(int num3 = 0; num3 <= 10; num3++) {
			if (num3 == 3 || num3 == 6 || num3 == 9) {
				System.out.println("Encontrei o n�mero " + num3 + " que estava sendo procurado");
				continue;
			}
			System.out.println("O n�mero atual � : " + num3);
		}
	}
}
