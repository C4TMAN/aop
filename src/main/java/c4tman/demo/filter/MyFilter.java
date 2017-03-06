package c4tman.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by C4TMAN on 2017/2/28.
 */
@WebFilter(filterName="filter_test", urlPatterns={"/index","/hello"})
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("《《《《《《过滤器初始化。。。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("《《《《《《执行过滤器操作。。。。");
        filterChain.doFilter(servletRequest, servletResponse); //执行这个才会有请求后续的操作 不然被拦截
    }

    @Override
    public void destroy() {
        System.out.println("《《《《《《过滤器销毁。。。。。");
    }
}
