/**
 *
 */
package jp.ne.yanmakun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author takuro
 *
 */
public interface Const {

	// リクエストコード
	int REQUEST_ID_1 = 1; //初期画面から


	List<HashMap<String,String>> housing_exlist_map =

			//仮データ挿入
			Arrays.asList(
					new HashMap<String,String>() { { put("no","1"); put("housing_name","自宅"); } },
					new HashMap<String,String>() { { put("no","2"); put("housing_name","オフィス１"); } },
					new HashMap<String,String>() { { put("no","3"); put("housing_name","オフィス２"); } },
					new HashMap<String,String>() { { put("no","4"); put("housing_name","営業所１"); } },
					new HashMap<String,String>() { { put("no","5"); put("housing_name","営業所２"); } },
					new HashMap<String,String>() { { put("no","6"); put("housing_name","営業所３"); } },
					new HashMap<String,String>() { { put("no","7"); put("housing_name","営業所４"); } },
					new HashMap<String,String>() { { put("no","8"); put("housing_name","営業所５"); } },
					new HashMap<String,String>() { { put("no","9"); put("housing_name","営業所６"); } },
					new HashMap<String,String>() { { put("no","10"); put("housing_name","営業所７"); } },
					new HashMap<String,String>() { { put("no","11"); put("housing_name","営業所８"); } }

			);


	String KEY1 = "GROUP";
	String KEY2 = "CHILD";

	List<HashMap<String,String>> housing_list_time_zone_group_map =

			//仮データ挿入
			Arrays.asList(
					new HashMap<String,String>() { { put(KEY1,"8:30～11:00"); put(KEY2,""); } },
					new HashMap<String,String>() { { put(KEY1,"10:30～13:00"); put(KEY2,""); } },
					new HashMap<String,String>() { { put(KEY1,"12:30～15:00"); put(KEY2,""); } },
					new HashMap<String,String>() { { put(KEY1,"14:30～17:00"); put(KEY2,""); } },
					new HashMap<String,String>() { { put(KEY1,"16:30～19:00"); put(KEY2,""); } },
					new HashMap<String,String>() { { put(KEY1,"18:30～21:00"); put(KEY2,""); } }
			);


	List<HashMap<String,String>> housing_list_time_zone_map =

			//仮データ挿入
			Arrays.asList(
					new HashMap<String,String>() { { put(KEY1,"8:30～11:00"); put(KEY2,"自宅"); } },
					new HashMap<String,String>() { { put(KEY1,"8:30～11:00"); put(KEY2,"オフィス１"); } },
					new HashMap<String,String>() { { put(KEY1,"8:30～11:00"); put(KEY2,"オフィス２"); } },
					new HashMap<String,String>() { { put(KEY1,"10:30～13:00"); put(KEY2,"営業所１"); } },
					new HashMap<String,String>() { { put(KEY1,"10:30～13:00"); put(KEY2,"営業所２"); } },
					new HashMap<String,String>() { { put(KEY1,"12:30～15:00"); put(KEY2,"営業所２"); } },
					new HashMap<String,String>() { { put(KEY1,"12:30～15:00"); put(KEY2,"営業所３"); } },
					new HashMap<String,String>() { { put(KEY1,"14:30～17:00"); put(KEY2,"営業所２"); } },
					new HashMap<String,String>() { { put(KEY1,"14:30～17:00"); put(KEY2,"営業所３"); } },
					new HashMap<String,String>() { { put(KEY1,"14:30～17:00"); put(KEY2,"営業所４"); } },
					new HashMap<String,String>() { { put(KEY1,"16:30～19:00"); put(KEY2,"営業所５"); } },
					new HashMap<String,String>() { { put(KEY1,"16:30～19:00"); put(KEY2,"営業所６"); } },
					new HashMap<String,String>() { { put(KEY1,"18:30～21:00"); put(KEY2,"営業所７"); } },
					new HashMap<String,String>() { { put(KEY1,"18:30～21:00"); put(KEY2,"営業所８"); } }
			);
}
