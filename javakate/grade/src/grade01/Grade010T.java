package grade01;

public class Grade010T {

//2020-05-22 day13 Ex09
	
	public static void main(String[] args) {
		// 선생님코딩 방법 1 int
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);

		String title="학생성적관리프로그램(ver 0.1.0)";
		String menu="1.보기 2.입력 3.수정 4.삭제 0.종료>>";
		int input=0;//숫자방식
		String data="학번\t|국어\t|영어\t|수학\t|합계\t|평균\n";
		data+="---------------------------------------------\n";
		
		
		System.out.println(title);
		System.out.println("------------------------------");
		int cnt=0;
		while(true){
			System.out.println(menu);
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println(data);
			}
			if(input==2){
				cnt++;			
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum/3.0;
				data+=cnt+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
			}
			if(input==3){
				System.out.print("학번>");
				int num=sc.nextInt();
				System.out.print("국어>");
				int kor=sc.nextInt();
				System.out.print("영어>");
				int eng=sc.nextInt();
				System.out.print("수학>");
				int math=sc.nextInt();
				int sum=kor+eng+math;
				double avg=sum/3.0;
				String msgNew=num+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\n";
				int idx=data.indexOf("\n"+num);
				int idx2=data.indexOf("\n", idx+1);
				String data1=data.substring(0, idx+1);
				String data2=data.substring(idx2+1);
				data=data1+msgNew+data2;
			}
			if(input==4){
				System.out.print("학번>");
				int num=sc.nextInt();
				int idx=data.indexOf("\n"+num);
				int idx2=data.indexOf("\n", idx+1);
				String data1=data.substring(0, idx+1);
				String data2=data.substring(idx2+1);
				data=data1+data2;
			}
		}
		System.out.println("감사합니다");
		sc.close();
	}

}
