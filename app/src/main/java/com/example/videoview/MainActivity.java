package com.example.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class VideoPlay extends AppCompatActivity {

    private VideoView videoView; // 비디오를 실행할 수 있게 도와주는 뷰
    private MediaController mediaController; // 재생이나 정지와 같은 미디어 제어 버튼부를 담당
    private final String videoURL = "https://www.youtube.com/shorts/ujtEHbRN1K0";

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 앱이 첫 실행됐을 때 이곳을 수행한다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView); // 비디오 뷰 아이디 연결
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController); // 미디어 제어 버튼부 세팅
        videoView.setVideoURI(uri); // 비디오 뷰의 주소를 설정
        videoView.start(); // 비디오 실행!
    }
    
    
public class ChangeScreen extends AppCompatActivity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closet_main);
 
 
        //'내 옷장 보기' 버튼 클릭, 화면 전환
        Button closetlist_btn = (Button) findViewById(R.id.closetlist_btn);  // button id : closetlist
        closetlist_btn.setOnClickListener(new View.OnClickListener(){
 
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), id.ClotheView.class); 
                startActivity(intent);
            }
        });
}

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class ClotheAdapter extends BaseAdapter{
        ArrayList<ClotheItem> items = new ArrayList<ClotheItem>();
        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(ClotheItem clotheItem){
            items.add(clotheItem);
        }

        @Override
        public ClotheItem getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ClotheViewer clotheViewer = new ClotheViewer(getApplicationContext());
            clotheviewer.setItem(items.get(i));
            return clotheViewer;
        }
    }
}

// 어댑터 사용 목록 생성, 아이템 클릭 구현

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    EditText editText;
    Button button;
    SingerAdapter singerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closetlist);
        
        gridView = (GridView)findViewById(R.id.gridView);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        clotheAdapter = new clotheAdapter();
        clotheAdapter.addItem(new ClotherItem("상의", R.drawable.pic1));
        clotheAdapter.addItem(new ClotheItem("하의", R.drawable.pic2));

        gridView.setAdapter(clotheAdapter);

        // so difficult
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  Toast.makeText(getApplicationContext(),"이름 : "+ clotheAdapter.getItem(i).getName().toString().Toast.LENGTH_LONG).show();

            }
        });
        
    }

    class ClotheAdapter extends BaseAdapter{
        
    }
