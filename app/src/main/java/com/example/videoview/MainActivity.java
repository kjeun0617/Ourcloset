package com.example.videoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/* import android.content.Intent;
import android.view.View;
import android.widget.Button; */


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
        videoView.start(); // 비디오 실행!\
    }
    
    /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
 
        //'내 옷장 보기' 버튼 클릭, 화면 전환
        Button closetlist_btn = (Button) findViewById(R.id.closetlist_btn);
        closetlist_btn.setOnClickListener(new View.OnClickListener(){
 
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Closetlist.class);
                startActivity(intent);
            }
        }); */
}
 

// 옷 선택 위젯 어댑터 정의

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
