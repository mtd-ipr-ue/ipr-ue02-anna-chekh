import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Please write down the first number");
        int num1 = In.readInt();

        Out.println("Please write down the second number");
        int num2 = In.readInt();

        Out.println("Please write down the third number");
        int num3 = In.readInt();

        int max=num1;

        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max =num3;
        }
        Out.println("The maximum of your numbers is "+max);

    }
}
