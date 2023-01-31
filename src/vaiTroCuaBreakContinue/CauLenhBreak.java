package vaiTroCuaBreakContinue;

public class CauLenhBreak {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,8};
        for (int i=0; i<array.length; i++){
            if (array[i]==8){
                System.out.println("Index: "+i);
                break;
            }
        }
    }
}
