package jump2java;

//이 코드는 내스타일은 아닌 듯

public class GuGu {

	int dan;
	
	public GuGu(int dan){
		this.dan=dan;
	}
	
	public int get(int seq){
		return this.dan*seq;//곱한 값
	}
	
	public int[] all(){
		int[] result=new int[9];//한 단의 결과값 담을 배열
		for(int i=0; i<result.length; i++){
			result[i]=this.get(i+1);//1~9까지의 값 대입한 결과
		}
		return result;//한 단의 결과
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		int[] result=all();
		for(int i=0; i<result.length; i++){
			sb.append(result[i]);
			if(i!=result.length-1){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {

		GuGu gugu=new GuGu(2);
		System.out.println(gugu.get(3));
		System.out.println(gugu);
		for(int i=2; i<10; i++){
			System.out.println(new GuGu(i));
		}
	}
}