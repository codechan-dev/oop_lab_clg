import java.util.*;

class NegativeAmtException extends Exception {
    String msg;

    NegativeAmtException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }
}

public class userdefined {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Amount:");
        int a = s.nextInt();
        try {
            if (a < 0) {
                throw new NegativeAmtException("Invalid Amount");
            }
            System.out.println("Amount Deposited");
        } catch (NegativeAmtException e) {
            System.out.println(e);
        }
    }
}