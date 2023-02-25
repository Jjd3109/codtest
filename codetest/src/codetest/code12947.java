package codetest;

public class code12947 {
	
	
	public static void main(String[] args) {
	
		int x  = 10;
		
        String[] list = String.valueOf(x).split("");
        int plus = 0;
        
        for(int i = 0; i < list.length; i++){
            plus += Integer.parseInt(list[i]); 
        }
        
        System.out.println(plus);
	}
	
	public boolean solution(int x) {
        boolean answer = true;
        //10이면 1+0 = 1; 10은 1의수
        //12이면 1+2 = 3; 12는 3의수
        String[] list = String.valueOf(x).split("");
        int plus = 0;

        for(int i = 0; i < list.length; i++){
            plus += Integer.parseInt(list[i]); 
        }

        if(x % plus == 0){
            return answer;
        }else{
            return false;
        }
    }
	


}
