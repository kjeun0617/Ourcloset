import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
 
public class ClotheViewer extends AppCompatActivity {  // 버튼 누르면 이 화면으로 전환
 
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closetlist);
    }
}

public class ClotheViewer extends LinearLayout {   // 데이터 정의할 클래스 설계

    TextView textView;
    TextView textView2;
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
        inflater.inflate(R.layout.closetlist,this,true);

        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setItem(ClotheItem singerItem){
        textView.setText(ClotheItem.getName());
        textView2.setText(ClotheItem.getTel());
        imageView.setImageResource(clotheItem.getImage());
    }
}