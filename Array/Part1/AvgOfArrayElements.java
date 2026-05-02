package Array.Part1;

public class AvgOfArrayElements {
    public static double avg(int[]a){
        int []b=a;
        int len=a.length;
        double sum=0;
        for(int c:b){      // O(n)
            sum+=c;        // O(1)
        }
        double avg=(sum)/len;   // O(1)
        return avg;
    }

    static void main(String[] args) {
        int [] a={2,4,1,3};
        System.out.println(avg(a));
    }
}
