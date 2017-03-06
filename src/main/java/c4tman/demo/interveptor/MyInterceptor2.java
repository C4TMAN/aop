package c4tman.demo.interveptor;//package interveptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by C4TMAN on 2017/2/28.
 */
public class MyInterceptor2 extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("<<<<<<222<<<<pre(Controller方法调用之前) 执行时间"+System.currentTimeMillis());
        return true;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        System.out.println("<<<<<<<222<<<post(Controller方法调用之后) 执行时间"+System.currentTimeMillis());
    }

    @Override
    public void afterConcurrentHandlingStarted(
            HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("<<<<<<222<<<<after(在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作) 执行时间"+System.currentTimeMillis());
    }
}
