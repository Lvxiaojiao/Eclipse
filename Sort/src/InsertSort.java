
public class InsertSort {
	public static void main(String[] args) {

		  int[] a={49,38,65,97,76,13,27,49};

		  insertSort(a);

		  System.out.print("��������");

		  for(int i=0;i<a.length;i++){

			  System.out.print(a[i]+" ");

		  }

	}

	public static void insertSort(int[] a){

		int temp=0;

		for(int i=1;i<a.length;i++){

			int j=i-1;

			temp=a[i];

			while(j>=0&&temp<a[j]){//temp��ǰ�ߵ�ֵС��ǰ�ߵ�ֵ�����κ���

				a[j+1]=a[j];

				j--;

			}

			a[j+1]=temp;//ע��Ҫ��1��������ȷλ��

		  //ÿ�����

			Output(a,i);

		}

	}

	public static void Output(int[] a,int i){

		System.out.print("��"+i+"�ˣ� ");

		  for(int k=0;k<a.length;k++){

		    System.out.print(a[k]+" ");

	       }

		  System.out.println();

	}

}

