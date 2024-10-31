//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 3;
        int b = 6;
// О + 2 + 1 или 0011 в двоичной форме
// 4 + 2 + О или 0110 в двоичной форме
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        for (int i = 0; i < binary.length; i++) {
            if (i < binary.length / 2) {
                System.out.print(binary[i] + " * ");
            } else if (i == binary.length / 2) {
                System.out.println(" ");
            } else {
                // TODO output second part massive
            }
        }

    }

        /*
        System.out.println("          a = " + binary[a].charAt(a));
        System.out.println("          Ь = " + binary[b].charAt(2));
        System.out.println("        alb = " + binary[c]);
        System.out.println("        а&Ь = " + binary[d]);
        System.out.println("      а ^ ь = " + binary[e]);
        System.out.println("~a&b | a&~b = " + binary[f]);
        System.out.println("         ~а = " + binary[g]);

}*/
}