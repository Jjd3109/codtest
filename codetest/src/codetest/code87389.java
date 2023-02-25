package codetest;
class code87389 {
    public int solution(int n) {
        int answer = 0;
       //n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은수 x
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
}