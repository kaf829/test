package bit.basic.array;

public class ArrayEx6 {

	static int[][] m = new int[2][2];
	static int[] result = new int[2];

	public boolean empty() {







		return false;
	}

	public static boolean isFull() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] != 0) {

					return true;
				}
			}
		}
		return false;
	}

	public static void add(int row, int col, int value) {

		m[row][col] = value;
	}

	public static int modify(int row, int col, int value, int modifyV) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == value) {
					m[i][j] = modifyV;
				}
			}
		}
		return modifyV;

	}

	public static void increment() {
		if (isFull() == true) {
			int i = m.length;
			m = new int[i * 2][i * 2];
			add(i, i, i);
		}
	}

	public static void print() {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 리턴값 배열로
	public static int[] search(int data) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == data) {
					result[0] = data;
//                       System.out.println(r);
				}
			}
		}

		System.out.println(result[0]);
		return result;
	}

	public static void delete(int row, int col) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == m[row][col]) {
					m[row][col] = 0;

				}
			}

		}

	}

	public static void main(String[] args) {
		add(0, 0, 1);
		add(0, 1, 2);
		add(1, 0, 3);
		add(1, 1, 4);
//      increment();
//		delete(0, 0);
//		modify(0,1,2,1);
		System.out.println("값 삭제");
		print();
		System.out.println("삭제할 값 2");
		delete(0,1);
		print();
		
//		search(1);

//      search(1);
//      increment();

	}

}