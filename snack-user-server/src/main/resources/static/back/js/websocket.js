function openWebSocket(usid){
	var socket;
	if(typeof(WebSocket) == undefined){
		alert("对不起，您的浏览器不支持Websocket通信..");
		return;
	}
	socket = new WebSocket("ws://127.0.0.1:8888/websocket/"+usid);
	
	socket.onopen = function(){
		console.info("socket已连接...");
	}
	
	socket.onclose = function(){
		console.info("socket已关闭...");
	}
	socket.error = function(){
		console.info("socket服务器访问失败...");
	}
	
	socket.onmessage = function(msg){
		console.info(msg);
		if(msg.data == "101"){//挤退信息
			alert("对不起，您已经在其他地方登录。。。");
			location.href="../loginout";
		}
	}
}