package ch17;

/*
 * 2023.09.18
 * 문서영 실습
 * chapter3 33강 <배열array - 자료를 순차적으로 한꺼번에 관리하는 방법>
 * Day12
 * */

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];		//배열 선언 방법1
		int arr2[] = new int[10];		//배열 선언 방법2
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < numbers.length; i++) {		//직접적인 숫자인 5를 적는것보다 변수의 길이를 적어주는게 좋아. 개수가 바뀔수도 있으니까.
			System.out.println(numbers[i]);
		}
		
		int[] ids;
		ids = new int[] {10, 20, 30};
		
		for(int id : ids) {		//"0번부터 ids라는 배열의 끝까지 하나씩 돌면서 그 데이터를 int id라는 변수에 넣어줘라." id와 ids의 데이터타입은 같아야. 
			System.out.println(id);
		}
		
		
		//베열을 선언하고, 배열에 1부터 10까지 쭉 넣은 다음에 1부터 10까지 꺼내서 더하는 거 해보기
		int[] arr = new int[10];
		
		for(int i=0, num=1; i<arr.length; i++, num++) {		//1부터 10까지 데이터를 넣어줬고 
			arr[i] = num;
		}
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {					//하나씩 꺼내서 total이라는 변수에 더한값 넣기.
			total += arr[i];
		}
		System.out.println(total);
		
		
		
		//배열의 길이와 요소의 개수는 동일하지 않습니다.
		//배열을 선언하고 곱해볼게.
		//근데 크기는 5짜리 배열을 선언하고 값은 세개만 줄거야. 
		//소수점까지 나오는 double로 배열을 선언해볼게.
		int count = 0;
		double[] dArr = new double[5];
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		double mtotal = 1;
		
		for(int i=0; i<count; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(mtotal);
//		System.out.println(dArr[5]);
		
		/*  이렇게 하면 안돼. 그럼 곱한값이 0.0이 나와
		double[] dArr = new double[5];
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		double mtotal = 1;
		 
		for(double dnum : dArr) {
			mtotal *= dnum;
		}
		
		System.out.println(mtotal);
		*/
		
		
		//문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for(char alpha : alphabets) {
			System.out.print(alpha + " ");
		}
		
	}

}







