package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainFormController {
    public AnchorPane root;
    public Spinner<Integer>spnAmount;
    public Button btnDeposite;
    public Button btnWithdrwls;
    public Button btnPrintPassbook;
    public Label lblBalance;

    double accountBalance;
    ArrayList<Transaction> transactionArrayList = new ArrayList<>();

    public MainFormController(){
        System.out.println("Constrctor");
    }

    public void initialize(){
        btnDeposite.setDisable(true);
        btnWithdrwls.setDisable(true);
        spnAmount.setEditable(true);
        spnAmount.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100000,0,100));
        spnAmount.valueProperty().addListener(e ->{
            btnDeposite.setDisable(spnAmount.getValue() <=0);
            btnWithdrwls.setDisable(btnDeposite.isDisable());
        });
    }

    public void btnPrintPassbookOnAction(ActionEvent actionEvent) {
        final String line ="+".concat(("-".repeat(15)).concat("+").concat("-".repeat(15)).concat("+")).repeat(1);
        System.out.println(line);
        System.out.printf("|%-15s|%-10s|%-10s|%-10s|%-10s|\n","Date & Time","Transaction","Opening balance","Amount","Balance");
        System.out.println(line);
        for(Transaction transaction : transactionArrayList){
            System.out.printf("|%-15s|%-10s|%-10s|%-10.2f|%-10.2f|\n",transaction.date,transaction.credit,
                    transaction.openingBalance,transaction.amount,transaction.endingBalance);
        }
    }

    public void btnWithdrwlsOnAction(ActionEvent actionEvent) {
        Transaction debitTransaction =new Transaction(false, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),accountBalance,spnAmount.getValue(),
                accountBalance -spnAmount.getValue());
       double balanceAftreWithdrwal= accountBalance - spnAmount.getValue();
       if(balanceAftreWithdrwal < 0){
           System.out.println("Insufficient Account Balance");
           return;
       }
       accountBalance = balanceAftreWithdrwal;
        lblBalance.setText(String.format("Balance: Rs. %,.2f",accountBalance));
        System.out.println(spnAmount.getValue() + "Deposited Successfully");
        spnAmount.getValueFactory().setValue(0);
        transactionArrayList.add(debitTransaction);
    }

    public void btnDepositeOnAction(ActionEvent actionEvent) {
        Transaction creditTransaction =new Transaction(true, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")),accountBalance,spnAmount.getValue(),
                accountBalance+spnAmount.getValue());
        accountBalance += spnAmount.getValue();
        lblBalance.setText(String.format("Balance: Rs. %,.2f",accountBalance));
        System.out.println(spnAmount.getValue() + "Withdrew Successfully");
        spnAmount.getValueFactory().setValue(0);
        transactionArrayList.add(creditTransaction);
    }
}

class Transaction{
    boolean credit;
    String date;
    double openingBalance;
    double amount;
    double endingBalance;

    public Transaction(boolean credit, String date, double openingBalance, double amount, double endingBalance) {
        this.credit = credit;
        this.date = date;
        this.openingBalance = openingBalance;
        this.amount = amount;
        this.endingBalance = endingBalance;
    }



}
