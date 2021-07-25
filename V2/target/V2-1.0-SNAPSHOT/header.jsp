<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<nav class="navbar navbar-expand-lg navbar-dark bg-dark">--%>
<%--    <a class="navbar-brand" href="#">FossCvBuilder</a>--%>
<%--    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--        <span class="navbar-toggler-icon"></span>--%>
<%--    </button>--%>
<%--    <div class="collapse navbar-collapse" id="navbarNav">--%>
<%--        <ul class="navbar-nav">--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link ${param.actual eq 'Home'?"active":""}" href="Servlet?command=home">Home</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link ${param.actual eq 'Create'?"active":""}" href="Servlet?command=creator">Create a CV</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="#">Pricing</a>--%>
<%--            </li>--%>
<%--            <form class="form-inline">--%>
<%--                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">--%>
<%--                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>--%>
<%--            </form>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--</nav>--%>

<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="#">FossCvBuilder</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link ${param.actual eq 'Home'?"active":""}" href="Servlet?command=home">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link ${param.actual eq 'Create'?"active":""}" href="Servlet?command=creator">Create a CV</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Pricing</a>
            </li>
        </ul>
        <div class="my-2 my-lg-0">
            <a href="#" type="button" class="btn btn-outline-light me-2">Login</a>
            <a href="#" type="button" class="btn btn-info">Sign-up</a>
        </div>
    </div>
</nav>