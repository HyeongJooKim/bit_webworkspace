package grade02;

import java.util.Arrays;

//Q2.성적관리프로그램(배열, 동적할당되게,
//사이즈 미리 입력 안하고 데이터 입력되는대로 늘어나게, 배열 복사 응용)
public class Grade020M {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		System.out.println("학생성적관리프로그램(Ver 0.2.0)");
		System.out.println("---------------------------------------------");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		int num=0;//자동부여 학번, 입력받을 때마다 하나씩 올라하고 이 값을 배열의 길이로 쓸 수 있나???
		int arrSize=2;//배열 크기 모자랄 때 크기 올려줄 양
		double avg=0;
		String[] stu=new String[5];//이 배열의 경우 길이 알 수 있지. [0]학번,[1]이름,[2]국어,[3]영어,[4]수학 5개
		String[][] data=new String[arrSize][];//String[] stu를 값으로 가지는 배열, 값의 갯수를 동적할당
		for(int i=0; i<data.length; i++){//초기화를 반드시 해줘야 자리를 할당함.
			data[i]=stu;
		}
		//Scanner 입력받을 때마다 cnt++시키고 cnt를 배열 길이에 넣으면? 아 이 경우는 어차피 학번을 쓰게 되어 있으니 그번호를 참조하면...순서가 안맞나... 배열을 만들고
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>>");
			input=sc.nextLine();//입력 받는 자료 하나하나를 stu 배열에 값으로 넣어줘야 함
			if(input.equals("0")){
				//종료
				break;			
			}else if(input.equals("1")){
				//보기
				if(num==0){
					System.out.println("입력된 성적이 없습니다. 성적을 입력하고 사용해 주세요.");
					break;
				}
				System.out.println("---------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|평균");
				System.out.println("---------------------------------------------");
				for(int i=0; i<num; i++){
					if(data[i]==null){continue;}
					for(int j=0; j<stu.length; j++){
						System.out.print(data[i][j]+"\t|");
						int kor=Integer.parseInt(data[i][2]);
						int eng=Integer.parseInt(data[i][3]);
						int math=Integer.parseInt(data[i][4]);
						avg=(kor+eng+math)*100/3/100.0;
					}
					System.out.println(avg);
				}
			}else if(input.equals("2")){
				//입력
				if(num==arrSize){//입력수가 배열크기와 같아지면 배열크기를 2배로 늘림
					arrSize*=2;
					String[][] temp=new String[arrSize][5];
					temp=Arrays.copyOf(data, temp.length);
					data=temp;					
				}
//				System.out.println(data.length);
				stu=new String[5];				
				num++;//2.입력이 수행될때마다 학번 1번부터 자동 부여. 삭제해도 num수치는 남아 있으니 무시하고 올라감
				stu[0]=""+num;//학번으로 입력. String으로 형변환
				System.out.print("이름>>");
				stu[1]=sc.nextLine();
				System.out.print("국어>>");
				stu[2]=sc.nextLine();
				System.out.print("영어>>");
				stu[3]=sc.nextLine();
				System.out.print("수학>>");
				stu[4]=sc.nextLine();
				data[num-1]=stu;
				
			}else if(input.equals("3")){
				//수정
				stu=new String[5];//이걸 안하니 마지막 stu값을 덮어쓰네
				System.out.print("학번>>");
				stu[0]=sc.nextLine();
				System.out.print("이름>>");
				stu[1]=sc.nextLine();
				System.out.print("국어>>");
				stu[2]=sc.nextLine();
				System.out.print("영어>>");
				stu[3]=sc.nextLine();
				System.out.print("수학>>");
				stu[4]=sc.nextLine();
				data[Integer.parseInt(stu[0])-1]=stu;
			}else if(input.equals("4")){
				//삭제
				System.out.print("학번>>");
				int temp=Integer.parseInt(sc.nextLine());//"1" 학번이 String으로 입력됨
				data[temp-1]=null;
			}
		}//while end		
		sc.close();
	}//main end

}//class end
