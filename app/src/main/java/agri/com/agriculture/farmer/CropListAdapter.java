package agri.com.agriculture.farmer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import agri.com.agriculture.R;

/**
 * Created by akash.sharma on 5/25/2018.
 */

public class CropListAdapter extends RecyclerView.Adapter<CropListAdapter.CropListViewHolder> {

    private Context mContext;
    int imageIds[] = {R.drawable.castor_seed,R.drawable.coriander_seeds};
    public CropListAdapter(Context mContext)
    {
       this.mContext = mContext;
    }

    @Override
    public CropListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

         View view = LayoutInflater.from(mContext).inflate(R.layout.crop_item_list , parent , false);

        return new CropListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CropListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class CropListViewHolder extends RecyclerView.ViewHolder{

        public CropListViewHolder(View view){
             super(view);

        }
    }
}
