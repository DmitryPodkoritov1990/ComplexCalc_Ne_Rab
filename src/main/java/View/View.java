package View;

import Model.ComplexNumber;

import java.util.Scanner;

public class View {
void printResult(ComplexNumber z){
    System.out.println(z.getRe()+ "i"+ "+(" + z.getIm()+")");
}
//    public class UserData{
////        String data;
//        private static Scanner formulaComplex;

//    public static String getData() {
//       formulaComplex = new Scanner(System.in);
//        return formulaComplex.nextLine();
//    }
}

