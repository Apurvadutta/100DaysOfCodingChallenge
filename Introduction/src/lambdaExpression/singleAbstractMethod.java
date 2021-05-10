package lambdaExpression;

public class singleAbstractMethod {
	interface FuncInterface{
		int abstractFun(int x, int y);
		default void normalFun()
	    {
	       System.out.println("Hello");
	    }
	}

	public static void main(String[] args) {
		FuncInterface fobj = (x, y) -> x*y;//System.out.println(x*2);
		int res = fobj.abstractFun(5,6);
		System.out.println(res);
	}

}
