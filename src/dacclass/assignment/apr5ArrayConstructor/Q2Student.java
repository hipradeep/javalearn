package dacclass.assignment.apr5ArrayConstructor;import java.util.Scanner;public class Q2Student {	int roll;	static int a[]=new int[5];	String name;	Scanner s=new Scanner(System.in);		void getData() {		System.out.print("\nEnter Marks = ");		for(int i=0;i<a.length;i++) {			a[i]=s.nextInt();		}	}		int average(int u,int v,int x,int y,int z) {		int avg;		avg=(u+v+x+y+z)/5;		return avg;	}		public static void main(String[] args) {		int av;		Q2Student t=new Q2Student();		t.getData();				av=t.average(a[0],a[1],a[2],a[3],a[4]);		System.out.print("\nAverage = "+av);				if(av<40) {			System.out.print("\n Fail");		}		else System.out.print("\n Pass");	}}