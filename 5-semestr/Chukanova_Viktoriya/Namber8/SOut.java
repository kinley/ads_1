package semestr2;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
* <i>����������� �����</i>. ���� ����� �������� ������ ��� ��������� �����
* � ������ ����������� �����.
* <p>
* �������������� ���������, ��. <a href="http://introcs.cs.princeton.edu/15inout">� ������� 1.5</a> 
* <i>�������� � ���������������� �� Java: ����������������� ������.</i>, ������ ������� � ����� ����.
*
* @author ������ �������
* @author ����� ����...
/
 * 
 * @author user
 *
 */
public final class SOut {

	// force ��������� ������ UTF-8, � ��������� ������ ��� ������� �� �������
    private static final String charsetName = "UTF-8";

 // �����������, ���� = �������, ������ = ������ ��� ��������������� � StdIn
    private static final Locale US_LOCALE = new Locale("en", "US");

    // send output here
    private static PrintWriter out;

 // ��� ���������� ������ ��� �������� ����� ������
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, charsetName), true);
        }
        catch (UnsupportedEncodingException e) { System.out.println(e); }
    }

 // �� ��������������
    private SOut() { }

 // ������� ����� ������ (�� ���������)

    public static void close() {
        out.close();
    }

    public static void println() {
        out.println();
    }

    public static void println(Object x) {
        out.println(x);
    }

    public static void println(boolean x) {
        out.println(x);
    }

    public static void println(char x) {
        out.println(x);
    }

    public static void println(double x) {
        out.println(x);
    }

    public static void println(float x) {
        out.println(x);
    }

    public static void println(int x) {
        out.println(x);
    }

    public static void println(long x) {
        out.println(x);
    }

    public static void println(short x) {
        out.println(x);
    }

    public static void println(byte x) {
        out.println(x);
    }

    public static void print() {
        out.flush();
    }

    public static void print(Object x) {
        out.print(x);
        out.flush();
    }

    public static void print(boolean x) {
        out.print(x);
        out.flush();
    }

    public static void print(char x) {
        out.print(x);
        out.flush();
    }

    public static void print(double x) {
        out.print(x);
        out.flush();
    }

    public static void print(float x) {
        out.print(x);
        out.flush();
    }

    public static void print(int x) {
        out.print(x);
        out.flush();
    }

    public static void print(long x) {
        out.print(x);
        out.flush();
    }

    public static void print(short x) {
        out.print(x);
        out.flush();
    }

    public static void print(byte x) {
        out.print(x);
        out.flush();
    }

    public static void printf(String format, Object... args) {
        out.printf(US_LOCALE, format, args);
        out.flush();
    }

   
    public static void printf(Locale locale, String format, Object... args) {
        out.printf(locale, format, args);
        out.flush();
    }

    // This method is just here to test the class
    public static void main(String[] args) {

        // write to stdout
        StdOut.println("Test");
        StdOut.println(17);
        StdOut.println(true);
        StdOut.printf("%.6f\n", 1.0/7.0);
    }

}


