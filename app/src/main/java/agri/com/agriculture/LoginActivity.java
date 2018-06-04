package agri.com.agriculture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import agri.com.agriculture.farmer.FarmerHomeActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends Activity {

    @BindView(R.id.btn_register_here)
     TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_register_here)
    void submit() {
        // TODO call server...
        Intent intent = new Intent(this , SelectOccupationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_login)
    void login() {
        // TODO call server...
        Intent intent = new Intent(this , FarmerHomeActivity.class);
        startActivity(intent);
    }
}
