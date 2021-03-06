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

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $cvJson = array(
        "sessie_id" => session_id(),
    );

    $skillInputArray = $_POST["skill"];
    $skillLevelArray = $_POST["skill-level"];
    $skillcount = count($skillInputArray);
    $skillcount = $skillcount - 1;

    $languageInputArray = $_POST["language"];
    $languageLevelArray = $_POST["language-level"];
    $languagecount = count($languageInputArray);
    $languagecount = $languagecount - 1;

    $educationInputArray = $_POST["education"];
    $eduPlaceInputArray = $_POST["edu-place"];
    $eduInstitutionsInputArray = $_POST["institution"];
    $eduFromMonthInputArray = $_POST["edu-from-month"];
    $eduFromYearInputArray = $_POST["edu-from-year"];
    $eduToMonthInputArray = $_POST["edu-to-month"];
    $eduToYearInputArray = $_POST["edu-to-year"];
    $eduDescriptionInputArray = $_POST["edu-description"];
    $educount = count($educationInputArray);
    $educount = $educount - 1;

    $expFunctionInputArray = $_POST["function"];
    $expPlaceInputArray = $_POST["place"];
    $expEmployerInputArray = $_POST["employer"];
    $expFromMonthInputArray = $_POST["exp-from-month"];
    $expFromYearInputArray = $_POST["exp-from-year"];
    $expToMonthInputArray = $_POST["exp-to-month"];
    $expToYearInputArray = $_POST["exp-to-year"];
    $expDescriptionInputArray = $_POST["exp-description"];
    $expcount = count($expFunctionInputArray);
    $expcount = $expcount -1;

    for ($i = 0; $i <= $skillcount; $i++) {
        if (is_null($skillInputArray[$i]) || empty($skillInputArray[$i]) || is_null($skillLevelArray[$i])) {

        }
        else {
            $skill = array("skills" => array("skill".$i => array("skill_name" => $skillInputArray[$i], "skill_level" => $skillLevelArray[$i])));
            $cvJson = array_merge_recursive($cvJson, $skill);
        }
    }

    for ($a = 0; $a <= $languagecount; $a++) {
        if (is_null($languageInputArray[$a]) || empty($languageInputArray[$a]) || is_null($languageLevelArray[$a])) {

        }
        else {
            $language = array("languages" => array("language".$a => array("language" => $languageInputArray[$a], "language_level" => $languageLevelArray[$a])));
            $cvJson = array_merge_recursive($cvJson, $language);
        }
    }

    for ($b = 0; $b <= $educount; $b++) {
        if (is_null($educationInputArray[$b]) || empty($educationInputArray[$b])) {

        }
        else {
            $education = array("educations" => array("education".$b => array("education" => $educationInputArray[$b], "education_place" => $eduPlaceInputArray[$b], "education_institution" => $eduInstitutionsInputArray[$b], "from_month" => $eduFromMonthInputArray[$b], "from_year" => $eduFromYearInputArray[$b], "to_month" => $eduToMonthInputArray[$b], "to_year" => $eduToYearInputArray[$b], "description" => $eduDescriptionInputArray[$b])));
            $cvJson = array_merge_recursive($cvJson, $education);
        }
    }

    for ($c = 0; $c <= $expcount; $c++) {
        if (is_null($expFunctionInputArray[$c]) || empty($expFunctionInputArray[$c])) {

        }
        else {
            $experience = array("experiences" => array("experience".$c => array("function" => $expFunctionInputArray[$c], "place" => $expPlaceInputArray[$c], "employer" => $expEmployerInputArray[$c], "from_month" => $expFromMonthInputArray[$c], "from_year" => $expFromYearInputArray[$c], "to_month" => $expToMonthInputArray[$c], "to_year" => $expToYearInputArray[$c], "description" => $expDescriptionInputArray[$c])));
            $cvJson = array_merge_recursive($cvJson, $experience);
        }
    }

    $myJSON = json_encode($cvJson);

    echo $myJSON;

    $myfile = fopen("out/templates/json/".session_id().".json", "w") or die("Unable to open file!");
    fwrite($myfile, $myJSON);
    fclose($myfile);

    $command = shell_exec('java ui.Test3 '.session_id());
    echo "<pre>$command</pre>";
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>CV Builder</title>
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
                                    <div id="exp-block">
                                        <div class="row">
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Function" id="experience1" name="function[]">
                                            </div>
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Place" id="place1" name="place[]">
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Employer" id="employer1" name="employer[]">
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <label for="experience-fromdate1">From Month</label>
                                                <select class="form-control" id="experience-fromdate1" name="exp-from-month[]">
                                                    <option value="January">January</option>
                                                    <option value="February">February</option>
                                                    <option value="March">March</option>
                                                    <option value="April">April</option>
                                                    <option value="May">May</option>
                                                    <option value="June">June</option>
                                                    <option value="July">July</option>
                                                    <option value="August">August</option>
                                                    <option value="September">September</option>
                                                    <option value="October">October</option>
                                                    <option value="November">November</option>
                                                    <option value="December">December</option>
                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="experience-fromyear1">From Year</label>
                                                <select class="form-control year-select" id="fromyear" name="exp-from-year[]">

                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="experience-todate1">To Month</label>
                                                <select class="form-control" id="experience-todate1" name="exp-to-month[]">
                                                    <option value="January">January</option>
                                                    <option value="February">February</option>
                                                    <option value="March">March</option>
                                                    <option value="April">April</option>
                                                    <option value="May">May</option>
                                                    <option value="June">June</option>
                                                    <option value="July">July</option>
                                                    <option value="August">August</option>
                                                    <option value="September">September</option>
                                                    <option value="October">October</option>
                                                    <option value="November">November</option>
                                                    <option value="December">December</option>
                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="experience-toyear1">To Year</label>
                                                <select class="form-control year-select" id="toyear" name="exp-to-year[]">

                                                </select>
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <div class="form-group shadow-textarea">
                                                    <label for="experience-description1">Description</label>
                                                    <textarea class="form-control z-depth-1" id="experience-description1" rows="3" placeholder="Write something here..." name="exp-description[]"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <a href="javascript:void(0);" class="remove_button">Remove</a>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input id="addexp" type="button" value="Add Experience" class="btn btn-info w-100">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="accordion my-4" id="accordionExample4">
                    <div class="card">
                        <div class="card-header" id="heading4">
                        <h2 class="mb-0">
                            <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapse4" aria-expanded="false" aria-controls="collapse4">
                            Education and Qualifications
                            </button>
                        </h2>
                        </div>
                        <div id="collapse4" class="collapse text-left" aria-labelledby="heading4" data-parent="#accordionExample4">
                            <div class="card-body">
                                <div id="education">
                                    <div id="edu-block">
                                        <div class="row">
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Education" id="education1" name="education[]">
                                            </div>
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Place" id="edu-place1" name="edu-place[]">
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <input type="text" class="form-control" placeholder="Institution" id="institution1" name="institution[]">
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <label for="education-fromdate1">From Month</label>
                                                <select class="form-control" id="education-fromdate1" name="edu-from-month[]">
                                                    <option value="January">January</option>
                                                    <option value="February">February</option>
                                                    <option value="March">March</option>
                                                    <option value="April">April</option>
                                                    <option value="May">May</option>
                                                    <option value="June">June</option>
                                                    <option value="July">July</option>
                                                    <option value="August">August</option>
                                                    <option value="September">September</option>
                                                    <option value="October">October</option>
                                                    <option value="November">November</option>
                                                    <option value="December">December</option>
                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="education-fromyear1">From Year</label>
                                                <select class="form-control" id="fromyear2" name="edu-from-year[]">

                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="education-todate1">To Month</label>
                                                <select class="form-control" id="education-todate1" name="edu-to-month[]">
                                                    <option value="January">January</option>
                                                    <option value="February">February</option>
                                                    <option value="March">March</option>
                                                    <option value="April">April</option>
                                                    <option value="May">May</option>
                                                    <option value="June">June</option>
                                                    <option value="July">July</option>
                                                    <option value="August">August</option>
                                                    <option value="September">September</option>
                                                    <option value="October">October</option>
                                                    <option value="November">November</option>
                                                    <option value="December">December</option>
                                                </select>
                                            </div>
                                            <div class="col">
                                                <label for="education-toyear1">To Year</label>
                                                <select class="form-control" id="toyear2" name="edu-to-year[]">

                                                </select>
                                            </div>
                                        </div>
                                        <div class="row my-3">
                                            <div class="col">
                                                <div class="form-group shadow-textarea">
                                                    <label for="education-description1">Description</label>
                                                    <textarea class="form-control z-depth-1" id="education-description1" rows="3" placeholder="Write something here..." name="edu-description[]"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <a href="javascript:void(0);" class="remove_button">Remove</a>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input id="addeducation" type="button" value="Add Education" class="btn btn-info w-100">
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
                                    <div class="row mb-3" id="language-block1">
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Language" id="language1" name="language[]" value="">
                                        </div>
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Level" id="language-level1" name="language-level[]" value="">
                                        </div>
                                        <a href="javascript:void(0);" class="remove_button">Remove</a>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input id="addlanguage" type="button" value="Add Language" class="btn btn-info w-100">
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
                                    <div class="row mb-3" id="skill-block1">
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Skill" id="skill1" name="skill[]" value=""/>
                                        </div>
                                        <div class="col">
                                          <input type="text" class="form-control" placeholder="Level" id="level1" name="skill-level[]" value=""/>
                                        </div>
                                        <a href="javascript:void(0);" class="remove_button">Remove</a>
                                    </div>
                                </div>
                                <div class="row my-3">
                                    <div class="col">
                                        <input id="addskill" type="button" value="Add Skill" class="btn btn-info w-100">
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
</body>
<script>
    $(document).ready(function() {
        var wrapper_skills = $("#skills");
        var add_skill_button = $("#addskill");
        var x = 1;
        $(add_skill_button).click(function(e) {
            e.preventDefault();
            x++;
            $(wrapper_skills).append('<div class="row my-3 pt-3 border-top" id="skill-block'+ x +'"><div class="col"><input type="text" class="form-control" placeholder="Skill" id="skill1" name="skill[]" value=""/></div><div class="col"><input type="text" class="form-control" placeholder="Level" id="level1" name="skill-level[]" value=""/></div><a href="javascript:void(0);" class="remove_button">Remove</a></div>');
        });
        $(wrapper_skills).on("click", ".remove_button", function(e) {
            e.preventDefault();
            $(this).parent('div').remove();
            x--;
        });

        var wrapper_languages = $("#languages");
        var add_language_button = $("#addlanguage");
        var y = 1;
        $(add_language_button).click(function(e) {
            e.preventDefault();
            y++;
            $(wrapper_languages).append('<div class="row my-3 pt-3 border-top" id="language-block'+ y +'"><div class="col"><input type="text" class="form-control" placeholder="Language" id="language1" name="language[]" value=""/></div><div class="col"><input type="text" class="form-control" placeholder="Level" id="language-level1" name="language-level[]" value=""/></div><a href="javascript:void(0);" class="remove_button">Remove</a></div>');
        });
        $(wrapper_languages).on("click", ".remove_button", function(e) {
            e.preventDefault();
            $(this).parent('div').remove();
            y--;
        });

        var wrapper_education = $('#education');
        var add_education_button = $('#addeducation');
        var z = 1;
        $(add_education_button).click(function(e) {
            e.preventDefault();
            z++;
            $(wrapper_education).append('<div class="my-3 pt-3 border-top" id="edu-block"><div class="row"><div class="col"> <input type="text" class="form-control" placeholder="Education" id="education1" name="education[]"></div><div class="col"> <input type="text" class="form-control" placeholder="Place" id="edu-place1" name="edu-place[]"></div></div><div class="row my-3"><div class="col"> <input type="text" class="form-control" placeholder="Institution" id="institution1" name="institution[]"></div></div><div class="row my-3"><div class="col"> <label for="education-fromdate1">From Month</label> <select class="form-control" id="education-fromdate1" name="edu-from-month[]"><option value="January">January</option><option value="February">February</option><option value="March">March</option><option value="April">April</option><option value="May">May</option><option value="June">June</option><option value="July">July</option><option value="August">August</option><option value="September">September</option><option value="October">October</option><option value="November">November</option><option value="December">December</option></select></div><div class="col"> <label for="education-fromyear1">From Year</label> <select class="form-control" id="fromyear2'+ z +'" name="edu-from-year[]"></select></div><div class="col"> <label for="education-todate1">To Month</label> <select class="form-control" id="education-todate1" name="edu-to-month[]"><option value="January">January</option><option value="February">February</option><option value="March">March</option><option value="April">April</option><option value="May">May</option><option value="June">June</option><option value="July">July</option><option value="August">August</option><option value="September">September</option><option value="October">October</option><option value="November">November</option><option value="December">December</option></select></div><div class="col"> <label for="education-toyear1">To Year</label> <select class="form-control" id="toyear2'+ z +'" name="edu-to-year[]"></select></div></div><div class="row my-3"><div class="col"><div class="form-group shadow-textarea"> <label for="education-description1">Description</label><textarea class="form-control z-depth-1" id="education-description1" rows="3" placeholder="Write something here..." name="edu-description[]"></textarea></div></div></div> <a href="javascript:void(0);" class="remove_button">Remove</a></div>');
            for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#fromyear2'+z).append($('<option selected />').val(i).html(i));
            }
            else {
                $('#fromyear2'+z).append($('<option />').val(i).html(i));
            }
        }
        for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#toyear2'+z).append($('<option selected />').val(i).html(i));
            }
            else {
                $('#toyear2'+z).append($('<option />').val(i).html(i));
            }
        }
        });
        $(wrapper_education).on("click", ".remove_button", function(e) {
            e.preventDefault();
            $(this).parent('div').remove();
            z--;
        });

        var wrapper_exp = $('#experiences');
        var add_experience_button = $('#addexp');
        var q = 1;
        $(add_experience_button).click(function(e) {
            e.preventDefault();
            q++;
            $(wrapper_exp).append('<div class="my-3 pt-3 border-top" id="exp-block"><div class="row"><div class="col"> <input type="text" class="form-control" placeholder="Function" id="experience1" name="function[]"></div><div class="col"> <input type="text" class="form-control" placeholder="Place" id="place1" name="place[]"></div></div><div class="row my-3"><div class="col"> <input type="text" class="form-control" placeholder="Employer" id="employer1" name="employer[]"></div></div><div class="row my-3"><div class="col"> <label for="experience-fromdate1">From Month</label> <select class="form-control" id="experience-fromdate1" name="exp-from-month[]"><option value="January">January</option><option value="February">February</option><option value="March">March</option><option value="April">April</option><option value="May">May</option><option value="June">June</option><option value="July">July</option><option value="August">August</option><option value="September">September</option><option value="October">October</option><option value="November">November</option><option value="December">December</option> </select></div><div class="col"> <label for="experience-fromyear1">From Year</label> <select class="form-control" id="fromyear'+ q +'" name="exp-from-year[]"></select></div><div class="col"> <label for="experience-todate1">To Month</label> <select class="form-control" id="experience-todate1" name="exp-to-month[]"><option value="January">January</option><option value="February">February</option><option value="March">March</option><option value="April">April</option><option value="May">May</option><option value="June">June</option><option value="July">July</option><option value="August">August</option><option value="September">September</option><option value="October">October</option><option value="November">November</option><option value="December">December</option> </select></div><div class="col"> <label for="experience-toyear1">To Year</label> <select class="form-control" id="toyear'+ q +'" name="exp-to-year[]"></select></div></div><div class="row my-3"><div class="col"><div class="form-group shadow-textarea"> <label for="experience-description1">Description</label><textarea class="form-control z-depth-1" id="experience-description1" rows="3" placeholder="Write something here..." name="exp-description[]"></textarea></div></div></div> <a href="javascript:void(0);" class="remove_button">Remove</a></div>');
            for (i = new Date().getFullYear() + 10; i > 1950; i--) {
                if (i === new Date().getFullYear()) {
                    $('#fromyear'+q).append($('<option selected />').val(i).html(i));
                }
                else {
                    $('#fromyear'+q).append($('<option />').val(i).html(i));
                }
            }
            for (i = new Date().getFullYear() + 10; i > 1950; i--) {
                if (i === new Date().getFullYear()) {
                    $('#toyear'+q).append($('<option selected />').val(i).html(i));
                }
                else {
                    $('#toyear'+q).append($('<option />').val(i).html(i));
                }
            }
        });
        $(wrapper_exp).on("click", ".remove_button", function(e) {
            e.preventDefault();
            $(this).parent('div').remove();
            q--;
        });

        for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#fromyear').append($('<option selected />').val(i).html(i));
            }
            else {
                $('#fromyear').append($('<option />').val(i).html(i));
            }
        }
        for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#toyear').append($('<option selected />').val(i).html(i));
            }
            else {
                $('#toyear').append($('<option />').val(i).html(i));
            }
        }

        for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#fromyear2').append($('<option selected />').val(i).html(i));
            }
            else {
                $('#fromyear2').append($('<option />').val(i).html(i));
            }
        }
        for (i = new Date().getFullYear() + 10; i > 1950; i--) {
            if (i === new Date().getFullYear()) {
                $('#toyear2').append($('<option selected />').val(i).html(i));
            }
            else {
                $('#toyear2').append($('<option />').val(i).html(i));
            }
        }
    });
</script>
</html>