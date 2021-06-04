nacos server 安装
64bit jdk1.8+ 以上
maven3.2.x+

vim /etc/profile
#jdk config
export JAVA_HOME=/usr/local/jdk/jdk1.8.0_131
export JRE_HOME=$JAVA_HOME/jre
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib:$JRE_HOME/lib
export PATH=$PATH:$JAVA_HOME/bin:$JRE_HOME/bin

source /etc/profile

java  -version

下载nacos
下载地址：https://github.com/alibaba/nacos/releases
目前下载2.0.1版本
unzip nacos-server-$version.zip 或者 tar -xvf nacos-server-$version.tar.gz
cd nacos/bin

启动
sh startup.sh -m standalone

nacos默认端口8848

启动后访问地址
http://ip:8848/nacos    登录账号nacos/nacos


验证：
通过curl工具来测试nacos的open api  需要安装 可以用postman来测试
发布配置地址
curl -X POST "http://ip:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test&content=HelloWorld"

获取配置
curl -X GET "http://ip:8848/nacos/v1/cs/configs?dataId=nacos.cfg.dataId&group=test"
#

mysql安装参考：https://blog.csdn.net/qq_37598011/article/details/93489404
tar -xvf mysql-5.7.26-linux-glibc2.12-x86_64.tar

外部mysql数据库支持
maysql 8以下  5.6.5+
新建nacos_config 数据库  初始化文件 ${nacoshome}/conf/nacos-mysql.sqlls

修改${naconshome}/conf/appliction.properties 文件 增加支持mysql数据源配置

spring.datasource.platform=mysql
db.num=1
db.url=jdbc:mysql://ip:3306/nacos_config?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
db.user=nacos_devtest
dv.password=123456

