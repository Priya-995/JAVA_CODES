public class binomial_coeff {
    public static int factorial(int n){
        int fact=1;
        while(n>0){
           fact=fact*n;
           n--;
        }
        return fact;
    }
    public static int binomialCoeff(int n, int r){
       int n_fact=factorial(n);
       int r_fact=factorial(r);
       int  nMinusr_fact=factorial(n-r);
       int  binomialCoeff=n_fact/(r_fact*nMinusr_fact);
        return binomialCoeff;   
    }
    public static void main(String args[]){
         System.out.println(binomialCoeff(5, 2));
    }
}
