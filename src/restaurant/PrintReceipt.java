package restaurant;

import java.util.ArrayList;

public interface PrintReceipt {
    public void paymentReceipt(int finalTotalPrice, ArrayList<String> itemDetails);
}
