class arrs{
    int len = 100;
    int[] arr1 = new int[len];

    void vals(){
        for(int i = 0; i < len; i++){
            arr1[i] = 2*i;
        }
    }

    int sum(){
        int s = 0;
        for(int i = 0; i < len; i++){
            s += arr1[i];
        }
        return s;
    }

}

public class arrSum {
    public static void main(String[] args){
        arrs newarr = new arrs();

        newarr.vals();
        int sum = newarr.sum();

        System.out.println(sum);

        int x = 10;
        int t = x * 2 + x / 2;
        System.out.println(t);

    }
}
