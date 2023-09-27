public class Main {
    public static void main(String[] args) {
        double height = 1.87;
        int weight = 98;
        BmiService service = new BmiService();
        int index = service.calculate(weight , height);
        System.out.println("Индекс массы тела =" + index);
    }
}