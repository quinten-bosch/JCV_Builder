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
    <link href="https://cdn.quilljs.com/1.3.6/quill.snow.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
    <nav class="navbar navbar-dark bg-dark">
        <span class="navbar-brand mb-0 h1">FossCvBuilder</span>
    </nav>
    <div class="container-fluid text-center">
        <div class="row">
            <div class="col-md-3 border">

            </div>
            <div class="col-md-6 border py-4">
            <form action="" method="post">
                <div class="accordion" id="accordionExample">
                    <div class="card">
                        <div class="card-header" id="headingOne">
                        <h2 class="mb-0">
                            <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                            Experience
                            </button>
                        </h2>
                        </div>
                        <div id="collapseOne" class="collapse show text-left" aria-labelledby="headingOne" data-parent="#accordionExample">
                            <div class="card-body">
                                <div id="experiences">
                                    <input type="hidden" id="experience-counter" value="1">
                                    <div class="row">
                                        <div class="col">
                                            <input type="text" class="form-control" placeholder="Funtion" id="experience1">
                                        </div>
                                        <div class="col">
                                            <input type="text" class="form-control" placeholder="Place" id="place1">
                                        </div>
                                    </div>
                                    <div class="row my-3">
                                        <div class="col">
                                            <input type="text" class="form-control" placeholder="Employer" id="employer1">
                                        </div>
                                    </div>
                                    <div class="row my-3">
                                        <div class="col">
                                            <label for="experience-fromdate1">From Month</label>
                                            <select class="form-control" id="experience-fromdate1">

                                            </select>
                                        </div>
                                        <div class="col">
                                            <label for="experience-fromyear1">From Year</label>
                                            <select class="form-control" id="experience-fromyear1">

                                            </select>
                                        </div>
                                        <div class="col">
                                            <label for="experience-todate1">To Month</label>
                                            <select class="form-control" id="experience-todate1">

                                            </select>
                                        </div>
                                        <div class="col">
                                            <label for="experience-toyear1">To Year</label>
                                            <select class="form-control" id="experience-toyear1">

                                            </select>
                                        </div>
                                    </div>
                                    <div class="row my-3">
                                        <div class="col">
                                            <label for="editor">Description</label>
                                            <div class="form-control" id="editor">

                                            </div>
                                        </div>
                                    </div>
                                    <div class="row my-3">
                                        <div class="col">
                                            <input type="button" onclick="" value="Save" class="btn btn-success">
                                        </div>
                                    </div>
                                    <div class="row my-3">
                                        <div class="col">
                                            <input type="button" onclick="" value="Add Experience" class="btn btn-primary w-100">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="accordion my-4" id="accordionExample2">
                    <div class="card">
                        <div class="card-header" id="heading2">
                        <h2 class="mb-0">
                            <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapse2">
                            Languages
                            </button>
                        </h2>
                        </div>
                        <div id="collapse2" class="collapse text-left" aria-labelledby="heading2" data-parent="#accordionExample2">
                            <div class="card-body">
                                <div id="languages">
                                    <input type="hidden" id="language-counter" value="1">
                                    <div class="row">
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Language" id="language1" name="language">
                                        </div>
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Level" id="language-level1" name="level">
                                        </div>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input type="button" onclick="" value="Save" class="btn btn-success">
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input type="button" onclick="addLanguage()" value="Add Language" class="btn btn-primary w-100">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="accordion my-4" id="accordionExample3">
                    <div class="card">
                        <div class="card-header" id="heading3">
                        <h2 class="mb-0">
                            <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapse3" aria-expanded="false" aria-controls="collapse3">
                            Skills
                            </button>
                        </h2>
                        </div>
                        <div id="collapse3" class="collapse text-left" aria-labelledby="heading3" data-parent="#accordionExample3">
                            <div class="card-body">
                                <div id="skills">
                                    <input type="hidden" id="skill-counter" value="1">
                                    <div class="row">
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Skill" id="skill1" name="skill">
                                        </div>
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Level" id="level1" name="level"">
                                        </div>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input type="button" onclick="addSkill()" value="Add Skill" class="btn btn-primary w-100">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <input type="submit" name="submit" value="Generate Templates" class="btn btn-info">
            </form>
            </div>
            <div class="col-md-3 border">

            </div>
        </div>
    </div>
    <footer class="footer py-3 text-center">
        <div class="container">
          <span class="text-muted">&copy; FossCvBuilder</span>
        </div>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    <!-- Include the Quill library -->
    <script src="https://cdn.quilljs.com/1.3.6/quill.js"></script>
</body>
<script>
    var teller = 1;
    function addSkill() {
        teller++;
        document.getElementById("skill-counter").value = teller;
    }
</script>
<script>
    var quill = new Quill('#editor', {
      theme: 'snow'
    });
  </script>
</html>
