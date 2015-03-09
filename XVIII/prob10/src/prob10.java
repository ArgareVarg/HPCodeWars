import java.util.Scanner;

public class prob10 {

    public static void main(String[] args) {
        prob10 start = new prob10();
        start.run();
    }

    Scanner in = new Scanner(System.in);
    int numLines = Integer.parseInt(in.nextLine());
    String[] input = new String[numLines];
    String[] out = new String[numLines];

    public void run() {
        for (int i = 0; i < numLines; i++) {
            input[i] = in.nextLine();
            String[] splitline = input[i].split(" ");
            out[i] = "";
            for (int a = 1; a < splitline.length; a++) {
                out[i] = out[i] + fromEBCDIC(splitline[a]);
            }
        }
        for (int i = 0; i < numLines; i++) {
            System.out.println(out[i]);
        }
    }

    public String fromEBCDIC(String ebcdic) {
        String ret;
        if (ebcdic.equals("81")) {
            ret="a";
        } else if (ebcdic.equals("82")) {
            ret="b";
        } else if (ebcdic.equals("83")) {
            ret="c";
        } else if (ebcdic.equals("84")) {
            ret="d";
        } else if (ebcdic.equals("85")) {
            ret="e";
        } else if (ebcdic.equals("86")) {
            ret="f";
        } else if (ebcdic.equals("87")) {
            ret="g";
        } else if (ebcdic.equals("88")) {
            ret="h";
        } else if (ebcdic.equals("89")) {
            ret="i";
        } else if (ebcdic.equals("91")) {
            ret="j";
        } else if (ebcdic.equals("92")) {
            ret="k";
        } else if (ebcdic.equals("93")) {
            ret="l";
        } else if (ebcdic.equals("94")) {
            ret="m";
        } else if (ebcdic.equals("95")) {
            ret="n";
        } else if (ebcdic.equals("96")) {
            ret="o";
        } else if (ebcdic.equals("97")) {
            ret="p";
        } else if (ebcdic.equals("98")) {
            ret="q";
        } else if (ebcdic.equals("99")) {
            ret="r";
        } else if (ebcdic.equals("A2")) {
            ret="s";
        } else if (ebcdic.equals("A3")) {
            ret="t";
        } else if (ebcdic.equals("A4")) {
            ret="u";
        } else if (ebcdic.equals("A5")) {
            ret="v";
        } else if (ebcdic.equals("A6")) {
            ret="w";
        } else if (ebcdic.equals("A7")) {
            ret="x";
        } else if (ebcdic.equals("A8")) {
            ret="y";
        } else if (ebcdic.equals("A9")) {
            ret="z";
        } else if (ebcdic.equals("C1")) {
            ret="A";
        } else if (ebcdic.equals("C2")) {
            ret="B";
        } else if (ebcdic.equals("C3")) {
            ret="C";
        } else if (ebcdic.equals("C4")) {
            ret="D";
        } else if (ebcdic.equals("C5")) {
            ret="E";
        } else if (ebcdic.equals("C6")) {
            ret="F";
        } else if (ebcdic.equals("C7")) {
            ret="G";
        } else if (ebcdic.equals("C8")) {
            ret="H";
        } else if (ebcdic.equals("C9")) {
            ret="I";
        } else if (ebcdic.equals("D1")) {
            ret="J";
        } else if (ebcdic.equals("D2")) {
            ret="K";
        } else if (ebcdic.equals("D3")) {
            ret="L";
        } else if (ebcdic.equals("D4")) {
            ret="M";
        } else if (ebcdic.equals("D5")) {
            ret="N";
        } else if (ebcdic.equals("D6")) {
            ret="O";
        } else if (ebcdic.equals("D7")) {
            ret="P";
        } else if (ebcdic.equals("D8")) {
            ret="Q";
        } else if (ebcdic.equals("D9")) {
            ret="R";
        } else if (ebcdic.equals("E2")) {
            ret="S";
        } else if (ebcdic.equals("E3")) {
            ret="T";
        } else if (ebcdic.equals("E4")) {
            ret="U";
        } else if (ebcdic.equals("E5")) {
            ret="V";
        } else if (ebcdic.equals("E6")) {
            ret="W";
        } else if (ebcdic.equals("E7")) {
            ret="X";
        } else if (ebcdic.equals("E8")) {
            ret="Y";
        } else if (ebcdic.equals("E9")) {
            ret="Z";
        } else if (ebcdic.equals("40")) {
            ret=" ";
        } else if (ebcdic.equals("4B")) {
            ret=".";
        } else if (ebcdic.equals("6B")) {
            ret=",";
        } else if (ebcdic.equals("5A")) {
            ret="!";
        } else {
            ret = "ERROR! Invalid EBCDIC!";
        }
        return ret;
    }
}
