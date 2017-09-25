一些问题：
1，开始说logback-classic架包找不到，在pom.xml中加入这个依赖。
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.1.7</version>
      <scope>test</scope>
    </dependency>

2，SpringApplication找不到的问题：
可能是pom.xml中父项目配置的版本号不对，原来是1.2.5，改成支持的版本
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.5.2.RELEASE</version>
    <relativePath/>
  </parent>

3，convert to facets 模式，出现错误：
java compiler level does not match the version of the installed java project facets
解决：
看工程目录.settings/org.eclipse.wst.common.project.facet.core.xml文件中是1.4，改成1.8就好了：
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <installed facet="java" version="1.8"/>
</faceted-project>

