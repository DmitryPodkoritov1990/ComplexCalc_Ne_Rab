package Model;

public class MathOperations{
    ComplexNumber number;
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b){
     return new ComplexNumber(a.getRe() + b.getRe(), a.getIm() + b.getIm());

    }
    public static ComplexNumber substract(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getRe() - b.getRe(), a.getIm() - b.getIm());

    }
    public static ComplexNumber multiple(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getRe() * b.getRe() - a.getIm() * b.getIm(), a.getRe()* b.getRe() - a.getIm() * b.getIm());

    }
    public static ComplexNumber divide(ComplexNumber a1, ComplexNumber b1)
    {
        return new ComplexNumber((a1.getRe() * b1.getRe() + a1.getIm() * b1.getIm()) / (b1.getRe() * b1.getRe() + b1.getIm() * b1.getIm()),
                (a1.getIm() * b1.getRe() - a1.getRe() * b1.getIm()) / (b1.getRe() * b1.getRe() + b1.getIm() * b1.getIm()));
    }

}
