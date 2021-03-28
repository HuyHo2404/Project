import java.util.Scanner;
public class Tinh_do_phuc_tap {
	long sub1(int n)
	{
		int i,j;
		long sum=0;
		for(i = 0; i<n; i++);
			for(j = 0; j<i; j++)
		sum++;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		long t1,t2;
		Tinh_do_phuc_tap m =new Tinh_do_phuc_tap();
		t1=System.currentTimeMillis();
		System.out.println(" Sub ="+ m.sub1(n));
		t2=System.currentTimeMillis();
		System.out.println("\n thoi gian chay sub 1 voi n ="+ n+ "la: "+ (t2-t1));
	}

}
