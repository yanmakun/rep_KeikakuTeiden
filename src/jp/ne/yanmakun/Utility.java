package jp.ne.yanmakun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

public class Utility{

	public static boolean downloadCSV(Context context,String monthStr){


		try{
			URL url = new URL("http://www2.kyuden.co.jp/kt_search/csv/2012" + monthStr + ".csv"); // ダウンロードする URL
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			FileOutputStream out = context.openFileOutput(monthStr + ".csv", Activity.MODE_WORLD_READABLE);
			int b;
			while((b = in.read()) != -1){
			    out.write(b);
			}
			out.close();
			in.close();
		}catch(Exception e){
			return false;
		}

		return true;
	}

	public static boolean mkdir(String path){
		File file = new File(path);
		return file.mkdir();
	}

	public static String readCSV(Context context,String fileName){
		try{

			FileInputStream input = context.openFileInput(fileName);

			BufferedReader br = new BufferedReader(new InputStreamReader(input));

			// 最終行まで読み込む
			String line = "";
			StringBuffer sb =new StringBuffer();
			
			while (( line = br.readLine()) != null){
				//1行をデータ要素に分割
				StringTokenizer st = new StringTokenizer(line,",");
				sb.append(line);
//				while(st.hasMoreTokens()){
//					sb.append(st.nextToken() + "\t");
//
//				}
			}

			br.close();
			return sb.toString();

		}catch(FileNotFoundException e){
			e.printStackTrace();
			return null;
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
}
