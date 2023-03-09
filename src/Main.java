import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Home(23, 30));
        System.out.println(Home(18, 20));
        System.out.println(Home(16, -25));
        System.out.println(Home(15, 10));
        System.out.println(Home(45, -45));
        System.out.println(Home(generateRandomAge(), -35));
    }
    public static String Home(int age, int tempereture ){
        generateRandomAge();
        if (age >= 20 && age <= 45 && tempereture >= -20 && tempereture <= 30){
            return "Можно идти гулять";

        } else if (age < 20 && tempereture >= 0 && tempereture <= 28) {
            return "Можно идти гулять";

        } else if (age > 45 && tempereture >= -10 && tempereture <= 25) {
            return "Оставайтесь дома";


        } else {
            return  "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(0, 100);
        return age;

    }
}