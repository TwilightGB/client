function scservice() {
    var value = $("#id1").val();
	$.ajax({
		cache : true,
		type : "GET",
		url : "/hello",
		// dataType:"json",
		data : {"name":value},
		async : false,
		error : function(request) {
			alert("Connection error");
		},
		success : function(data) {
			alert(data);
		}
	});

}
