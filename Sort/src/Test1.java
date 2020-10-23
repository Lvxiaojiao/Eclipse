
public class Test1 {
	public static void main(String[] args) {
		int x,a,b,c;
		for(x=432;x>=123;x--) {
			a=x/100;
			b=x/10%10;
			c=x%10;
			x=100*a+10*b+c;
			if(a!=b&&c!=b&&a!=c&&a<5&&b<5&&c<5&&a!=0&&b!=0&&c!=0)
			{
			System.out.printf("the number is %d\n",x);
			}
		}
	}
}
