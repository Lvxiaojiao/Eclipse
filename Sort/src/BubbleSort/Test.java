package BubbleSort;
import java.util.Random;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���ɲ�������
		
		int testNumber = 10;//ʵ�����
		long[] consumedTime =new long[testNumber];//��ÿ��ʵ���ʱ�ļ�������λ��������
		
		for(int i=0; i < testNumber; i++){
			int[] test = new int[1000*(i+1)];
			generate(test);	//��������	
			//����ǰ�������	
			//output(test);
			long startTime = System.currentTimeMillis(); //����ʼ��¼ʱ��					
			BubbleSort.sort(test);
			long endTime = System.currentTimeMillis(); //����ʼ��¼ʱ��
			consumedTime[i] = endTime - startTime;
			//������������
			//output(test);
			
		}
		
		//�������ʱ��
		for(int i=0;i<testNumber;i++){
			System.out.print(consumedTime[i]);
			System.out.print(',');
		}

	}

	private static void output(int[] test) {
		// �������
		for(int i=0; i<test.length;i++){
			System.out.print(test[i]);
			System.out.print(',');
		}
		System.out.println();
	}

	private static void generate(int[] test) {
		// ��������
		Random r = new Random();
		for(int i=0; i<test.length; i++){
			test[i] = r.nextInt(1000);
		}
			
		
	}

}

