{{# var user = d.session.user || {} }}

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>我的消息 - {{lay.base.name}}</title>
<#include "common/link.ftl">
</head>
<body>

<#include "common/header.ftl">

<div class="main fly-user-main layui-clear">

<#include "common/user-nav.ftl">

  <div class="fly-panel fly-panel-user" pad20>
	  <div class="layui-tab layui-tab-brief" lay-filter="user" id="LAY_msg" style="margin-top: 15px;">
	    <button class="layui-btn layui-btn-danger layui-hide" id="LAY_delallmsg">清空全部消息</button>
	    <div id="LAY_minemsg" style="margin-top: 10px;"></div>
	  </div>
	</div>

</div>

<#include "common/footer.ftl">

</body>
</html>