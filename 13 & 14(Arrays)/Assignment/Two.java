public class Two{

    public static int search(int num[] , int target){
        int start = 0 , end = num.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(num[mid] == target){
                return mid;
            }
            if(num[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
             
        }
        return -1;

    }

    public static void main(String args[]){
        int num[]={4,  5, 6, 7, 0, 1, 2};
        int target = 0 ;
        int index = search(num , target);
        System.out.println(index);

    }
}