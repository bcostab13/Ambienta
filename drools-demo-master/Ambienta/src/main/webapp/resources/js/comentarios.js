/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function analisisSent(){
    data='key='+'41a3c3ce2181a6ade4a0cce9be88a100'+'&lang='+'es'+'&txt='+'no me gusta tu pelo';
    $.ajax({
       type: "POST",
       url: "http://api.meaningcloud.com/sentiment-2.1",
       data: data,
       success: function(response){           
           alert(response.score_tag);
       }       
               
    });
}

