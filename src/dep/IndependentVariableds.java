package dep;

public class IndependentVariableds {

	/**
	 * ����1:�жϿɷ�ʹ�õ���������
	 * ����2:�õ�ʽ������Ԫ
	 * ����3:����δ֪����ֵ��
	 * ����4:�ж��Ƿ����ì��,��ֵ���½�����Ͻ�
	 * @param b ����ʽ��,����߽�����
	 * @param a ��ʽ��,���������������
	 * @return
	 */
	public boolean independentVariablesTest(int[][] b, int[][] a) {
		//����1
		if (!isIndependent(a))
			return false;
		
		//����2
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				if (a[i][j] != 0) {
					elimination(b, a[i], j);
					break;
				}
			}
		}

		int[][] bounds = new int[b[0].length - 1][4];

		//����3
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length - 1; j++) {
				if (b[i][j] > 0) {
					if (bounds[j][0] < b[i][b[i].length - 1] / b[i][j]
							|| bounds[j][2] == 0) {
						bounds[j][0] = b[i][b[i].length - 1] / b[i][j];
						if (bounds[j][2] == 0)
							bounds[j][2] = 1;
					}
				} else if (b[i][j] < 0) {
					if (bounds[j][1] > b[i][b[i].length - 1] / b[i][j]
							|| bounds[j][3] == 0) {
						bounds[j][1] = b[i][b[i].length - 1] / b[i][j];
						if (bounds[j][3] == 0)
							bounds[j][3] = 1;
					}
				}
			}
		}

		//����4
		for (int i = 0; i < bounds.length; i++) {
			if (bounds[i][0] > bounds[i][1])
				return false;
		}

		return true;
	}

	/**
	 * �жϷ������еķ����ǲ��Ƕ�Ԫ����
	 * @param a ��ʽ������a<sub>1</sub>i<sub>1</sub> + a<sub>2</sub>i<sub>2</sub> + ...= a<sub>n</sub>
	 * @return
	 */
	private boolean isIndependent(int[][] a) {
		int nonZero;
		for (int i = 0; i < a.length; i++) {
			nonZero = 0;
			for (int j = 0; j < a[i].length - 1; j++) {
				if (a[i][j] != 0)
					nonZero++;
			}
			if (nonZero > 2)
				return false;
		}
		return true;
	}

	/**
	 * �õ�ʽ�������еķ���a_sub��ȥ����ʽ��b�е�һ��δ֪��
	 * @param b ����ʽ��
	 * @param a_sub ��ʽ����
	 * @param index ��ȥ������
	 */
	private void elimination(int[][] b, int[] a_sub, int index) {
		for (int i = 0; i < b.length; i++) {
			if (b[i][index] != 0) {
				for (int j = 0; j < a_sub.length; j++) {
					if (j != index && a_sub[j] != 0) {
						b[i][j] += -1 * b[i][index] * a_sub[j] / a_sub[index];
					}
				}
				b[i][index] = 0;
			}
		}
	}
}
