package lecture20Overloading_HashMaps_Json;

public class OverloadingEx {
    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(String s) {
        System.out.println(s);
    }

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }
}
