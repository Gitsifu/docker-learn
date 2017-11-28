# docker-learn
docker基础学习
- v1.0中Dockerfile文件在src/main/docker目录下
- v2.0中Dockerfile文件在src/main/resources目录下

主要在pom.xml中的修改。

# 跳坑：
配置docker，如下图：

![这是坑！！！](https://github.com/Gitsifu/docker-learn/tree/master/src/main/resources/static/3.png)

否则在执行`docker build`时出现如下bug
```
[ERROR] Failed to execute goal 
com.spotify:docker-maven-plugin:
0.4.14:build (default-cli) on project docker-learn: 
Exception caught: 
java.util.concurrent.ExecutionException: 
com.spotify.docker.client.shaded.javax.ws.rs .ProcessingException: 
org.apache.http.conn.HttpHostConnectException: 
Connect to localhost:2375 
[localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: 
Connection refused: connect

```

# docker配置daocloud的国内加速器

daocloud官网：[https://daocloud.io](https://daocloud.io)

点击图中标识

![图一](https://github.com/Gitsifu/docker-learn/tree/master/src/main/resources/static/1.png)

将图二的箭头的链接粘贴到图三中的箭头标记处

![图二](https://github.com/Gitsifu/docker-learn/tree/master/src/main/resources/static/2.png)

图三docker配置

![图三](https://github.com/Gitsifu/docker-learn/tree/master/src/main/resources/static/4.png)

源码中的static目录中的图片请忽视，即上面的图。