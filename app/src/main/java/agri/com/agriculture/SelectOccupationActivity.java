package agri.com.agriculture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RelativeLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by akash.sharma on 5/22/2018.
 */

public class SelectOccupationActivity extends Activity {

    @BindView(R.id.farmer_relativelayout)
    RelativeLayout farmerRelativelayout;

    @BindView(R.id.buyer_relativelayout)
    RelativeLayout buyerRelativelayout;

    @BindView(R.id.agent_relativelayout)
    RelativeLayout agentRelativelayout;

    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_occupation);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.farmer_relativelayout)
    void selectfarmer()
    {
        intent = new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.buyer_relativelayout)
    void selectBuyer()
    {
        intent = new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.agent_relativelayout)
    void selectAgent()
    {
        intent = new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }
}
