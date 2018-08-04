import javax.swing.JOptionPane;
public class CondoSales2
{
    public static void main(String[] args)
    {
        String userInputString;
        int userInput;
        String userInputString2;
        int userInput2;
        String condo;
        int price;

        userInputString = JOptionPane.showInputDialog(null,
                "Please choose: \n1. Park view \n2. Golf course view \n3. Lake view",
                "Summerdale Condo Sales", JOptionPane.INFORMATION_MESSAGE);
        userInput = Integer.parseInt(userInputString);

        if (userInput == 1)
        {
            condo = "Park view condos";
            price = 150000;
        }
        else
            if (userInput == 2)
            {
                condo = "Condos with golf course views";
                price = 170000;
            }
            else
                if (userInput == 3)
                {
                    condo = "Condos with lake views";
                    price = 210000;
                }
                else
                {
                    condo = "Invalid input";
                    price = 0;
                }
        JOptionPane.showMessageDialog(null, condo + ": $" + price);

        if (price != 0)
        {
            userInputString2 = JOptionPane.showInputDialog(null, "Please choose: \n1. Garage \n2. Parking space",
                    "Summerdale Condo Sales", JOptionPane.INFORMATION_MESSAGE);
            userInput2 = Integer.parseInt(userInputString2);

            if (userInput2 == 1)
            {
                price += 5000;
                JOptionPane.showMessageDialog(null,
                        condo + " with garage: $" + price);
            }
            else
                if (userInput2 == 2)
                {
                    JOptionPane.showMessageDialog(null,
                            condo + " with no garage: $" + price);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid input, assuming the price with no garage." +
                            "\n" + condo + " with no garage: $" + price);
                }
        }
    }
}
