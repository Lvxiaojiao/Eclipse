package BubbleSort;

public class BubbleSort {
	public static   void sort(int[] a){
		//提示：数组a的大小用a.length得到
		//实现冒泡排序
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
				k=a[j];
				a[j+1]=k;
				a[j]=a[j+1];
			}
		}
	}		
	}
}
