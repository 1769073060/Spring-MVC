**第一步**
```xml
假设
用户发起了请求

请求会去找       web.xml   里面的DispatcherServlet     
```
       ```text
web.xml 下的
    <servlet>也就是这个
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <!--DispatcherServlet要绑定Spring的配置文件-->
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <!--要通过它绑定一个类-->
            <param-value>classpath:springmvc-servlet.xml</param-value>
        </init-param>
        <!--启动级别  1    服务器启动配置文件也一起-->
        <load-on-startup>1</load-on-startup>
    </servlet>
```
**第二步**

```xml
通过classpath的springmvc.xml配置文件去找
处理器映射器
```
```text
springmvc.xml 下的
    <!--处理器映射器   这里的Mapping回去找下面bean的id="/hello"-->
    <bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"/>
    
    1.处理器映射器会去寻找下面配置的bean的id,把它返回
    <!--BeanNameUrlHandlerMapping:bean-->
    <bean id="/hello" 
    2.处理器适配器会去找这个类
    class="com.rzk.controller.HelloController"/>
    3.通过这个类去找到HelloController.class
    4.进去HelloController

```
**第三步**

HelloController负责处理业务,返回一个ModelAndView交给视图解析器
```text
jsp页面下的

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        String result="你好呀世界";
        mv.addObject("msg",result);
        //视图跳转
        mv.setViewName("text");
        return mv;
    }
}

```
**第四步**

视图解析器的作用,显示视图

去springmvc.xml配置文件找到视图解析器
```text

    <!--视图解析器   :  模板引擎  Thymeleaf  Freemarker-->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"
          id="InternalResourceViewResolver">
        <!--前缀-->
        <property name="prefix" value="/WEB-INF/jsp/"/>
        <!--后缀-->
        <property name="suffix" value=".jsp"/>
    </bean>
```





