package task;

import java.util.Scanner;

public class Calculator2 {
	// 확인용 코드
	public static void main(String[] args) {
		Calculator2 cal2 = new Calculator2();
		
		Calculator2_2 cal2_2 = cal2.new Calculator2_2();
		cal2_2.calculator2_2();
		
		Calculator2_4 cal2_4 = cal2.new Calculator2_4();
		cal2_4.calculator2_4();
		
		Calculator2_6 cal2_6 = cal2.new Calculator2_6();
		cal2_6.calculator2_6();
		
		Calculator2_8 cal2_8 = cal2.new Calculator2_8();
		cal2_8.calculator2_8();
		
		Calculator2_9 cal2_9 = cal2.new Calculator2_9();
		cal2_9.calculator2_9();
		
		Calculator2_10 cal2_10 = cal2.new Calculator2_10();
		cal2_10.calculator2_10();
		
		Calculator2_11 cal2_11 = cal2.new Calculator2_11();
		cal2_11.calculator2_11();
		
		Calculator2_12 cal2_12 = cal2.new Calculator2_12();
		cal2_12.calculator2_12();
		
		Calculator2_14 cal2_14 = cal2.new Calculator2_14();
		cal2_14.calculator2_14();
	}
	
	class Calculator2_1 {
		public void calculator2_1() {
			byte b = 5;
//			b = -b; // byte 타입 연산은 int로 변환되기에 타입 매치 error 발생
			int result = 10/ b;
			System.out.println(b);
		}
	}
	
	class Calculator2_2 {
		public void calculator2_2() {
			int x = 10;
			int y = 20;
			int z = (++x) + (y--); // ((++x) = 11) + ((y--) = 20) 이므로 31  
			System.out.println(z); // 31
		}
	}
	
	class Calculator2_3 {
		public void calculator2_3() {
			boolean stop = false;
			while(!stop) { // stop이 true면 !stop = false 이므로 while 종료
				stop = true;
			}
		}
	}
	
	class Calculator2_4 {
		public void calculator2_4() {
			int pencils = 534;
			int students = 30;
			//학생 1명이 가지는 연필 개수
			int pencilsPerStudent = (pencils / students); // 몫(나눗셈)
			System.out.println(pencilsPerStudent);
			
			//남은 연필 개수
			int pencilsLeft = (pencils % students); // 나머지
			System.out.println(pencilsLeft);
		}
	}
	
	class Calculator2_5 {
		public void calculator2_5() {
			int var1 = 5;
			int var2 = 2;
			double var3 = var1 / var2; // 잘못 작성 5 / 2 = 2이므로 var3 = 2.0
			int var4 = (int)(var3 + var2); // var4 = int(2.0 + 2 = 4.0) = 4
			System.out.println(var4); // 4
		}
	}
	
	class Calculator2_6 {
		public void calculator2_6() {
			int value = 356;
			// 100으로 나눈 나머지가 십의 자리 이하 수 이므로 빼면 백의자리 수만 남는다.
			System.out.println(value -= (value % 100)); 
		}
	}
	
	class Calculator2_7 {
		public void calculator2_7() {
			float var1 = 10f; 
			float var2 = var1 / 100; // float은 오차가 있기 때문에 0.1이아님
			if(var2 == 0.1) {  // 0.1f로 작성하면 10%으로 나옴
				System.out.println("10%입니다.");
			} else {
				System.out.println("10%가아닙니다.");
			}
		}
	}
	
	class Calculator2_8 {
		public void calculator2_8() {
			int lengthTop = 5;
			int lengthBottom = 10;
			int height = 7;
			double area = ((5+10) * 7 / 2); // 사다리꼴 넓이 = (윗변+아랫변) * 높이 / 2
			System.out.println(area);
		}
	}
	
	class Calculator2_9 {
		public void calculator2_9() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("첫번째 수: ");
			double firstNum = scanner.nextDouble();
			System.out.print("두번째 수: ");
			double secondNum = scanner.nextDouble();
			if(secondNum == 0 || secondNum == 0.0) {
				System.out.println("결과: 무한대");
			}else {
				double result = firstNum / secondNum;
				System.out.printf("결과:%.2f\n", result);
			}
		}
	}
	
	class Calculator2_10 {
		public void calculator2_10() {
			int var1 = 10;
			int var2 = 3;
			int var3 = 14;
			// "."문자열이 결합되어 var2 + "." + var3가 문자열이 되므로 
			// parsDouble 사용하여 double 타입으로 변환
			double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
			System.out.println("원의 넓이: " + var4);
		}
	}
	
	class Calculator2_11 {
		public void calculator2_11() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("아이디: ");
			String name = scanner.nextLine();
			
			System.out.println("패스워드: ");
			String strpassword = scanner.nextLine();
			
			int password = Integer.parseInt(strpassword);
			
			if(name.equals("java")) {
				if(password == 12345) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패: 패스워드 틀림");
				}
			}else {
				System.out.println("로그인 실패: 아이디 존재하지 않음");
			}
		}
	}
	
	class Calculator2_12 {
		public void calculator2_12() {
			int x = 10;
			int y = 5;
			System.out.println((x > 7) && (y<=5)); // (true)
			// (x > 7) = true (y<=5) = true -> true && true = true
			System.out.println((x % 3 == 2) || (y % 2 != 1)); // false
			// (x % 3 == 2) = false (y % 2 != 1) = false -> false || false = false
		}
	}
	
	class Calculator2_13 {
		public void calculator2_13() {
			int value = 10;
			value = value + 10; // (value += 10;)
			value = value - 10; // (value -= 10;)
			value = value * 10; // (value *= 10;)
			value = value / 10; // (value /= 10;)
		}
	}
	
	class Calculator2_14 {
		public void calculator2_14() {
			int score = 85;
			String result = (!(score>90)) ? "가" : "나";
			// score>90이 score 90 초과면 true 이므로 
			// 부정인 !(score>90)은 score가 90 이하면 "가" 초과면 "나" result에 반환
			System.out.println(result); // 가
		}
	}

}
	
