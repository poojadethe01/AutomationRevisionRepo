package conditionalStatment;

public class NestedIf {
    public static void main(String[] args) {
        String bankname= "SBI";
        int accountnum=88888888;

        if(bankname=="SBI")
        {
            System.out.println("Log in sucessfully");
            if(accountnum==88888888)
            {
                System.out.println("account no open sucessfully");
            }
            else {
                System.out.println("Entre correct accountnum");
            }
        }
        else
        {
            System.out.println("Entre correct bank name");
        }
    }
}
