package vaiTroCuaBreakContinue;

public class CauLenhContinue {
    public static void main(String[] args) {
        int[] array = {1,4,5,81,6};
        int S=0;

        for (int i:array){
            if (i==81){
                continue;
            }
            S+=i;
        }
        System.out.println("Total: " +S);
    }
}
