package ui.controller;

import domain.DomainException;
import domain.db.CvDB;
import domain.model.*;
import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    private CvDB db = new CvDB();

    public Servlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String command = "home";

        if (request.getParameter("command") != null) {
            command = request.getParameter("command");
        }

        HttpSession session = request.getSession();

        String destination;

        switch (command) {
            case "add":
                destination = add(request, response);
                break;
            case "creator":
                destination = creator(request, response);
                break;
            case "template":
                destination = template(request, response);
                break;
            case "createTemplates":
                destination = createTemplates(request, response);
                break;
            case "login":
                destination = login(request, response);
                break;
            case "loginPage":
                destination = loginPage(request, response);
                break;
            default:
                destination = home(request, response);
                break;
        }

        request.getRequestDispatcher(destination).forward(request, response);

    }

    private String home(HttpServletRequest request, HttpServletResponse response) {

        return "index.jsp";

    }

    private String creator(HttpServletRequest request, HttpServletResponse response) {

        return "creator.jsp";

    }

    private String login(HttpServletRequest request, HttpServletResponse response) {

        return "login.jsp";

    }

    private String loginPage(HttpServletRequest request, HttpServletResponse response) {

        return "login.jsp";

    }

    private String createTemplates(HttpServletRequest request, HttpServletResponse response) throws IOException {

        return "index.jsp";

    }

    private String template(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int id = (int) request.getSession().getAttribute("cvID");

        CV cv = db.getCVById(id);
        PersonalInfo personal = cv.getInfo();
        ArrayList<WorkExperience> wes = cv.getWorkExperiences();
        ArrayList<Education> edus = cv.getEducations();
        ArrayList<Skill> skills = cv.getSkills();
        ArrayList<Language> languages = cv.getLanguages();

        request.setAttribute("yourCv", cv);
        request.setAttribute("info", personal);
        request.setAttribute("wes", wes);
        request.setAttribute("edus", edus);
        request.setAttribute("skills", skills);
        request.setAttribute("languages", languages);

        return "templates.jsp";

    }

    private String add(HttpServletRequest request, HttpServletResponse response) {

        ArrayList<String> errors = new ArrayList<>();

        CV cv = new CV();
        setID(cv, request, errors);
        setPersonalInfo(cv, request, errors);
        setWorkExperiences(cv, request, errors);
        setEducations(cv, request, errors);
        setLanguages(cv, request, errors);
        setSkills(cv, request, errors);

        try {
            db.addCV(cv);
            request.getSession().setAttribute("cvID", cv.getId());
        } catch (DomainException d) {
            errors.add(d.getMessage());
        }

        return "Servlet?command=template";
    }

    private void setID(CV cv, HttpServletRequest request, ArrayList<String> errors) {
        int id = this.db.getLastID() + 1;
        try {
            cv.setId(id);
        } catch (DomainException d) {
            errors.add(d.getMessage());
        }
    }

    private void setPersonalInfo(CV cv, HttpServletRequest request, ArrayList<String> errors) {
        String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String mail = request.getParameter("mail");
        String tel = request.getParameter("tel");
        String street = request.getParameter("streetName");
        String housenr = request.getParameter("houseNumber");
        String zip = request.getParameter("zip");
        String city = request.getParameter("city");
        String description = request.getParameter("description-personal");
        String linkedin = request.getParameter("linkedin");
        try {
            PersonalInfo persone = new PersonalInfo(fname, lname, mail, tel, city, street, housenr, zip, description, linkedin);
            cv.setInfo(persone);
        } catch (DomainException d) {
            errors.add(d.getMessage());
        }
    }

    private void setWorkExperiences(CV cv, HttpServletRequest request, ArrayList<String> errors) {

        String[] functions = request.getParameterValues("function");
        String[] place = request.getParameterValues("place");
        String[] employer = request.getParameterValues("employer");

        String[] fromMonth = request.getParameterValues("exp-from-month");
        String[] fromYear = request.getParameterValues("exp-from-year");

        String[] toMonth = request.getParameterValues("exp-to-month");
        String[] toYear = request.getParameterValues("exp-to-year");

        String[] description = request.getParameterValues("exp-description");

        DateFormat format = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);



        for (int i = 0; i < functions.length; i++) {
            if (!functions[i].equals("")) {
                WorkExperience we = new WorkExperience();

                we.setFunction(functions[i]);
                we.setPlace(place[i]);
                we.setEmployer(employer[i]);

                we.setDescription(description[i]);
                try {
                    String teSamen = fromMonth[i] + " " + fromYear[i];
                    Date date = format.parse(teSamen);
                    we.setFrom(date);

                    String teSamen2 = toMonth[i] + " " + toYear[i];
                    Date date2 = format.parse(teSamen2);
                    we.setUntil(date2);
                    cv.addWorkExperience(we);
                } catch (DomainException | ParseException d) {
                    errors.add(d.getMessage());
                }
            }
        }
    }

    private void setEducations(CV cv, HttpServletRequest request, ArrayList<String> errors) {

        String[] education = request.getParameterValues("education");
        String[] place = request.getParameterValues("edu-place");
        String[] institution = request.getParameterValues("institution");

        String[] fromMonth = request.getParameterValues("edu-from-month");
        String[] fromYear = request.getParameterValues("edu-from-year");

        String[] toMonth = request.getParameterValues("edu-to-month");
        String[] toYear = request.getParameterValues("edu-to-year");

        String[] description = request.getParameterValues("edu-description");

        DateFormat format = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);

        for (int i = 0; i < education.length; i++) {
            if (!education[i].equals("")) {
                Education edu = new Education();

                edu.setEducation(education[i]);
                edu.setPlace(place[i]);
                edu.setEducationalInstitution(institution[i]);
                edu.setDescription(description[i]);

                try {
                    String teSamen = fromMonth[i] + " " + fromYear[i];
                    Date date = format.parse(teSamen);
                    edu.setFrom(date);

                    String teSamen2 = toMonth[i] + " " + toYear[i];
                    Date date2 = format.parse(teSamen2);
                    edu.setUntil(date2);

                    cv.addEducation(edu);

                } catch (DomainException | ParseException d) {
                    errors.add(d.getMessage());
                }
            }
        }

    }

    private void setLanguages(CV cv, HttpServletRequest request, ArrayList<String> errors) {

        String[] languages = request.getParameterValues("language");
        String[] levels = request.getParameterValues("language-level");
        if (languages != null) {
            for (int i = 0; i < languages.length; i++) {
                if (!languages[i].equals("")) {
                    Language la = new Language();
                    Level lv = new Level(levels[i], true);

                    la.setLanguage(languages[i]);
                    la.setLevel(lv);

                    try {
                        cv.addLanguage(la);
                    } catch (DomainException d) {
                        errors.add(d.getMessage());
                    }
                }
            }
        }
    }

    private void setSkills(CV cv, HttpServletRequest request, ArrayList<String> errors) {

        String[] skills = request.getParameterValues("skill");
        String[] levels = request.getParameterValues("skill-level");

        if ( skills != null) {
            for (int i = 0; i < skills.length; i++) {
                if (!skills[i].equals("")) {
                    Skill sk = new Skill();
                    Level lv = new Level(levels[i], false);

                    sk.setNaam(skills[i]);
                    sk.setLevel(lv);

                    try {
                        cv.addSkill(sk);
                    } catch (DomainException d) {
                        errors.add(d.getMessage());
                    }
                }
            }
        }
    }

    private Cookie getCookieWithKey(HttpServletRequest request, String key) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(key)) return cookie;
        }
        return null;
    }

}
