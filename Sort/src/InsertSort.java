
public class InsertSort {
	public static void main(String[] args) {

		  int[] a={49,38,65,97,76,13,27,49};

		  insertSort(a);

		  System.out.print("排序结果：");

		  for(int i=0;i<a.length;i++){

			  System.out.print(a[i]+" ");

		  }

	}

	public static void insertSort(int[] a){

		int temp=0;

		for(int i=1;i<a.length;i++){

			int j=i-1;

			temp=a[i];

			while(j>=0&&temp<a[j]){//temp比前边的值小，前边的值就依次后移

				a[j+1]=a[j];

				j--;

			}

			a[j+1]=temp;//注意要加1，插入正确位置

		  //每趟输出

			Output(a,i);

		}

	}

	public static void Output(int[] a,int i){

		System.out.print("第"+i+"趟： ");

		  for(int k=0;k<a.length;k++){

		    System.out.print(a[k]+" ");

	       }

		  System.out.println();

	}

}

