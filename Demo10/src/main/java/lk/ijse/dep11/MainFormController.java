package lk.ijse.dep11;

import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.dep11.tm.cartitem;

import java.util.ArrayList;

public class MainFormController {
    public AnchorPane root;
    public TextField txtCode;
    public TextField txtDescription;
    public TextField txtStock;
    public TextField txtBuyingPrice;
    public TextField txtSellingPrice;
    public Spinner<Integer> spnQty;
    public Button btnADD;
    public TableView<cartitem> tblChart;
    public Button btnNewOrder;
    public Label lblTotal;
    public Label lblProfit;

    ArrayList<Item> itemsList = new ArrayList<>();

    public void initialize(){
        Item item1 = new Item("4792210125234","Atlas white board marker blue",5,150,170);
        Item item2 = new Item("4792210112753","Atlas white board marker red",10,160,180);

        itemsList.add(item1);
        itemsList.add(item2);

        spnQty.setDisable(true);
        btnADD.setDisable(true);
        btnADD.setDefaultButton(true);
        spnQty.setEditable(true);
        spnQty.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,1,1));
        spnQty.valueProperty().addListener(e ->{
            btnADD.setDisable(spnQty.getValue() > Integer.parseInt(txtStock.getText()));
        });
        tblChart.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("code"));
        tblChart.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("description"));
        tblChart.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("qty"));
        tblChart.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("price"));
        tblChart.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("total"));

    }
    public void txtCode(){
       String inputCode =  txtCode.getText().strip();
       for(Item item : itemsList){
           if(item.barCode.equals(inputCode)){
               txtDescription.setText(item.description);
               txtStock.setText(item.Stock + "");
               txtBuyingPrice.setText(item.buyingPrice +"");
               txtSellingPrice.setText(item.SellingPrice +"");
               if(item.Stock>0){
                   btnADD.setDisable(false);
                   spnQty.setDisable(false);
                   spnQty.requestFocus();
               }else {
                   btnADD.setDisable(true);
                   spnQty.setDisable(true);
                   txtCode.selectAll();
               }
               return;
           }
       }
       new Alert(Alert.AlertType.ERROR,"Item not exist:");
       txtCode.selectAll();

    }
    public  void btnADDOnAction(){
        ObservableList<cartitem> cartitemsList  =tblChart.getItems();

        Item selectedItem = null;
        for(Item item: itemsList){
            if(item.barCode.equals(txtCode.getText())){
                selectedItem = item;
                break;

            }
        }
        boolean CartItemExist = false;
        for(cartitem CartItem: cartitemsList){
            if(CartItem.getCode().equals(selectedItem.barCode)){

                CartItemExist =true;
                break;

            }
        }
        //stop point 29 min
        if(!CartItemExist){
            cartitem cartItem1 = new cartitem(txtCode.getText(), txtDescription.getText(),
                    spnQty.getValue(), Double.parseDouble(txtSellingPrice.getText()),
                    spnQty.getValue() * Double.parseDouble(txtSellingPrice.getText()));

            cartitemsList.add(cartItem1);
        }else {

        }

        //selectedItem.Stock -= spnQty.getValue();

    }
    public void btnNewOrderOnAction(){

    }
}

class Item{
    String barCode;
    String description;
    int Stock;
    double buyingPrice;
    double SellingPrice;

    public Item(String barCode, String description, int stock, double buyingPrice, double sellingPrice) {
        this.barCode = barCode;
        this.description = description;
        this.Stock = stock;
        this.buyingPrice = buyingPrice;
        this.SellingPrice = sellingPrice;
    }
    double getProfit(){
        return (SellingPrice - buyingPrice);
    }
}
