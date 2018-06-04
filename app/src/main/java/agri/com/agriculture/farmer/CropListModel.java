package agri.com.agriculture.farmer;

/**
 * Created by akash.sharma on 5/25/2018.
 */

public class CropListModel {

    private int id;
    private String cropName;
    private int imageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
