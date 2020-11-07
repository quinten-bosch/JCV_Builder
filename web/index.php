<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
session_save_path('/tmp');
session_start();


echo session_id();



echo "</br>";
echo "Started session";
echo shell_exec("cd /var/www/fosscvbuilder && java ui.CvApp " . session_id());

echo "</br>";
echo "executed";
echo "<br>";
echo '<a href="/out/templates/template1.html">Click here to view</a>'

?>

