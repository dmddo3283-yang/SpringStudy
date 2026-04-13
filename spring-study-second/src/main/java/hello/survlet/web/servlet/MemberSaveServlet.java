package hello.survlet.web.servlet;

import hello.survlet.basic.domain.member.Member;
import hello.survlet.basic.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="memberSaveServlet", urlPatterns = "/survlet/members/save")
public class MemberSaveServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username,age);
        memberRepository.save(member);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter w = response.getWriter();
        w.write("<head>\n");
        w.write("<html>\n");
        w.write("</html>\n");
        w.write("</head>\n");
    }
}
