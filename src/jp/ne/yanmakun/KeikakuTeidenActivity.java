package jp.ne.yanmakun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

import jp.ne.yanmakun.R.id;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

/**
 * 計画停電時間割のメインアクティビティ
 * @author takuro
 *
 */
public class KeikakuTeidenActivity extends Activity {
    /** Called when the activity is first created. */

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView = (ListView)findViewById(id.listview_housing);
        Button btn = (Button)findViewById(id.button1);

        //リニアレイアウトへ接続
        SimpleAdapter adapter = new SimpleAdapter(this,Const.housing_exlist_map,R.layout.list,
        		new String[] { "no", "housing_name" }, new int[] { R.id.no, R.id.name });

        //リストビューへ追加
        listView.setAdapter(adapter);

        //CSVファイルのダウンロード
        Utility.downloadCSV(this,"07");

        Toast.makeText(this, Utility.readCSV(this,"07.csv"), Toast.LENGTH_LONG).show();
        //new AlertDialog.Builder(this).setTitle("選択したメッセージはこちら").setMessage(text).setPositiveButton("OK", null).show();

    	btn.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
				// Button01 onClickイベント定義
				Button_onClick();
			}
    	});
    }

    private void Button_onClick(){
    	// インテントへのインスタンス生成
    	Intent intent = new Intent(KeikakuTeidenActivity.this,JikanwariActivity.class);

    	// サブ画面(インテント)の起動
    	startActivity(intent);
    }
}