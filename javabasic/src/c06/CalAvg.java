package c06;

public class CalAvg {
	int[] points;
	
	CalAvg(int ... points) {
		this.points = points;
	}
	// 총합
	int getSum() {
		int sum = 0;
		for(int point:points) {
			sum += point;
		}
		return sum;
	}
	//평균
	double getAvg() {
		double avg = (double)getSum() / points.length;
		return avg;
	}
	public static void main(String[] args) {
		CalAvg ca = new CalAvg(new int[] {80, 70, 60});
		System.out.println("평균: " + ca.getAvg());
	}
}
