public class Calculation {
    public static void main(String[] args) {
        // входные параметры a, b, c, d
        float a= 1f, b=2f, c=3f, d=4f;
        //расчет + ответ
        System.out.println(a +"* (" + b + " + " +c + "/" + d + ") = " + a * (b + (c / d)));
    }
}