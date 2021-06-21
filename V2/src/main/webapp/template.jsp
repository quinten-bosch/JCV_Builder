<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Gudea|Lato|Rokkitt" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://use.fontawesome.com/5e627ef047.js"></script><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
</head>
<body>
<div id="drag" class="cv instaFade wrap">
    <div class="mainDetails">
        <div id="headshot" class="">
<%--            <img src="https://avatars2.githubusercontent.com/u/24512843?s=400&v=4" title="Hi, I'm Jenny!" alt="Jennifer Mogan" />--%>
        </div>

        <div id="name">
            <h1 class="quickFade delayTwo">Quinten Bosch</h1>
            <h4 class="quickFade delayThree">RN, BSN, BS</h4>
            <h4 class="quickFade delayThree">Under Construction</h4>
        </div>

        <div id="contactDetails" class="quickFade delayFour">
            <ul>

                <!-- <li><a href="//linkedin.com/in/jennifermogan" title="LinkedIn"><i class="fa fa-print" aria-hidden="true"></i></a></li>-->
                <li><a href="//linkedin.com/in/jennifermogan" target="_blank" title="LinkedIn"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a></li>

            </ul>
        </div>
        <div class="clear"></div>
    </div>

    <div id="mainArea" class="quickFade delayFive">

        <section>
            <article>
                <div class="sectionTitle">
                    <h1>Personal Profile</h1>
                </div>

                <div class="sectionContent">
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer dolor metus, interdum at scelerisque in, porta at lacus. Maecenas dapibus luctus cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ultricies massa et erat
                        luctus hendrerit. Curabitur non consequat enim. Vestibulum bibendum mattis dignissim. Proin id sapien quis libero interdum porttitor.</p>
                </div>
            </article>
            <div class="clear"></div>
        </section>


        <section>
            <div class="sectionTitle">
                <h1>Work Experience</h1>
            </div>

            <div class="sectionContent">

                <c:forEach var="we" items="${wes}">
                    <article>
                        <h2>${we.getFunction()}</h2>
                        <p class="subDetails">${we.getEmployer()} - ${we.getPlace()}</p>
                        <p class="subDetails">${we.getFrom()} - ${we.getUntil()}</p>
                        <p>${we.getDescription()}</p>
                    </article>
                </c:forEach>

            </div>


            <div class="clear"></div>
        </section>

        <section id="Education">
            <div class="sectionTitle">
                <h1>Education</h1>
            </div>

            <div class="sectionContent">

                <c:forEach var="edus" items="${edus}">
                    <article>
                        <h2>${edus.getEducation()}</h2>
                        <p class="subDetails">${edus.getEducationalInstitution()} - ${edus.getPlace()}</p>
                        <p class="subDetails">${edus.getFrom()} - ${edus.getUntil()}</p>
                        <p>${edus.getDescription()}</p>
                    </article>
                </c:forEach>

            </div>
            <div class="clear"></div>
        </section>

        <section>
            <div class="sectionTitle">
                <h1>Skills</h1>
            </div>

            <div class="sectionContent">
                <ul class="keySkills">
                    <c:forEach var="skill" items="${skills}">
                        <li>${skill.getNaam()}: ${skill.getLevel().toString()}</li>
                    </c:forEach>
                </ul>
            </div>
            <div class="clear"></div>
        </section>

        <section>
            <div class="sectionTitle">
                <h1>Languages</h1>
            </div>

            <div class="sectionContent">
                <ul class="keyLanguages">
                    <c:forEach var="lan" items="${languages}">
                        <li>${lan.getLanguage()}: ${lan.getLevel().toString()}</li>
                    </c:forEach>
                </ul>
            </div>
            <div class="clear"></div>
        </section>

    </div>
</div>



</body>
</html>
