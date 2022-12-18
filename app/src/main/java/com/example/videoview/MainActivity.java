package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    VideoView simpleVideoView;
    MediaController mediaControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find your VideoView in your video_main.xml layout
        simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView);

        if (mediaControls == null) {
            // create an object of media controller class
            mediaControls = new MediaController(MainActivity.this);
            mediaControls.setAnchorView(simpleVideoView);
        }
        // set the media controller for video view
        simpleVideoView.setMediaController(mediaControls);
        // set the uri for the video view
        simpleVideoView.setVideoURI(Uri.parse("https://www.youtube.com/shorts/ujtEHbRN1K0" + getPackageName() + "/"));
        // start a video
        simpleVideoView.start();

        // implement on completion listener on video view
        simpleVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(), "자 이제 시작!!", Toast.LENGTH_LONG).show();
            }
        });
        simpleVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(getApplicationContext(), "어머낫! 오류가 발생했네요.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    public void onButtonClick1(View v){
        Toast.makeText(getApplicationContext(), "영상을 재생합니다.", Toast.LENGTH_LONG).show();
        Intent video = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/shorts/ujtEHbRN1K0"));
        startActivity(video);
    }
    //private void startActivity1() {
   // }

    public void onButtonClick2(View v){
        Toast.makeText(getApplicationContext(), "옷장으로 갑니다.", Toast.LENGTH_LONG).show();
        Intent closet = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
        startActivity(closet);
    }
   // private void startActivity2() {
   // }
}
    
    
public class MainActivity extends AppCompatActivity{  // 화면 전환
    
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
    

public class MainActivity extends AppCompatActivity {  // 선택 위젯 띄움, 

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.closet_main);

       

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
            ClotheViewer singerViewer = new ClotheViewer(getApplicationContext());
            ClotheViewer.setItem(items.get(i));
            return ClotheViewer;
        }
    }
}

// 어댑터 사용 목록 생성, 아이템 클릭 구현

public class MainActivity extends AppCompatActivity {   // 그리드뷰에서 어댑터 사용, 목록 생성

    GridView gridView;
    EditText editText;
    EditText editText2;
    Button button;
    SingerAdapter clotheAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clothe_main);

        gridView = (GridView)findViewById(R.id.gridView);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);

        singerAdapter = new SingerAdapter();
        singerAdapter.addItem(new SingerItem("상의","첫번째 서랍",R.drawable.clothe1));
        singerAdapter.addItem(new SingerItem("하의","두번째 서랍",R.drawable.clothe2));


        gridView.setAdapter(clotheAdapter);
        
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"옷 별칭 : "+ clotheAdapter.getItem(i).getName().toString() + " , 위치 : "+clotheAdapter.getItem(i).getTel().toString(),Toast.LENGTH_LONG).show();

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString().trim();
                String tel = editText2.getText().toString().trim();
                clotheAdapter.addItem(new SingerItem(name,tel,R.drawable.singer));

            }
        });  */



    }

    class ClotheAdapter extends BaseAdapter{


        ...


    }
}
