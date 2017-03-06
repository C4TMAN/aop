package c4tman.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by C4TMAN on 2017/2/28.
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {


    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("《《《《《《《《session被创建。。。。");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("《《《《《《《《session被销毁。。。。");
    }
}
