public class Ilya_quest {

	public static void main(String[] args) {

		// Задание 4 Cw11

		int[] tab = new int[rand(1, 10)];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = rand(0, 100);
		}
		int[] tab2 = new int[rand(1, 10)];
		for (int i = 0; i < tab.length; i++) {
			tab2[i] = rand(0, 100);
		}
		int[] tab3 = new int[rand(1, 10)];
		for (int i = 0; i < tab.length; i++) {
			tab3[i] = rand(0, 100);
		}
		int[][] tabBig = { tab, tab2, tab3 };
		print(tabBig);

	}

	private static void print(int[][] name) {
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j]);
			}
			System.out.println();
		}
	}

	private static int rand(int min, int max) {
		return (min + (int) (Math.random() * ((max - min) + 1)));

	}

}
