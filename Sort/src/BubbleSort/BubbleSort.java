package BubbleSort;

public class BubbleSort {
	public static   void sort(int[] a){
		//��ʾ������a�Ĵ�С��a.length�õ�
		//ʵ��ð������
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
