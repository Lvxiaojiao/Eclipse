package MergeSort;

public class Merge {
	public static void sort(int[] ans, int left, int right) {
        int mid = (left + right) / 2;
        //���ֵ�ֻʣ��һ��Ԫ�ص����,���˳��ݹ����
        if (left >= right) {
            return;
        }
        sort(ans, left, mid);
        sort(ans, mid + 1, right);
        merge(ans, left, mid, right);
    }
	public static void merge(int[] ans, int left, int mid, int right) {
        //����������ʱ��
        int Actr = left;
        int Bctr = mid + 1;
        int Cctr = 0;
        int lenA = mid - left + 1;
        int lenB = right - mid;
        //������ʱ����,����ΪA��B���鳤��֮��
        int[] tmp = new int[right - left + 1];
        //ѭ��A��B�г��Ƚ϶̵ĳ��ȴ����Ķ����Ĵ���
        while (Actr <= mid && Bctr <= right) {
            if (ans[Actr] <= ans[Bctr]) {
                tmp[Cctr++] = ans[Actr];
                Actr++;
            } else {
                tmp[Cctr++] = ans[Bctr];
                Bctr++;
            }
        }
        //�����ߵĻ���ʣ�࣬�����ʣ��Ĺ鲢
        while (Actr <= mid){
            tmp[Cctr ++] = ans[Actr ++];
        }
        //����ұߵĻ���ʣ�࣬���ұ�ʣ��Ĺ鲢
        while (Bctr <= right){
            tmp[Cctr ++] = ans[Bctr ++];
        }
        //����ʱ������µ�ԭ����
        for (int i = 0; i < tmp.length; i++) {
            ans[left++] = tmp[i];
        }
    }
}

