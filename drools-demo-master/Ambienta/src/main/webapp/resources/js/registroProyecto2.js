/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function(){
    $("#datosEmp").click(function(){        
        datosEmp();
    });
    $("#registroProy").click(function(){        
        registroProy();
    });
    $("#consultaProy").click(function(){        
        consultaProy();
    });
    $("#verInd").click(function(){        
        verInd();
    });
    
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
});

function registroProy(){
    $("#page-content-wrapper").load("registroP");
}

function datosEmp(){
    $("#page-content-wrapper").load("datosEmpresa");
}

function consultaProy(){
    location.href="explorador";
}

function verInd(){
    $("#page-content-wrapper").load("verIndicadores");
}




