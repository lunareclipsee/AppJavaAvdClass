package str.answer;

public class StringLv2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		String interestingStr = ""; 	// 대상 
		
		interestingStr = "자바";
		int index = 0;
		index = originStr.indexOf(interestingStr);
		
		System.out.println(index);
		
		changeStr = "db" + originStr.substring(interestingStr.length());
		
//		자바를 자바라를 db를 자바라로 변경하여 출력하시오 
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
	}

}
