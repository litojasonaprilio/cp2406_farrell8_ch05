import javax.swing.JOptionPane;
public class CellPhoneService
{
    public static void main(String[] args)
    {
        String talkString, messageString, gbDataString;
        int talk, message, gbData;
        String plan;
        int price;
        final int TALK = 500;
        final int MESSAGE = 100;
        final int GBDATA = 2;
        final int PA = 49;
        final int PB = 55;
        final int PC = 61;
        final int PD = 70;
        final int PE = 79;
        final int PF = 87;

        talkString = JOptionPane.showInputDialog(null, "Enter maximum monthly for talk minutes used:");
        talk = Integer.parseInt(talkString);
        messageString = JOptionPane.showInputDialog(null, "Enter text messages sent:");
        message = Integer.parseInt(messageString);
        gbDataString = JOptionPane.showInputDialog(null, "Enter gigabytes of data used:");
        gbData = Integer.parseInt(gbDataString);

        if (gbData > 0)
            if (gbData < GBDATA)
            {
                plan = "E";
                price = PE;
            }
            else
            {
                plan = "F";
                price = PF;
            }
        else
            if (talk < TALK)
                if (message == 0 && gbData == 0)
                {
                    plan = "A";
                    price = PA;
                }
                else
                {
                    plan = "B";
                    price = PB;
                }
            else
                if (message < MESSAGE)
                {
                    plan = "C";
                    price = PC;
                }
                else
                {
                    plan = "D";
                    price = PD;
                }

        JOptionPane.showMessageDialog(null, "The recommended plan is: Plan " + plan + " at $" + price + " per month.");
    }
}
