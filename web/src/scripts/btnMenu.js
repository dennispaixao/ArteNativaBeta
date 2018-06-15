$(document).ready(function () {

    $("#btn-menu").click(function(){
       $("#menu").slideToggle(100);
        
    });

    $(window).resize(function(){
       var ww = $(window).width();
       if(ww>550){
            $("#menu").fadeIn(1000);
       } 
        
    });

});