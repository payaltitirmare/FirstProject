<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>

<body>
<form action="Registration" method="post" enctype="multipart/form-data" >

<section class="h-100 bg-dark">
  <div class="container py-5 h-100">
   <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col">
        <div class="card card-registration my-4">
          <div class="row g-0">
            <div class="col-xl-6 d-none d-xl-block">
              <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img4.webp"
                alt="Sample photo" class="img-fluid"
                style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem;" />
            </div>
            <div class="col-xl-6">
              <div class="card-body p-md-5 text-black">
                <h3 class="mb-5 text-uppercase">Student registration form</h3>

                <div class="row">
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="firstname" id="form3Example1m" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1m">First name</label>
                    </div>
                  </div>
                  <div class="col-md-6 mb-4">
                    <div class="form-outline">
                      <input type="text" name="lastname" id="form3Example1n" class="form-control form-control-lg" />
                      <label class="form-label" for="form3Example1n">Last name</label>
                    </div>
                  </div>
                </div>

                
                <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                  <h6 class="mb-0 me-4">Gender: </h6>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input  type="radio"  name="gender" class="form-check-input"  id="femaleGender" value="female" >
                    <label class="form-check-label" for="femaleGender">Female</label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input type="radio" name="gender" class="form-check-input"  id="maleGender"  value="male" >
                    <label class="form-check-label" for="maleGender">Male</label>
                  </div>

                  <div class="form-check form-check-inline mb-0">
                    <input type="radio" name="gender" class="form-check-input"  id="otherGender" value="other" />
                    <label class="form-check-label" for="otherGender">Other</label>
                  </div>

                </div>
                <div class="form-outline mb-4">
                  <input type="email" name="email" id="form3Example97" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example97">Email ID</label>
                </div>
   
                <div class="form-outline mb-4">
                  <input type="password" name="password" id="form3Example97" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example97">Password</label>
                </div>
               
               <div>
               
               <input type="file" name="profilepic">
               
              </div>
                
               <br><br>
                <div class="row">
                  <div class="col-md-6 mb-4">

                    <select  name="branch">
                      <option value="Branch">Branch</option>
                      <option value="Civil Engineer">Civil Engineering</option>
                      <option value="Computer Engineer">Computer Engineering</option>
                      <option value="Electrical Engineer">Electrical Engineering</option>
                      <option value="chemical Enginner">Chemical Engineering</option>
                       <option value="Mechanical Engineer">Mechanical Engineering</option>
                      <option value="Aeronautical Engineer">Aeronautical Engineering</option>
                       </select>
                </div>
             </div>
                <div class="form-outline mb-4">
                  <input type="text" name="dob" id="form3Example9" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example9">DOB</label>
                </div>

                <div class="form-outline mb-4">
                  <input type="text" name="age" id="form3Example99" class="form-control form-control-lg" />
                  <label class="form-label" for="form3Example99">Age</label>
                </div>

                <div class="form-outline mb-4" style="color:black">
                <label >Hobbies :</label>
               <input type="checkbox" name= "hobbies" value="singing">
               <label>Singing</label>
               <input type="checkbox" name="hobbies" value="dancing">
               <label>Dancing</label>
                <input type="checkbox" name="hobbies" value="playing">
               <label>Playing</label>
              
               </div>
            
                 <div class="form-outline mb-4">
                 <label>DSA Marks</label>
                 <input type="text" name="DSA" placeholder="Data structure marks" id="form3Example99" class="form-control form-control-lg">
                 <label>DBMS Marks</label>
                 <input type="text" name="DBMS" placeholder="Databsemanagement system " id="form3Example99" class="form-control form-control-lg">
                 <label>OS Marks</label>
                 <input type="text" name="OS" placeholder="Operating System" id="form3Example99" class="form-control form-control-lg">
                 
                 </div>  

             <div>
                  <button type="submit" >Submit form</button>
              </div>
              </div>
           </div></div>
           </div>
           </div>
       </div>
       </div>
  </section>
   
</form>
</body>
</html>