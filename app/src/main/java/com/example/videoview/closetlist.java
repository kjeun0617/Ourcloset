import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
 
public class Closetlist extends AppCompatActivity {
 
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closetlist);
    }
}

public class ClosetItem {

    private String name;
    private String tel;
    private int image;

    public SingerItem(String name, String tel, int image) {
        this.name = name;
        this.tel = tel;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
