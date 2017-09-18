package me.anmt.ssm.sort;

/*
 * �����������˼��
 * ��n��Ԫ�ص����з�Ϊ������������������֣�������������ʾ������ʾ�� ����
 * {{a1}��{a2��a3��a4������an}} ����
 * {{a1�ţ�a2��}��{a3�ţ�a4�� ����an��}} ��
 * {{a1(n-1����a2(n-1) ����},{an(n-1)}} ����
 * ÿ�δ�����ǽ��������еĵ�һ��Ԫ�����������е�Ԫ�شӺ���ǰ������бȽϣ�
 * �ҳ�����λ�ã�����Ԫ�ز��뵽�������еĺ���λ���С�
 */
public class InsertSort {
	public static void sort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			for (int j = i; (j > 0) && (data[j] < data[j - 1]); j--) {
				SortTest.swap(data, j, j - 1);
			}
		}

	}
}
