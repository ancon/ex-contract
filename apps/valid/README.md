# What is the repo for？

- API的验证
- 这个模块可以使用多个进程。在这个之前加一个路由网关即可做到。

## springcloud集成的模块

- 1.feign远程调用，feign默认集成ribbon，所以在配置里可以写上相应的bean；
- 2.hystrix，服务熔断、降级；服务隔离也可以设置一下。hystrix也默认集成ribbon。
