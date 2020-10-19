package jump2java;

public class StringReview {
    public static void main(String[] args) {

    	String a="hello";
    	String b=new String("hello");
    	String c="hello";
    	
    	//문자열을 byte[]로 변환
    	byte[] by=c.getBytes();
    	for(int i=0; i<c.length(); i++){
    		System.out.println("by["+i+"] : "+by[i]);
    	}
    	
    	System.out.println(a==b);//false
    	System.out.println(a==c);//true
    	System.out.println(a.equals(b));//true
    	System.out.println(a.equals(c));//true
    	
    	String d=" Java World";
    	String e=c+d;
    	System.out.println(e);//hello Java World
    	System.out.println(e.replaceAll("Java","Internet"));//hello Internet World
    	System.out.println(e.indexOf("W"));//11
    	System.out.println(e.substring(0,11));//hello Java
    	System.out.println(e.toUpperCase());//HELLO JAVA WORLD
    	System.out.println(e.toLowerCase());//hello java world
    	
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb);//Hello Java World
        sb.insert(6, "Cool ");//삽입 가능
        String sb2=sb.toString();//String 타입으로 형변환
        System.out.println(sb2);//Hello Cool Java World
    }
}