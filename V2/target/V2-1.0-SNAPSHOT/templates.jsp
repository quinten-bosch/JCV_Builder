<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your CV</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Gudea|Lato|Rokkitt" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://use.fontawesome.com/5e627ef047.js"></script><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js"></script>
    <style>
        * {
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            -webkit-tap-highlight-color: rgba(0,0,0,0);
        }

        .wrap1 {
            display: inline-block;
            width: 100%;
            height: 283px;
            text-align: center;
            cursor: pointer;
            overflow: hidden;
            -webkit-transition: all .3s ease-in-out;
            transition: all .3s ease-in-out;
            border: 0 solid #fff;
            border-radius: 4px;
        }

        iframe {
            display: inline-block;
            position: relative;
            background: #fff;
            height: 1120px;
            width: 790px;
            -webkit-transform: scale(0.440);
            transform: scale(0.440);
            max-height: 1133px;
            /*left: 50%;*/
            /*margin-left: -100px;*/
            border: none;
            pointer-events: none;
            -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
            -webkit-transition: all .6s ease;
            transition: all .6s ease;
            cursor: pointer;
        }
    </style>
</head>
<body>

<jsp:include page="header.jsp">
    <jsp:param name="actual" value="Create" />
</jsp:include>

<main>
    <div class="album py-5">
        <div class="container">

            <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                <div class="col">
                    <div class="card shadow-sm">
<%--                        <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>--%>
                        <div class="wrap1">
                            <iframe src="templates/template.jsp" title="W3Schools Free Online Web Tutorials" scrolling="no"></iframe>
                        </div>

                        <div class="card-body center">
                            <h4>titel</h4>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm">
                        <div class="wrap1">
                            <iframe src="templates/template.jsp" title="W3Schools Free Online Web Tutorials" scrolling="no"></iframe>
                        </div>

                        <div class="card-body center">
                            <h4>titel</h4>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm">
                        <div class="wrap1">
                            <iframe src="templates/template.jsp" title="W3Schools Free Online Web Tutorials" scrolling="no"></iframe>
                        </div>

                        <div class="card-body center">
                            <h4>titel</h4>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>

<jsp:include page="footer.jsp" />

</body>
</html>