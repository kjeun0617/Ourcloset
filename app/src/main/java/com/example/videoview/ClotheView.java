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

public class ClotheViewer extends LinearLayout {

    TextView textView;
    ImageView imageView;
    public ClotheViewer(Context context) {
        super(context);

        init(context);
    }

    public ClotheViewer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.clotheitem,this,true);

        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setItem(ClotheItem clotheItem){
        textView.setText(clotheItem.getName());
        imageView.setImageResource(clotheItem.getImage());
    }
}
