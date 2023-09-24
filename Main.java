public class Main {
    static boolean isFound (int [] arr , int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {1,1,2,5,2,5,10,21,44,44,9,1};
        int [] duplicate = new int[list.length];
        int startindex = 0 ;
        for(int i = 0 ; i < list.length ; i++){
            for(int k = 0 ; k < list.length ; k++){
                if((i != k) && ( list[i] == list[k] )) {
                    if (list[i]%2 == 0) { // [i] ninci sayının 2 ye bölümünden kalan 0 ise ;
                        if (!isFound(duplicate, list[i])) {
                            duplicate[startindex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for(int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
