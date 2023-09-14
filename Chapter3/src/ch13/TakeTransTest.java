package ch13;

/*
 * 2023.09.14
 * 문서영 실습
 * chapter3 30강 <객체간의 협력 collaboration> 객체간의 협력이 일어나는 상황 test
 * Day11
 * */

public class TakeTransTest {

	/*
	 * James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
	 * James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
	 * Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
	 * 두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
	 * */
	
	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);		//100번 버스를 탔어
		Subway subwayGreen = new Subway(2);		//초록색 지하철을 탔어.
		
		studentJ.takeBus(bus100);		//james가 버스를 탄다고 해서 bus100이라는 인스턴스를 넘겨줬어 takeBus한테. 
										//객체로 다른 메서드를 호출해서 객체간의 협력이 이루어졌어~ 호출을 못하게 하려면 private으로 하면 돼.
		studentT.takeSubway(subwayGreen);
		
		studentJ.showStudentInfo();
		studentT.showStudentInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();

	}

}
