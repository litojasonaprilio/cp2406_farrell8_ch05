import javax.swing.JOptionPane;
import java.time.LocalDate;
public class PastPresentFuture2
{
    public static void main(String[] args)
    {
        String inputString;
        int day, month, year;

        LocalDate today = LocalDate.now();

        inputString = JOptionPane.showInputDialog(null, "Enter the day: ");
        day = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Enter the month: ");
        month = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Enter the year: ");
        year = Integer.parseInt(inputString);

        LocalDate date = LocalDate.of(year, month, day);

        if (date.isBefore(today))
            JOptionPane.showMessageDialog(null, date + " is in the past.");
        else if (date.equals(today))
            JOptionPane.showMessageDialog(null, date + " is the current date.");
            else
                JOptionPane.showMessageDialog(null, date + " is in the future.");
    }
}
