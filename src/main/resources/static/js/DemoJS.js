let temp = {};
let container = "";
console.log("your JS loaded")

$(document).ready(function(){
	
	var mql = window.matchMedia("screen and (max-width: 768px)");

	if (mql.matches) {
    	console.log("화면의 너비가 768px 보다 작습니다.");
	} else {
    	console.log("화면의 너비가 768px 보다 큽니다.");
	}
	
//	if($("#getResult").val() != ""){
//        alert("val is not blank");
//        console.log($("#getResult").val());
//        }   
//    if($("#getResult").val() == ""){
//        alert("val is blank");
//        console.log($("#getResult").val());
//        }
		
	$(".eventMaker").on("click", function() {
	    console.log("function activated - Read");
		container = $("#insertVal").val();

	    console.log("function activated - insert : ", container);

	    $.ajax({
	      type: "GET",
	      url: `/api/mytest/names`,
	      data: {
	      },
	      success: function(res) {
	        console.log(res)
	        temp = JSON.stringify(res);
	        $("#getResult").append("<br>load success!<br>");
	        $("#getResult").append(temp);
	      },
	      error: function(res) {}
	    });
	  });

	$(".insertMaker").on("click", function() {
		container = $("#insertVal").val();
	    console.log("function activated - insert : ", container);
		if (container != undefined){
			container = container;
		}
		else {
			container = "blank";
		}
	    $.ajax({
	      type: "POST",
	      url: `/api/mytest/add`,
	      data: {
			name : container
	      },
	      success: function(res) {
	        console.log(res)
	        temp = JSON.stringify(res);
	        $("#getResult").append("<br>data added!<br>");
	        $("#getResult").append(temp);
	      },
	      error: function(res) {}
	    });
	  });
});