/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BankSystem;

import BankSystem.Models.UserModels.UserModel;
import BankSystem.VIiew.RegisterationForm;
import BankSystem.VIiew.StartForm;
import java.sql.SQLException;
import javax.swing.JFrame;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws SQLException {
        StartForm x = new StartForm();
        x.setVisible(true);
        
        
    }
}
