public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);            
        }

        System.out.println("==============================");

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + i * j);
            }
            System.out.println("--------------");
        }
    }

}
