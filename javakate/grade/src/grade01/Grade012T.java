package grade01;

//2020-05-25 day14 Ex11

public class Grade012T {

	public static void main(String[] args) {
		// 학생성적관리프로그램(Ver0.1.2)
		// 방법 3. String 배열 이용
		// 입력: 학번 이름 국어 영어 수학 (다 String으로 받기)
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String[] data=null;
		System.out.println("Total # to input>>");
		int limit=Integer.parseInt(sc.nextLine());
		data=new String[limit];
		int cnt=0;
		int err=0;
		while(true){
			System.out.println("1.result 2.input 3.modify 4.delete 0.exit>>");
			String input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){err=0;
				System.out.println("------------------------------------------------");
				System.out.println("학번\t|이름\t|국어\t|영어\t|수학\t|평균");
				System.out.println("------------------------------------------------");
				for(int i=0; i<data.length; i++){
					if(data[i]==null){continue;}
//					System.out.println(data[i]);
					String msg=data[i];
					String[] stu=msg.split(",");
					int num=Integer.parseInt(stu[0]);
					String name=stu[1];
					int kor=Integer.parseInt(stu[2]);
					int eng=Integer.parseInt(stu[3]);
					int math=Integer.parseInt(stu[4]);
					double avg=(kor+eng+math)*100/3/100.0;//입력data가 아니니 나중에 연산하면 됨
					System.out.println(num+"\t|"+name+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+avg);
				}
			}else if(input.equals("2")){err=0;
				//입력
				if(cnt<limit){
					cnt++;//학번
					System.out.print("Name>>");
					String name=sc.nextLine();
					System.out.print("Korean>>");
					int kor=Integer.parseInt(sc.nextLine());
					System.out.print("English>>");
					int eng=Integer.parseInt(sc.nextLine());
					System.out.print("Math>>");
					int math=Integer.parseInt(sc.nextLine());
					data[cnt-1]=cnt+","+name+","+kor+","+eng+","+math;
				}else{
					System.out.println("입력할 학생이 없습니다");
				}
			
			}else if(input.equals("3")){err=0;
				//수정
				System.out.print("학번>>");
				int num=Integer.parseInt(sc.nextLine());
				System.out.print("Name>>");
				String name=sc.nextLine();
				System.out.print("Korean>>");
				int kor=Integer.parseInt(sc.nextLine());
				System.out.print("English>>");
				int eng=Integer.parseInt(sc.nextLine());
				System.out.print("Math>>");
				int math=Integer.parseInt(sc.nextLine());
				data[num-1]=num+","+name+","+kor+","+eng+","+math;
				//배열이라 지울 필요가 없음. 다시 입력하면 덮어 씀
			}else if(input.equals("4")){err=0;
				//삭제
				System.out.print("학번>>");
				int num=Integer.parseInt(sc.nextLine());
				data[num-1]=null;
			}else{
				err++;
				System.out.println("메뉴를 확인하시고 다시 입력해 주세요\n\n");
				if(err>3){
					System.out.println("이용방법을 다시 확인하시고 이용바랍니다\n\n");
					break;}
			}//else end
		}//while end
		System.out.println("이용해 주셔서 감사합니다.");
		sc.close();
	}//main end
}//class end
