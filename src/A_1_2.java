public class A_1_2 {
    public static void main(String[] args) {
        int num1 = 52;
        int num2 = 12;

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println();
        double num3 = 52;
        double num4 = 12;
        System.out.printf("%.2f + %.2f = %5.2f \n",num3,num4,(num3 + num4));
        System.out.printf("%.2f - %.2f = %-3.2f \n",num3,num4,(num3 - num4));
        System.out.printf("%.2f + %.2f = %-3.2f \n",num3,num4,(num3 * num4));
        System.out.printf("%.2f + %.2f = %-3.2f \n",num3,num4,(num3 / num4));

    }

}
