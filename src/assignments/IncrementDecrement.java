package assignments;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
//		int i = 11; // memory 11,12,13
//		i = i++ + ++i;// 11+13
//		System.out.println(i);// 24
//2
//		int a = 11, b = 22, c;//memory a=11,12,13   b=22,23,24
//
//		c = a + b + a++ + b++ + ++a + ++b;//11+22+11+22+13+24
//
//		System.out.println("a=" + a);//13
//		System.out.println("b=" + b);//24
//		System.out.println("c=" + c);//11+22+11+22+13+24=103

//3
//		int j=5;//memory 0,1,0,1,0//6//5
//		 j= j++ - --j + ++j - j--;//0-0+1-1//5-5+6-6
//		
//		System.out.println(j);//0
//		System.out.println(++j);//1

//4 wrong program		
//		boolean flag=true;
//		flag++;
//		System.out.println(flag);
//		

//5

//		int s=1, t=2, k=3;//memory s=1,0  t=2,1  k=3,2
//		int m = s-- - t-- - k--;//1-2-3
//		System.out.println("s="+s);//0
//		System.out.println("t="+t);//1
//		System.out.println("k="+k);//2
//		System.out.println("m="+m);//-4
//		
//		int ch='A';
//		
//		System.out.println(ch++);//65
//		System.out.println(ch);//66
//		
//	char ch1='A';
//	System.out.println(ch1);//A
//	System.out.println(++ch1);//B

//6
//		int a = 1, b = 2; // 1-2+2-1=-1+1

//		System.out.println(--b - ++a + ++b - --a);// 0
//7

//		int i=19, j=29, k;// k should be initialize
//		int m = i-- - j-- - k--;
//		System.out.println("i="+i);
//		System.out.println("j="+j);
//		System.out.println("k="+k);

//8
//		int i = 11;
//		int j = --(i++);//invalid argument

//9
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;// -1*-1*-1*-1
//		System.out.println(p);// 1

//10

//		int a=1;//2,3,1
//		a = a++ + ++a * --a - a--;//1+3*2-2
//		System.out.println(a);//5

//11
//		int a = 11++;//Invalid argument
//		System.out.println(a);

//12
//		int ch = 'A';
//		System.out.println(ch++);//A Ascii value i.e. 65
//		System.out.println(ch);//66

//13
		char ch = 'A';

		System.out.println(++ch);//B
		
//14
		double d = 1.5, D = 2.5;//d=2.5  D=3.5
		System.out.println(d++ + ++D);//1.5+3.5=5.0
	}
}
