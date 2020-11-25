public class JourneyToTheMoon {

    static class disjoint {
        private static int[] arr;

        static void connect(int x, int n) {
            if(isConnected(x,n))
                return;
            if (arr[x] > 0) {
                connect(arr[x], n);
            } else if (arr[n] > 0) {
                connect(x, arr[n]);
            } else {
                arr[x] += arr[n];
                arr[n] = x;
            }
        }
        static boolean isConnected(int x, int n){
            if(x==n)
                return true;
            if(arr[x] > 0){
                return isConnected(arr[x], n);
            }else if(arr[n] > 0){
                return isConnected(x, arr[n]);
            }else
                return x == arr[n] || n == arr[x];
        }

        static void init(int n){
            arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = -1;
        }
    }
    public static void main(String[] args){
        disjoint.init(10);
        disjoint.connect(9,1);
        disjoint.connect(5,2);
        disjoint.connect(9,5);
       System.out.print(disjoint.isConnected(2,9));
        System.out.print(disjoint.isConnected(1,5));

    }
}

