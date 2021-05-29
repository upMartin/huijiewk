package huijiewk;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.alibaba.fastjson.JSONObject;
import com.huijie.config.DateUtil;
import com.huijie.model.SZReaderCollector;
import com.huijie.model.SZSensor;
import com.huijie.model.SZTagCollector;


public class test {
    @SuppressWarnings("unused")
    private static final double Number = -100;

    public static void main(String[] args) throws Exception {
        double num = -100;
        double num2 = -100;
        if (num == Number || num2 == Number) {
            System.out.println(1111);
        } else {
            System.out.println(2222);
        }
        String a = "";
        String b = "bbb";
    }
}



