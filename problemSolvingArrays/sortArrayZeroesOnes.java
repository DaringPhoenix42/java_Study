import java.util.*;
class sortArrayZeroesOnes  {

    static void printarray(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");

        }
    }

    static void sortArrayZeroesOnesr(int arr[]){
        int n=arr.length;
        int zeroes=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                zeroes=zeroes+1;
            }
        }
        // int onesc=(n-zeroes);
        for (int i=0;i<n;i++){
                if (i<zeroes){
                    arr[i]=0;
                }
                else{
                    arr[i]=1;
                }
        }


    }

    static void sortArrayZeroesOnesBetter(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }

    }


    static void swap(int arr[],int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("------------------------");
        // Take size input

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // Take array elements
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sortArrayZeroesOnesr(arr);
        System.out.print("------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.print("------------------------");
        sortArrayZeroesOnesBetter(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();

        
    }
}
