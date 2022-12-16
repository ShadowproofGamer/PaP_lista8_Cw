public class Test {
    int zawartosc = 0;
    static void argNiemodyfikowalny(final Test zmienna) {
        zmienna.zawartosc = 1;
        //zmienna = null;
    }
    static void argModyfikowalny(Test zmienna) {
        zmienna.zawartosc = 1;
        zmienna = null;
    }
    public static void main(String[] args) {
        Test modyfikowalna = new Test();
        final Test niemodyfikowalna = new Test();
// tutaj wstaw instrukcje
        //a
        argNiemodyfikowalny(modyfikowalna);
        System.out.println(modyfikowalna.zawartosc);
        //b)
        argNiemodyfikowalny(niemodyfikowalna);
        System.out.println(niemodyfikowalna.zawartosc);
        //c)
        argModyfikowalny(modyfikowalna);
        System.out.println(modyfikowalna.zawartosc);
        //d)
        argModyfikowalny(niemodyfikowalna);
        System.out.println(niemodyfikowalna.zawartosc);
    }
}
