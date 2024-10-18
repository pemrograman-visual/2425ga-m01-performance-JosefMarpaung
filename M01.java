// 12S24005 - MIA NATHANIA SIBUEA
// 12S24036 - JOSEF CHRISTIAN MARPAUNG
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, nilai, a, aB, b, bC, c, d, e;
        double kredit1;
        int nilai1, kredit;

        kredit1 = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        if (kredit == "---") {
            kredit = kredit;
        } else {
            kredit1 = Integer.parseDouble(kredit);
        }
        nilai1 = Integer.parseInt(input.nextLine());
        while (nilai1 != "---") {
            if (nilai1 == "A") {
                nilai = 4.0;
            } else {
                if (nilai1 == "AB") {
                    nilai = 3.5;
                } else {
                    if (nilai1 == "B") {
                        nilai = 3.0;
                    } else {
                        if (nilai1 == "BC") {
                            nilai = 2.5;
                        } else {
                            if (nilai1 == "C") {
                                nilai = 2.0;
                            } else {
                                if (nilai1 == "D") {
                                    nilai = 1.0;
                                } else {
                                    if (nilai1 == "E") {
                                        nilai = 0.0;
                                    } else {
                                        nilai = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kredit1 * nilai;
            System.out.println(toFixed(performa,1));
            if (kredit == "---") {
                kredit = kredit;
            } else {
                kredit1 = Integer.parseDouble(kredit);
            }
            nilai1 = Integer.parseInt(input.nextLine());
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
