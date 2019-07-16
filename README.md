# Test

### 项目开发说明

前端资源都放在web目录下面。index.html是页面首页，其他的可以建文件夹，也可以都写在web目录下面。前端人员自己定哦。
<br/>
后端的资源都放在src目录里面，一定要创建不同的包，使用面向对象的思想进行编程。

### 前端向后端测试的方法

写一个<a>标签，或者一个表单，连接的路径可以是 Test/TestDemo1 Test/TestDemo2 Test/TestDemo3

### 步骤：

1. 再本地重新pull upstream master；获取最新版本
2. 进行编码
3. git push之前的操作git add的时候，使用`git add <文件名>`，不要使用`git add .`。
4. git push之后，提交合并请求，合并成功之后咱们的项目就更新了，我会把最新版本的项目pull到我的服务器上面，进行重新部署，部署完毕之后，只需要输入`172.20.151.112:8066/Test+路径名`就可以访问到了，比如说web目录下面有一个test.html，就可以通过`172.20.151.112:8066/Test/test.html`进行访问
