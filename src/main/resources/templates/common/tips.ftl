
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>{{ d.title }} - {{lay.base.name}}</title>
{{ include link }}
</head>
<body>

{{ include header }}

<div class="main">
	<div class="fly-panel">
	  <div class="fly-none">
	    <h2><i class="iconfont icon-tishilian"></i></h2>
	    <p>{{ d.msg||'' }}</p>
	  </div>
	</div>
</div>

{{ include footer }}

</body>
</html>