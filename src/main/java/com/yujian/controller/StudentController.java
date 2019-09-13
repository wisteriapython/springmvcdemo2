package com.yujian.controller;

import com.yujian.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *  http://ip地址：端口号/student/1  返回编号是1的学生对象
 *  http://ip地址：端口号/student/2  返回编号是2的学生对象
 *  希望数据库里面的对象也像统一资源定位一样，通过一个地址就能找到它
 */
@Controller
public class StudentController {

    @RequestMapping("/student/{stuId}")
    public String findStudent(@PathVariable int stuId){
        System.out.println(stuId);
        return "success";
    }

    @RequestMapping("/studentList")
    public String list(Model model,HttpServletRequest request){
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(1,"张三"));
        list.add(new Student(2,"李四"));
        list.add(new Student(3,"王武"));
        model.addAttribute("list",list);
        return "studentList";
    }
    /*public String list(HttpServletRequest request){
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(1,"张三"));
        list.add(new Student(2,"李四"));
        list.add(new Student(3,"王武"));
        request.setAttribute("list",list);
        return "studentList";
    }*/

    /**
     * 如果发送的请求是异步请求，是不需要跳转到页面的，但是还是要向客户端输出内容
     */
    @RequestMapping("/doAjax")
    public void doAjax(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("{'empId':'1','empName':'田七','birth':'1990-01-02'}");
    }
    /*public void doAjax(PrintWriter out){
        out.print("{'empId':'1','empName':'田七','birth':'1990-01-02'}");
    }*/
}
