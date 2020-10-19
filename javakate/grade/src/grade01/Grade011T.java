package grade01;

//2020-05-22 day13 Ex11

public class Grade011T {

	public static void main(String[] args) {
		// 선생님코딩 방법 2 배열

		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);

		String title="학생성적관리프로그램(ver 0.1.1)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		System.out.println("총인원");
		int su=sc.nextInt();
		
		int[][] data=null;
		data=new int[su][];//대략 숫자 넉넉히
		
		System.out.println(title);
		System.out.println("------------------------------");
		int input=0;
		int idx=0;
		int cnt=0;//학번
		while(true){
			System.out.println(menu);
			input=sc.nextInt();
			if(input==0){break;}
			if(input==2&&su>cnt){
				int[] stu=new int[4];
				data[idx++]=stu;
				cnt++;
				stu[0]=cnt;
				System.out.print("국어>");
				stu[1]=sc.nextInt();
				System.out.print("영어>");
				stu[2]=sc.nextInt();
				System.out.print("수학>");
				stu[3]=sc.nextInt();
			}				
			if(input==1){
				System.out.println("학번\t|국어\t|영어\t|수학\t|합계\t|평균");
				System.out.println("---------------------------------------------");
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					System.out.print(stu[0]+"\t|");
					System.out.print(stu[1]+"\t|");
					System.out.print(stu[2]+"\t|");
					System.out.print(stu[3]+"\t|");
					System.out.print(stu[1]+stu[2]+stu[3]+"\t|");
					System.out.println((stu[1]+stu[2]+stu[3])*100/3/100.0);
				}
			}
			if(input==4){
				int tmp=-1;
				System.out.print("학번>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					if(stu==null){continue;}
					if(stu[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=null;}
			}
			if(input==3){
				int tmp=-1;
				int[] stu=new int[4];
				System.out.print("학번>");
				int num=sc.nextInt();
				for(int i=0; i<data.length; i++){
					int[] stu2=data[i];
					if(stu2==null){continue;}
					if(stu2[0]==num){tmp=i;}
				}
				if(tmp!=-1){data[tmp]=stu;}
				stu[0]=num;
				System.out.print("국어>");
				stu[1]=sc.nextInt();
				System.out.print("영어>");
				stu[2]=sc.nextInt();
				System.out.print("수학>");
				stu[3]=sc.nextInt();
			}				
		}//while end
		System.out.println("감사합니다");
		sc.close();
	}//main end
}//class end
