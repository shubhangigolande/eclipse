//package corejava;
//
//public class day1 {
//
//    public static void tripleSum(int x){
//        int arr[] = {2,3,4,1,5,0,6,-1,9,3}; //9
//        int count = 0;
//        for(int i=0; i< arr.length;i++){ // i -3
//            for(int j=i+1; j<arr.length;j++){ //j
//                for(int k= j+1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == x) {
//                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println("sum triplet : " + count);
//    }
//    public static void pairSum(int x){
//        int arr[] = {2,3,4,1,5,0,6,-1,9,3}; //9
//        int count = 0;
//        for(int i=0; i< arr.length;i++){ // i -3
//            for(int j=i+1; j<arr.length;j++){ //j
//                if(arr[i]+arr[j] == x){
//                    count++;
//                }
//            }
//        }
//        System.out.println("sum pair : " + count);
//    }
//
//    public static void main(String[] args) { //jvm
//        //pairSum(9);
//        tripleSum(9);
//    }
//}
//
