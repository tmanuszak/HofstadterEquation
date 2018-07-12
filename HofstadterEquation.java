/**
 * 7/10/18
 * @author Trey Manuszak
 */

public class HofstadterEquation {

    public static void main(String[] args) {
        Hofstadter h = new Hofstadter();
        //h.printSequence(10000);
        int i = h.findValue(10000000);
        System.out.println(i);
        h.setFirstValue(-1);
        i = h.findValue(10000000);
        System.out.println(i);

    }
}
