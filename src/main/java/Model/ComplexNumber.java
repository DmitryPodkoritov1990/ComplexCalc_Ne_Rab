package Model;

public class ComplexNumber {


    double re;
    double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    ComplexNumber(double re){
        this(re, 0.0);
    }

    ComplexNumber(){
        this(0.0, 0.0);
    }

   ComplexNumber(ComplexNumber z){
        this(z.re, z.im);
   }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
         String result;
        if (this.im == 0){
            result = String.format("%.2f",this.re);
        } else {
            result = String.format("%.2f", this.re);
            if (this.im < 0)
                result += String.format("%.1fi", this.im);
            else result += String.format("+%.1fi", this.im);
        }
        return result;
    }

    //    public void setZ(ComplexNumber z){
//        re = z.re;
//        im = z.im;
//    }
//    public double mod(){
//        return Math.sqrt(re*re + im*im);
//    }
//
//    public double arg(){
//        return Math.atan2(re, im);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public String toString() {
//        return "Complex " + re + " " + im;
//    }
}
