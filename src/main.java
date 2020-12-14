import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a, b, c cua phuong trinh: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        phuong_trinh_bac_hai f = new phuong_trinh_bac_hai(a,b,c);
        double delta = f.getDiscriminant();
        System.out.println(delta);
    }
}
