/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    function login_poblador(){
        var usuario=$("us_po").val();
        var pass=$("pss_po").val();
        var tipo='P';
        var data='usuario='+usuario+'&pass='+pass+'&tipo='+tipo;
        console.log(data);
    }
    
    function login_empresa(){        
        location.href="registroProyecto";
    }



