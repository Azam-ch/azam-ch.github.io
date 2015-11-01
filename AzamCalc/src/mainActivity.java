import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.AzamCalc.R;

public class mainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText n1 = (EditText) findViewById(R.id.editText1);
        final EditText n2 = (EditText) findViewById(R.id.editText2);

        final TextView an = (TextView) findViewById(R.id.answer);

        Button mosbat = (Button) findViewById(R.id.jam);
        Button manfi = (Button) findViewById(R.id.kam);
        Button zarb = (Button) findViewById(R.id.zarb);
        Button taghsim = (Button) findViewById(R.id.taghsim);

        mosbat.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int e1 =Integer.parseInt(n1.getText().toString()) ;
                int e2 = Integer.parseInt(n2.getText().toString());

                int e3 = e1 + e2;
                an.setText("javb"+e1+"+"+e2+"="+e3);
            }


        });
        manfi.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int e1 =Integer.parseInt(n1.getText().toString()) ;
                int e2 = Integer.parseInt(n2.getText().toString());
                int e3 = e1 - e2;
                an.setText("javb"+e1+"-"+e2+"="+e3);
            }
        });

        zarb.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int e1 =Integer.parseInt(n1.getText().toString()) ;
                int e2 = Integer.parseInt(n2.getText().toString());
                int e3 = e1 * e2;
                an.setText("javb"+e1+"*"+e2+"="+e3);
            }
        });

        taghsim.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int e1 =Integer.parseInt(n1.getText().toString()) ;
                int e2 = Integer.parseInt(n2.getText().toString());
                if(e2 != 0){
                    int e3 = e1 / e2;
                    an.setText("javb"+e1+"/"+e2+"="+e3);
                }
                else{
                    an.setText("You can't div zero!");
                }
            }
        });
    }



}
