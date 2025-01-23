package homework;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnketServlet extends HttpServlet {

    static final int QUESTION_1_YES = 0;
    static final int QUESTION_1_NO = 1;
    static final int QUESTION_2_YES = 2;
    static final int QUESTION_2_NO = 3;

    static final String TEMPLATE = "<html>" +
            "<head><title>Prog Academy</title></head>" +
            "<body><h1>Count people: %s</h1><br>" +
            "<h1>%s</h1>" +
            "<br><h2>Who was on this page: </h2>" +
            "<h3>%s</h3></body></html>";


    final int[] results = new int[4];

    int x = 1;
    List<String> users = new ArrayList<>();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("input_name");
        String surname = request.getParameter("input_surname");
        String age = request.getParameter("input_age");
        String user = name + " " + surname + " " + age;
        users.add(user);


        final String q1 = request.getParameter("question1");
        final String q2 = request.getParameter("question2");
        final int idx1 = "yes".equals(q1) ? QUESTION_1_YES : QUESTION_1_NO;
        final int idx2 = "yes".equals(q2) ? QUESTION_2_YES : QUESTION_2_NO;

        results[idx1]++;
        results[idx2]++;

        String res = "<p>Question 1: yes = " + results[QUESTION_1_YES] + ", no = " + results[QUESTION_1_NO] + "</p>";
        res += "<p>Question 2: yes = " + results[QUESTION_2_YES] + ", no = " + results[QUESTION_2_NO] + "</p>";


        String userRes = "";
        for (int i = 0; i < users.size(); i++) {
            userRes += "<br>" + users.get(i);
        }


        response.getWriter().println(String.format(TEMPLATE, x++, res, userRes));
    }

}
