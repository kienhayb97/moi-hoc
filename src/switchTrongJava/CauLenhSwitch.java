package switchTrongJava;

public class CauLenhSwitch {
    public static void main(String[] args) {
        String gender = "Bede";
        switch (gender){
            case "Boy":
                System.out.println("you are boy");
                break;
            case "Girl":
                System.out.println("you are girl");
                break;
            default:
                System.out.println("we don't know");
        }
    }
}
