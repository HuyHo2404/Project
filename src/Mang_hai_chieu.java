import java.util.Random;
import java.util.Scanner;

public class Mang_hai_chieu {
	int [][]a; int m,n; //m la so hang, n so cot
	void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("nhap so hang: "); m=kb.nextInt();
		System.out.println("nhap so cot: "); n=kb.nextInt();
		a=new int [m][n];  Random rd = new Random();
		for(int i=0;i<m;i++) { //System.out.println("\n Nhap hang thu " +(i+1) );
		for(int j=0;j<n;j++){  //System.out.print("\t Nhap pt o cot thu "+(j+1)+ ":");
			a[i][j]=rd.nextInt()%100;
			}
		}
	}
	void in() {
		for(int i=0;i<m;i++) {
			System.out.println("\n");
			for(int j=0;j<n;j++)
				//System.out.print(" "+ a[i[j]);
		System.out.format("%4d",a[i][j]);		
		}
	}
	void maxd()
	{
		for(int i=0;i<m;i++) {
			int md = a[i][0];
			for(int j=1;j<n;j++)
				if(a[i][j]>md)
					md=a[i][j];
			System.out.println("\nMax dong "+i+"="+md);
		}
	}
	/*void xoay_mang() {
		int left=0,right=n-1;
		
	}*/
	void xoayp() {
		int [][]b; b=new int [n][m];
		for(int i=0;i<n;i++) {
			int k=m-1;
			for(int j=0;j<m;j++) {
				b[i][j]=a[k][i]; k--;
			}
			a=b; int t=m; m=n;n=t;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mang_hai_chieu m = new Mang_hai_chieu();
		m.nhap();
		m.in();
		m.maxd();
		m.in();
	}

}
