public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr = {4,2,2,1,3,4,3};
        int [] arr2 = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
           boolean duplicate = false;
        for(int j=0;j<index;j++){
            if(arr[i] == arr2[j]){
                duplicate = true;
                break;
            }
        }
        if(duplicate){
          //  duplicate = 
            continue;
        }
        else{
            arr2[index] = arr[i];
            index++;
        }
       }

       for (int i : arr2) {
        System.out.println(i);
       }

    }
}