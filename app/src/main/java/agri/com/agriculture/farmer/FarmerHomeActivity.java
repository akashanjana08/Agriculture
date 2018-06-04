package agri.com.agriculture.farmer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import agri.com.agriculture.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by akash.sharma on 5/22/2018.
 */

public class FarmerHomeActivity extends AppCompatActivity {

    @BindView(R.id.add_crop_cardview)
    CardView addCropCardview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_home);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.add_crop_cardview)
    void itemClick()
    {
        Intent intent = new Intent(this,CropListActivity.class);
        startActivity(intent);
    }
}
