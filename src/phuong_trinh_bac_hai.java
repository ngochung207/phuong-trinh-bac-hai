public class phuong_trinh_bac_hai {
    private double a;
    private double b;
    private double c;

    public phuong_trinh_bac_hai(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(this.getDiscriminant()))/(2 * this.a);
    }

    public double getRoot2(){
        return (-this.b - Math.sqrt(this.getDiscriminant()))/(2 * this.a);
    }

}
