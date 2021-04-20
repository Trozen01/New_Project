package TrickyQuestions;

public class QuestionEleven {

	static int a =1111;
	static  {
		a = a -- - --a;                  // 1111 , 1110, 1109    =  2
		
		{a = a++ + ++a;}                     //2, 3,  4 = 6       
		
	}

	public static void main(String[] args) {
		System.out.println(a);

	}

}


//  output  =2 