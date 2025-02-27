package ch01.sec11;

public class CharExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char c1 = 'A';
    char c2 = 66;
    String text = """
            여기에 "큰따옴표"를 포함시키려면 " "  \
             \"""를 사용합니다. """;

    char c4 = 0xcdFF;
    boolean	result  =  !false ;
    System.out.println(c1);
    System.out.println(c2); 
    System.out.println(text);   
    System.out.println(c4); 
    System.out.println(result);
    
    int k = 30;
    int l = 22;
    
    System.out.println((double) k/l);
    String str = text + k;
    System.out.println(str);
    		
	}

}
