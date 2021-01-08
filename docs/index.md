---
layout: default
---

1、为了能快速开发微信公众号，将公众号一些常用接口封装为一个springboot starter。

2、稍作调整也可以在普通的spring项目使用。但是不如在spring-boot中来的痛快。

> 项目还在改进当中，不建议引用。。。。。

# 使用

#### 引入

```
# Apache Maven
<dependency>
  <groupId>com.github.coder-Ah-fei</groupId>
  <artifactId>wechat-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>

# Gradle Groovy DSL
implementation 'com.github.coder-Ah-fei:wechat-spring-boot-starter:0.0.1'
```

#### 配置

```
# application.properties
spring.xia.wechat.config.appid=公众号appid
spring.xia.wechat.config.appsecret=公众号appsecret
```

#### import

```aidl
import com.github.coderahfei.wechatspringbootstarter.WeChatUtils;
```

#### 使用

| 方法        | 参数          | 返回 | 说明 |
|:-------------|:------------------|:------|:------|
| getWebAccessToken(String code)                            | code:微信返回的code                                                             | AuthToken:微信返回值的封装     |根据code获取网页授权的access_token|
| getUserInfoByWechatLogin(AuthToken accessToken)           | AuthToken:getWebAccessToken的返回值                                            |UserInfoDto:用户信息           |根据微信网页授权的access_token获取用户的基本信息|
| getBaseAccessToken()                                      |                                                                               |AuthToken:微信返回值的封装      |基础支持中的access_token|
| findWechatUserList(String openid, String accessToken)     | openid:第一个拉取的OPENID，不填默认从头开始拉取 accessToken:基础支持中的access_token  |FindUserListDto:...          |从微信获取用户列表 每次请求最多获取10000条数据|

> 未完待续....
