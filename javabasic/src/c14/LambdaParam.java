package c14;

public class LambdaParam {
	
	public void getPrintable(Printable p) {
		System.out.println("getPrintable 호출됨");
	}
	
	public static void main(String[] args) {
		LambdaParam lp = new LambdaParam();
		lp.getPrintable(new Printable() {
			
			@Override
			public void print(String s) {
				
			}
		});
		lp.getPrintable((s)->{});
	}
}
