import javax.swing.JOptionPane;
import java.time.LocalDate;
public class PastPresentFuture
{
    public static void main(String[] args)
    {
        String inputString;
        int day, month, year;
        int todayDay, todayMonth, todayYear;
        String date;

        LocalDate today = LocalDate.now();
        todayDay = today.getDayOfMonth();
        todayMonth = today.getMonthValue();
        todayYear = today.getYear();

        inputString = JOptionPane.showInputDialog(null, "Enter the day: ");
        day = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Enter the month: ");
        month = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog(null, "Enter the year: ");
        year = Integer.parseInt(inputString);

        date = month + "-" + year;

        if (year == todayYear)
            if (month < todayMonth)
                JOptionPane.showMessageDialog(null, date + " was in an earlier month this year.");
            else
                if (month > todayMonth)
                    JOptionPane.showMessageDialog(null, date + " is in a later month this year.");
                else
                    JOptionPane.showMessageDialog(null, date + " is this month.");
        else
            JOptionPane.showMessageDialog(null, date + " is not this year.");
    }
}
