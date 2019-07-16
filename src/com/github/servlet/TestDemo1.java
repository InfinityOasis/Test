/**
 * FileName: TestDemo1
 * Author:   陈江超
 * Date:     2019/7/16 8:06
 * Description: 测试局域网
 */
package com.github.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试局域网〉
 *
 * @author 陈江超
 * @create 2019/7/16
 * @since 1.0.0
 */
@WebServlet("/Test/TestDemo1")
public class TestDemo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码格式
        resp.setContentType("text/html;charset=utf-8");
        // 获取输出流
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>测试成功</h1><p>In the end, it’s not the years in your life that count. It’s the life in your years.</p>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
