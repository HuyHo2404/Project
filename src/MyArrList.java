import java.util.Scanner;
public class MyArrList {
	int []a;
	void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("nhap n:"); int n=kb.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=(int)(Math.random()*100);
	}
	void xuat(){
		System.out.println("\n Noi dung mag:");
		for(int i=0;i<a.length;i++) System.out.println(a[i]+ " ");
	}
	void chenx(int x, int k) {
		int i=0,n=a.length;
		if(k<1 || k>n+1) System.out.print("khong chen duoc");
		else {
			int []b; b=new int[n+1];
			for(i=0;i<k-1;i++) b[i]=a[i];
			for(i=n;i>k-1;i--) b[i]=a[i-1];
			b[k-1]=x;
			a=b;
		}
	}
	void xoa(int k) {
		int i=0, n=a.length;
		if(k<1||k>n) System.out.print("\nvi tri xoa khong hop le!");
		else {
			int []b=new int[a.length-1];
			for(i=0;i<k-1;i++) b[i]=a[i];
			for(i=k-1;i<a.length-1;i++) b[i]=a[i+1];
			a=b;
		}
	}
	int demle() {
		int d=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2!=0) d++;
		return d;
	}
	void daomang() {
		int i=0, j=a.length-1;
		while (i<j) {
			int t= a[i];
			a[i++] = a[j]; a[j--] = t;
		}
	}
	void xoaam() {
		int k=0;
		for(int i=0; i<a.length; i++) if(a[i]>=0) k++; //dem so pt>=0
		int []b = new int [k];   // cap phat bo nho cho b
		int j=0;
		for(int i=0;i<a.length;i++)
			if(a[i]>=0) b[j++]=a[i];
		a=b;
	}
	/*void cap() {
		
	}*/
	void xoay(int k)
	{
		for(int i=1; i<=k;i++) {
			int x = a[0];
			int n = a.length;
			for(int j=0; j<n-1; j++)
				a[j]=a[j+1];
			a[n-1]=x;
		}
	}
	void rev(int ll, int rr)
	{
		int i=ll-1,j=rr-1;
		while(i<j)
		{
			int t=a[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrList m = new MyArrList();
		Scanner sc= new Scanner(System.in);
		m.nhap();
		m.xuat();
		//m.chenx(-7, 4);
		//m.xuat();	
		//m.demle();
		//m.xoa(5);
		//m.xuat();
		//m.daomang();
		//m.xuat();
		//m.xoaam();
		//m.xuat();
		m.xoay(3);
		m.xuat();
    }

}
