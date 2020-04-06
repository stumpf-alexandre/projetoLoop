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
		/*estrutura de repetição while*/
		int num = 0;
		while (num <= 10) {/*verifica e depois executa*/
			System.out.println("O número atual é : " + num);
			num++;
		}
	}
	public static void loopDoWhile() {
		/*estrutura de repetição do while*/
		int num = 0;
		do {/*executa e depois verifica*/
			System.out.println("O número atual é : " + num);
			num++;
		}while(num <= 10);
	}
	public static void loopFor() {
		/*estrutura de repetição for*/
		for(int num = 0; num <= 10; num++) {/*verifica e depois executa*/
			System.out.println("O número atual é : " + num);
		}
		System.out.println("*********************");
		for(int num2 = 10; num2 >= 0; num2--) {
			System.out.println("O número atual é : " + num2);
		}
		System.out.println("*********************");
		/*com break (parada)*/
		for(int num3 = 0; num3 <= 10; num3++) {
			if (num3 == 7) {
				System.out.println("Encontrei o número " + num3 + " que estava sendo procurado");
				break;
			}
			System.out.println("O número atual é : " + num3);
		}
		System.out.println("*********************");
		/*com continue (continuar)*/
		for(int num3 = 0; num3 <= 10; num3++) {
			if (num3 == 3 || num3 == 6 || num3 == 9) {
				System.out.println("Encontrei o número " + num3 + " que estava sendo procurado");
				continue;
			}
			System.out.println("O número atual é : " + num3);
		}
	}
}
