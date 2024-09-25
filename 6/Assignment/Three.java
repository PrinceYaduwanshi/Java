import java.util.*;

public class Three{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price of Pencil");
        float pencilPrice = sc.nextFloat();
        System.out.println("Enter Price of Pen");
        float penPrice = sc.nextFloat();
        System.out.println("Enter Price of Eraser");
        float eraserPrice = sc.nextFloat();
        float totalPrice = (pencilPrice+penPrice+eraserPrice);
        System.out.println("Total Price before gst : "+totalPrice);
        // float gst = (float) (0.18 * totalPrice);
        float newtotal = totalPrice + (0.18f * totalPrice);
        // System.out.println("GST: "+(gst+totalPrice));
        System.out.println("New Pricing:"+newtotal);

    }
}