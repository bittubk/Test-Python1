function validateRegistrationForm() {
    return validateUserName()
}

function validateUserName() {
    let x = document.getElementById("name");
    let y = document.getElementById("nameError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("nameLabel").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("nameLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true
    }
}

function validateEmail() {
    let x = document.getElementById("eMail");
    let y = document.getElementById("eMailError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("eMail").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("eMailLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}

function validateMobileNumber() {
    let x = document.getElementById("mobileNumber");
    let y = document.getElementById("mobileNumberError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("mobileNumber").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("mobileNumberLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}

function validateGender() {
    let x = document.getElementById("gender");
    let y = document.getElementById("genderError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("gender").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("genderLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}

function validateTechnicalSkills() {
    let x = document.getElementById("technicalSkills");
    let y = document.getElementById("technicalSkillsError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("technicalSkills").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("technicalSkillsLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}

function validatePassword() {
    console.log("its working")
    let x = document.getElementById("password");
    let y = document.getElementById("passwordError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("password").style.color= "red";
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("passwordLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}

function validateConfirmPassword() {
    let x = document.getElementById("confirmPassword");
    let y = document.getElementById("confirmPasswordError");
    if(x.value === ""){
        console.log("form is empty");
        y.innerText = "there is problem"
        document.getElementById("confirmPassword").style.color= "red";
    
        y.style.color = "red"
        x.style.borderColor = "red";
        return false
    }
    else{
        console.log("form is not empty");
        y.innerText = "";
        document.getElementById("confirmPasswordLabel").style.color= "black";
        y.style.color = "black"
        x.style.borderColor = "green";
        return true 
    }
}