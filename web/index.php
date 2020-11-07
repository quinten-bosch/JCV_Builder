<?php

session_start();

echo shell_exec("cd /var/www/fosscvbuilder && java ui.CvApp");
echo "<br>";
echo "executed";
echo "<br>";
echo '<a href="/out/templates/template1.html">Click here to view</a>'

?>

