package exs;

public class Ex_40 {

	public static void main(String[] args) {
		int[] auxCont = { 1, 0, 0 };

		for (int i = 1; i < 21; i++) {
			int result = auxCont[0] + auxCont[1] + auxCont[2];

			if (i == 3) {
				auxCont[1] = 1;
				auxCont[2] = 1;
			}
			
			if(i >= 4) {
				auxCont[2] = auxCont[1];
				auxCont[1] = auxCont[0];
				auxCont[0] = result;
			}
			
			System.out.println(result);

		}

	}

}
