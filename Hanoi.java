package java试题;

public class Hanoi {
	static int cout=0;
public static void Move(int n,char tow,char row)
{
	System.out.println("将第"+n+"个碟子从"+tow+"移动到"+row);
	cout++;
}
public static void hanoi(int n,char a,char b,char c)
{
	/*
	 * 移动碟子分为三步
	 * @第一步：设法将n-1个较小盘子依照移动规则从a塔移动到c塔
	 * @第二步：将剩下a塔中最大的盘子n从a塔移动到b塔
	 * @第三步：设法将n-1个较小的盘子从c塔移动到b塔
	 * 因此可分为两次n-1个盘子移动问题，可以使用递归
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
		System.out.print("移动的总次数为 :"+cout);
	}
}
