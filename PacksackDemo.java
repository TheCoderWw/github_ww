public class PacksackDemo {
	public static void main(String[] args) {
		int n = 5; // ��Ʒ�ĸ���
		int w = 8; // ����������
		int d = 7; // �������ݻ�
		int[] weight = { 0, 3, 4, 6, 1, 2 }; // ������Ʒ�ļ�ֵ
		int[] volume = { 0, 2, 1, 4, 1, 4 }; // ������Ʒ������
		int[] value = { 0, 6, 5, 7, 3, 8 }; // ������Ʒ�����
		int[][][] tem = getMax(value, weight, volume, n, w, d);
		// for (int i = 1; i <= n; i++) {
		// for (int j = 1; j <= w; j++) {
		// for (int k = 1; k <= d; k++) {
		// System.out.print(tem[i][j][k]);
		// }
		// System.out.println();
		// }
		// System.out.println();
		// }
		System.out.println(tem[n][w][d]);
	}

	public static int[][][] getMax(int[] value, int[] weight, int[] volume, int n, int w, int d) {
		int[][][] m = new int[n + 1][w + 1][d + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				for (int k = 1; k <= d; k++) {
					if (weight[i] > j || volume[i] > k) {
						m[i][j][k] = m[i - 1][j][k];
					} else {
						m[i][j][k] = Math.max(m[i - 1][j][k], m[i - 1][j - weight[i]][k - volume[i]] + value[i]);
					}
				}
			}
		}
		return m;
	}
}
