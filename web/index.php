<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
session_save_path('/tmp');
session_start();


echo session_id();


/*
echo "</br>";
echo "Started session";
echo shell_exec("cd /var/www/fosscvbuilder && java ui.CvApp " . session_id());

echo "</br>";
echo "executed";
echo "<br>";
echo '<a href="/out/templates/template1.html">Click here to view</a>';
*/

if (isset($_POST['submit'])) {
    $cvJson = array(
        "sessie_id" => session_id(),
        "skills" => array(
            "skill1" => array(
                "skill_name" => $_POST["skill"],
                "level_value" => $_POST["level"]
            ),
        ),
    );

    $myJSON = json_encode($cvJson);

    echo $myJSON;

    $myfile = fopen("out/templates/json/".session_id().".json", "w") or die("Unable to open file!");
    fwrite($myfile, $myJSON);
    fclose($myfile);
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <span class="navbar-brand mb-0 h1">FossCvBuilder</span>
    </nav>
    <div class="container-fluid text-center">
        <div class="row">
            <div class="col-md-3">

            </div>
            <div class="col-md-6 border py-4">
            <form action="" method="post">
                <div class="accordion" id="accordionExample">
                    <div class="card">
                        <div class="card-header" id="headingOne">
                        <h2 class="mb-0">
                            <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                            Skill #1
                            </button>
                        </h2>
                        </div>
                        <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                            <div class="card-body">
                                <div id="skills">
                                    <input type="hidden" id="skill-counter" value="1">
                                    Skill: <input type="text" id="skill1" name="skill"><br><br>
                                    Level: <input type="text" id="level1" name="level"><br><br>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <input type="button" onclick="addSkill()" value="Add Skill"><br><br>
                <input type="submit" name="submit">
            </form>
            </div>
            <div class="col-md-3">

            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
<script>
    var teller = 1;
    function addSkill() {
        teller++;
        document.getElementById("skill-counter").value = teller;
    }
</script>
</html>
