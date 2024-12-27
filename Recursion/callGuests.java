//In this question, we find how many ways...we can call our guest
// the guest call can be individual or in pair if i call n guests
public class callGuests {
    public static int callGuestsCount(int n){
        if(n<=1) return 1;
        int way1=callGuestsCount(n-1);
        int way2= (n-1)*callGuestsCount(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        System.out.println(callGuestsCount(4));
    }
}
