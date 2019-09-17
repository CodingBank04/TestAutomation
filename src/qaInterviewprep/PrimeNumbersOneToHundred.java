package qaInterviewprep;

public class PrimeNumbersOneToHundred {
    public static void main(String[] args) {
        int i=0, num =0;
        String primeNumbers="";

        for(i=0; i<=100; i++){
            int counter=0;
            for(num=i ; num>=1 ; num--){
                if (i%num ==0){
                    counter++;
                }
            }
            if(counter==2){
                primeNumbers=primeNumbers + i + "";

            }
        }
        System.out.println("prime numbers form 1 to 100:");
        System.out.println(primeNumbers);
    }
}
