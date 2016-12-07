$(function(){
    
});

function cargar_dptos(){
    $.ajax({
      type: "POST",
      url: "web/c_empresa/funcion"
      
    }).done(function() {
      alert("exito");
    });  
};


