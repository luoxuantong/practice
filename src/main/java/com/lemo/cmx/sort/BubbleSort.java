package com.lemo.cmx.sort;

/*
 * ?????????????????
 * ???��?????????????????��????????��??????????��
 * ????????????????1?????2????????��??????????????
 * ??????2???????3????????��??????????????????????
 * ???????????????????��???????????????????????????
 * ??????????????????????????????????????
 * ??????????????2???????3???????????????1????????��???2????????
 * ??��??????????????????????????????????????????��????????????????
 * ????????????????????��?????????????????
 * ??????????????????????????????????????????????????????????????? 
 */
public class BubbleSort {
	public static void sort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					SortTest.swap(data, j, j + 1);
				}
			}
		}
	}
}
