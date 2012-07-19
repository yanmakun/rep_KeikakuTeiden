package jp.ne.yanmakun;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.ne.yanmakun.R.id;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;


public class JikanwariActivity extends Activity implements OnDateChangedListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 日付ごとの画面レイアウトを設定する。
        setContentView(R.layout.jikanwari);


        DatePicker datePicker = (DatePicker) findViewById(id.datePicker1); // 日付選択ボックス
        ExpandableListView exListView1 = (ExpandableListView) findViewById(id.expandableListView1); // 時間帯リスト

        //日付の設定
        Calendar c = Calendar.getInstance();
        datePicker.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),this);

        List<Map<String, Object>> parentList = new ArrayList<Map<String,Object>>(); // 親ノードのリスト
        List<TimeZone> timeZoneList = makeTimeZoneTestList(); // 日付ごとの時間帯リスト

        // 子ノードのリスト
        // 親ノードのリストにもう1個リストをかぶせた感じ
        List<List<Map<String, Object>>> allChildList = new ArrayList<List<Map<String,Object>>>();


        for(int i = 0 ; i< timeZoneList.size() ; i++){
        	Map<String, Object> parentData = new HashMap<String, Object>();

        	TimeZone timeZone = timeZoneList.get(i);
        	List<TimeZoneDetail> detailList = timeZone.getTimeZoneDetailList();


        	parentData.put("TIMEZONE",timeZone.getTimeZoneName());
        	parentList.add(parentData);

        	List<Map<String, Object>> childList = new ArrayList<Map<String,Object>>();

            for(int j = 0; j < detailList.size(); j++){
                // 親と同じように設定する
                Map<String, Object> childData = new HashMap<String, Object>();

                TimeZoneDetail timeZoneDetail = (TimeZoneDetail)detailList.get(j);
                childData.put("HOUSINGNAME", timeZoneDetail.getHousingName());
                childData.put("SUBGROUPNAME", timeZoneDetail.getSubGroupName());
                childList.add(childData);
            }

            allChildList.add(childList);
        }

        ExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                this,
                parentList,
                android.R.layout.simple_expandable_list_item_1,
                new String []{"TIMEZONE"},
                new int []{android.R.id.text1},
                allChildList,
                android.R.layout.simple_expandable_list_item_2,
                new String []{"HOUSINGNAME", "SUBGROUPNAME"},
                new int []{android.R.id.text1, android.R.id.text2}
        );

        // アダプタを設定
        exListView1.setAdapter(adapter);

        // OnChildClickListenerを設定
        exListView1.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){

            /** 子がクリックされたときに呼ばれるアレ. */
            @SuppressWarnings("unchecked")
            //@Override
            public boolean onChildClick(
                    ExpandableListView parent,
                    View v,
                    int groupPosition,
                    int childPosition,
                    long id)
            {
                // まずはAdapterを取得
                ExpandableListAdapter adapter = parent.getExpandableListAdapter();

                // Adapterから子のデータMapを取得
                Map<String, Object> childMap = (Map<String, Object>)adapter.getChild(
                        groupPosition,
                        childPosition
                );

                return false;
            }
        });
    }

    public void onDateChanged(DatePicker view, int year, int monthOfYear,
            int dayOfMonth) {
        // TODO Auto-generated method stub
        view.updateDate(year, monthOfYear, dayOfMonth);
        //Log.d(TAG, "Year" + year + "Month" + dayOfMonth + "Day" + dayOfMonth);
    }

    /**
     * テストデータ挿入
     * @return エラーがなければtrue
     */
    public List<TimeZone> makeTimeZoneTestList(){
    	List<TimeZone> timeZoneList = new ArrayList<TimeZone>(); //時間帯リスト
    	List<TimeZoneDetail> timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	TimeZoneDetail timeZoneDetail;

    	//8:30～11:00
    	timeZoneDetailList.add(new TimeZoneDetail("11", "物件A", "A01", "111-1111-1111", "担当者A", "備考A"));
    	timeZoneDetailList.add(new TimeZoneDetail("12", "物件B", "A02", "222-2222-2222", "担当者B", "備考B"));
    	timeZoneList.add(new TimeZone("01", "8:30～11:00", timeZoneDetailList));


    	//10:30～13:00
    	timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	timeZoneDetailList.add(new TimeZoneDetail("13", "物件C", "A03", "333-3333-3333", "担当者C", "備考C"));
    	timeZoneDetailList.add(new TimeZoneDetail("14", "物件D", "A04", "444-4444-4444", "担当者D", "備考D"));
    	timeZoneList.add(new TimeZone("02", "10:30～13:00", timeZoneDetailList));

    	//12:30～15:00
    	timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	timeZoneDetailList.add(new TimeZoneDetail("15", "物件E", "A05", "555-5555-5555", "担当者E", "備考E"));
    	timeZoneDetailList.add(new TimeZoneDetail("16", "物件F", "A06", "666-6666-6666", "担当者F", "備考F"));
    	timeZoneList.add(new TimeZone("03", "12:30～15:00", timeZoneDetailList));

    	//14:30～17:00
    	timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	timeZoneDetailList.add(new TimeZoneDetail("17", "物件G", "A07", "777-7777-7777", "担当者G", "備考G"));
    	timeZoneList.add(new TimeZone("04", "14:30～17:00", timeZoneDetailList));

    	//16:30～19:00
    	timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	timeZoneDetailList.add(new TimeZoneDetail("19", "物件H", "A09", "999-9999-9999", "担当者H", "備考H"));
    	timeZoneList.add(new TimeZone("05", "16:30～19:00", timeZoneDetailList));

    	//18:30～21:00
    	timeZoneDetailList = new ArrayList<TimeZoneDetail>();//明細リスト
    	timeZoneDetailList.add(new TimeZoneDetail("20", "物件I", "A10", "000-0000-0000", "担当者I", "備考I"));
    	timeZoneList.add(new TimeZone("06", "18:30～21:00", timeZoneDetailList));

    	return (List<TimeZone>)timeZoneList;
    }
}
