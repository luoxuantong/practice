package com.lemo.cmx.sort;

/*
 * ��������
 * һ�˿���������㷨�ǣ� ����
 * 1��������������i��j������ʼ��ʱ��i=0��j=N-1�� ����
 * 2���Ե�һ������Ԫ����Ϊ�ؼ����ݣ���ֵ��key���� key=A[0]�� ����
 * 3����j��ʼ��ǰ���������ɺ�ʼ��ǰ������j=j-1��j--����
 * �ҵ���һ��С��key��ֵA[j]��A[i]��A[j]������ ����
 * 4����i��ʼ�������������ǰ��ʼ���������i=i+1��i++����
 * �ҵ���һ������key��A[i]��A[i]��A[j]������ ����
 * 5���ظ���3��4��5����ֱ�� I=J�� 
 * (3,4�����ڳ�����û�ҵ�ʱ��j=j-1��i=i+1��ֱ���ҵ�Ϊֹ��
 * �ҵ���������ʱ��i�� jָ��λ�ò��䡣
 * ���⵱i=j�����һ��������i+��j-��ɵ������ѭ���������� 
 */
public class QuickSort {
	public static void sort(int[] data) {
		quickSort(data, 0, data.length - 1);
	}

	private static void quickSort(int[] data, int i, int j) {
		int pivotIndex = (i + j) / 2;
		// swap
		SortTest.swap(data, pivotIndex, j);

		int k = partition(data, i - 1, j, data[j]);
		SortTest.swap(data, k, j);
		if ((k - i) > 1)
			quickSort(data, i, k - 1);
		if ((j - k) > 1)
			quickSort(data, k + 1, j);

	}

	/**
	 * @param data
	 * @param i
	 * @param j
	 * @return
	 */
	private static int partition(int[] data, int l, int r, int pivot) {
		do {
			while (data[++l] < pivot)
				;
			while ((r != 0) && data[--r] > pivot)
				;
			SortTest.swap(data, l, r);
		} while (l < r);
		SortTest.swap(data, l, r);
		return l;
	}
}
