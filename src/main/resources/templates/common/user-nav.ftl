<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
  <li class="layui-nav-item">
    <a href="/u/{{168*user.id}}/">
      <i class="layui-icon">&#xe609;</i>
      我的主页
    </a>
  </li>
  <li class="layui-nav-item {{ d.pageType === 'user' ? 'layui-this' : '' }}">
    <a href="/user/">
      <i class="layui-icon">&#xe612;</i>
      用户中心
    </a>
  </li>
  <li class="layui-nav-item {{ d.pageType === 'user/set' ? 'layui-this' : '' }}">
    <a href="/user/set/">
      <i class="layui-icon">&#xe620;</i>
      基本设置
    </a>
  </li>
  <li class="layui-nav-item {{ d.pageType === 'user/message' ? 'layui-this' : '' }}">
    <a href="/user/message/">
      <i class="layui-icon">&#xe611;</i>
      我的消息
    </a>
  </li>
  <li class="layui-nav-item {{ d.pageType === 'auth/get' ? 'layui-this' : '' }}">
    <a href="/auth/get/">
      <i class="layui-icon">&#xe61e;</i>
      产品授权
    </a>
  </li>
</ul>

<div class="site-tree-mobile layui-hide">
  <i class="layui-icon">&#xe602;</i>
</div>
<div class="site-mobile-shade"></div>