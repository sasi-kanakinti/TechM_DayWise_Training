import java.util.*;
public class ImgProcessing {
    public static int rgbToGrayscale(int red, int green, int blue) {
        int grayscale = (int)((red & 0xff) * 0.3 + (green & 0xff) * 0.59 + (blue & 0xff) * 0.11);
        return grayscale;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int grayscale = rgbToGrayscale(red, green, blue);
        System.out.println("Grayscale value: " + grayscale);
        sc.close();
    }
}