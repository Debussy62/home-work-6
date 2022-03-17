public class Test {
    public static void main(String args[]) {

        Consol p = new PlayStation();
        Consol x = new Xbox();
        Consol n = new Ns();
        Consol o = new XboxOne();

        System.out.println(p instanceof Consol);
        System.out.println(x instanceof Ns);
        System.out.println(n instanceof Consol);
        System.out.println(o instanceof PlayStation);
        n.print();
    }
}
