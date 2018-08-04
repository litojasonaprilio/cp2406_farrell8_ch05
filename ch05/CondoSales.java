import javax.swing.JOptionPane;
public class CondoSales
{
    public static void main(String[] args)
    {
        String userInputString;
        int userInput;
        String condo;
        int price;

        userInputString = JOptionPane.showInputDialog(null,
                "Please choose: \n1. Park view \n2. Golf course view \n3. Lake view", "Summerdale Condo Sales", JOptionPane.INFORMATION_MESSAGE);
        userInput = Integer.parseInt(userInputString);

        if (userInput == 1)
        {
            condo = "Park view condos";
            price = 150000;
        }
        else if (userInput == 2)
        {
            condo = "Condos with golf course views";
            price = 170000;
        }
        else if (userInput == 3)
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
    }
}
