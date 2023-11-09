
//  控制器包
package  com.hg.controller;

//  导入Spring框架的@Controller注解，表示该类为控制器
import  org.springframework.stereotype.Controller;
//  导入Spring框架的@RequestMapping注解，用于处理请求映射
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RequestMapping;

/*
 *  页面跳转控制器
 */
//  声明该类为控制器
@Controller
public  class  PagesController  {
    //  使用@RequestMapping注解，映射请求路径，{page}作为占位符表示动态路径
    @RequestMapping("/{page}")
    //  定义页面跳转方法，接收动态路径作为参数
    public  String  pageTo(@PathVariable  String  page)  {
        //  返回动态路径，即跳转到对应的页面
        return  page;
    }
}