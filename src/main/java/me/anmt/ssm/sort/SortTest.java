package me.anmt.ssm.sort;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 1, 4 };
		System.out.println("����ǰ��" + Arrays.toString(arr));
		// InsertSort.sort(arr);
		// BubbleSort.sort(arr);
		// SelectionSort.sort(arr);
		// ShellSort.sort(arr);
		// QuickSort.sort(arr);
		// MergeSort.sort(arr);
		// HeapSort.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));
	}

	/*
	 * ���������е�����Ԫ��
	 */
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
