package java����;

public class Hanoi {
	static int cout=0;
public static void Move(int n,char tow,char row)
{
	System.out.println("����"+n+"�����Ӵ�"+tow+"�ƶ���"+row);
	cout++;
}
public static void hanoi(int n,char a,char b,char c)
{
	/*
	 * �ƶ����ӷ�Ϊ����
	 * @��һ�����跨��n-1����С���������ƶ������a���ƶ���c��
	 * @�ڶ�������ʣ��a������������n��a���ƶ���b��
	 * @���������跨��n-1����С�����Ӵ�c���ƶ���b��
	 * ��˿ɷ�Ϊ����n-1�������ƶ����⣬����ʹ�õݹ�
	 */
	if(n>0)
	{
	hanoi(n-1,a,c,b);
	Move(n,a,b);
	hanoi(n-1,c,b,a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(2, 'A', 'B', 'C');
		System.out.print("�ƶ����ܴ���Ϊ :"+cout);
	}
}
