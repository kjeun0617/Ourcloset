public class closetlist2 extends LinearLayout {  //list 객체 list2 모아줌

    TextView textView;
    ImageView imageView;
    public closetlist2(Context context) {
        super(context);

        init(context);
    }

    public closetlist2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.closetlist,this,true);

        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setItem(Closetlist closetlist){
        textView.setText(closetlist.getName());
        imageView.setImageResource(closetlist.getImage());
    }
}
