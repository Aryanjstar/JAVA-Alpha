

public class RevArr {
    public static void RevArr(int numbers[]){
        int start=0; int last = numbers.length-1;
        while(start<last){
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
       
    }  
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5};
        RevArr(numbers);
         for(int i=0; i<=numbers.length-1; i++){
        System.out.print(numbers[i] + " " );
        }
    }
}
