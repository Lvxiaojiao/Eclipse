package BubbleSort;
import java.util.Random;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 生成测试数据
		
		int testNumber = 10;//实验次数
		long[] consumedTime =new long[testNumber];//对每次实验耗时的计数，单位：毫秒数
		
		for(int i=0; i < testNumber; i++){
			int[] test = new int[1000*(i+1)];
			generate(test);	//产生数据	
			//排序前输出数据	
			//output(test);
			long startTime = System.currentTimeMillis(); //程序开始记录时间					
			BubbleSort.sort(test);
			long endTime = System.currentTimeMillis(); //程序开始记录时间
			consumedTime[i] = endTime - startTime;
			//排序后输出数据
			//output(test);
			
		}
		
		//输出所耗时间
		for(int i=0;i<testNumber;i++){
			System.out.print(consumedTime[i]);
			System.out.print(',');
		}

	}

	private static void output(int[] test) {
		// 输出数据
		for(int i=0; i<test.length;i++){
			System.out.print(test[i]);
			System.out.print(',');
		}
		System.out.println();
	}

	private static void generate(int[] test) {
		// 产生数据
		Random r = new Random();
		for(int i=0; i<test.length; i++){
			test[i] = r.nextInt(1000);
		}
			
		
	}

}

