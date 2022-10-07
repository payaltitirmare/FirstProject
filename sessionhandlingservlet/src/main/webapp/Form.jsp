
<html>

<head>
<style>
     
     .design{
     
      text-align:center;
      background-color:pink;
      margin:40px;
      padding :60px;
     }
     
     h1{
     
     color:green;
    font-size :40px;
     
     }
     label{
     
     color: red;
         }
option{

    font-size:20px;
}

</style>

</head>

<body>

<form  action ="Hiddenformsubmit" method="post" autocomplete="on" >

<div class="design">
<h1>This is registration form</h1>

<label>Name </label>
<input type="text" name="name"  autofocus="autofocus">
<br><br>
<label>Email</label>
<input type="email" name="email" >
<br><br>
<label>Age :</label>
<input type="number" name="age" >
<br><br>

<div>

Branch <select name="branch">
<option>select branch</option>
<option>Computer</option>
<option>Civil</option>
<option>Electrical</option>
<option>Mechanical</option>

</select>

</div>
<br>
<input type="submit" value="submit">
</div>
</form>

</body>
</html>