package tracyyang.PizzaOrder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton smallRB, mediumRb, largeRB;
    CheckBox cheeseCB, deliveryCB;
    TextView totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smallRB = (RadioButton) findViewById(R.id.smallRBtn);
        mediumRb = (RadioButton) findViewById(R.id.mediumRBtn);
        largeRB = (RadioButton) findViewById(R.id.largeRBtn);

        cheeseCB = (CheckBox) findViewById(R.id.cheeseCheckBox);
        deliveryCB = (CheckBox) findViewById(R.id.deliveryCheckBox);

        totalTV = (TextView) findViewById(R.id.textView3);
    }

    public void calcTotal(View view) {
        double totalPrice = 0;
        if (smallRB.isChecked())  {totalPrice += 7.00;    }
        if (mediumRb.isChecked())  {totalPrice += 9.00;    }
        if (largeRB.isChecked())  {totalPrice += 13.00;    }

        if (cheeseCB.isChecked()) {totalPrice += 1.75;   }
        if (deliveryCB.isChecked()) {totalPrice += 2.50;   }

        totalTV.setText(String.format("$%.2f", totalPrice));
    }
}
