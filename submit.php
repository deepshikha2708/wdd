<?php
$db_host = 'localhost';
$db_username = 'username';
$db_password = 'password';
$db_name = 'database_name';
$conn = mysqli_connect($db_host, $db_username, $db_password, $db_name);
if (!$conn) {
    die('Database connection error: ' . mysqli_connect_error());
}

$q1 = $_POST['q1'];
$q2 = $_POST['q2'];
$q3 = $_POST['q3'];
$q4 = $_POST['q4'];
$q5 = $_POST['q5'];
$q6 = $_POST['q6'];
$q7 = $_POST['q7'];
$q8 = $_POST['q8'];

// Calculate score
$score = 0;
if ($q1 == 'Paris') {
  $score += 1;
}
if ($q2 == '4') {
  $score += 1;
}
if ($q3 == '2016') {
  $score += 1;
}
if ($q4 == 'India') {
  $score += 1;
}
if ($q5 == 'Biden') {
  $score += 1;
}
if ($q6 == 'Neutral') {
  $score += 1;
}
if ($q7 == 'Earthquake') {
  $score += 1;
}
if ($q8 == '1947') {
  $score += 1;
}

// Display score
echo "Your score is: " . $score;
?>
