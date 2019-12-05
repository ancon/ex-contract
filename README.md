# What is the repository for？

- The futures contract exchange for Cryptocurrency.

## How do I get set up? ##

- git clone.
- COPY THE example-application.propertities TO application.propertities.
- (每个项目都要看readme，有些项目需要启动相应的组件。)
- 启动center里面的eureka模块；
- 启动gateway里面的zuul模块；
- 启动common里面的datacenter模块；启动该模块，需要启动mysql，kafka，elasticsearch，redis。
- 启动apps里面是valid模块、match模块。

## What is the function of this repository?

- 这个框架的组件是比较老的，所以，之后会逐渐升级。比如eureka、zuul这些组件应该弃用。
- 该项目使用springcloud微服务器框架搭建的一个期货交易系统。
- eureka模块只是单纯的eureka-server而已，没有其他组件。
- zuul网关模块，zuul默认集成了hystrix和ribbon。所以，只要配置得当即可。springboot号称约定大于配置。
- datacenter是基础模块，数据中心。
- valid和match所使用的springcloud的组件是一样的，feign和hystrix，其实feign默认集成了ribbon，而hystrix也默认集成ribbon。


## About before

- 之前有过秒级十万级的数字货币交易平台，就看这次把不把类似的系统放到这上面来了。
- 之前的撮合系统，使用的4个内存队列，一个进队列，一个买队列、一个卖队列，另外一个是撮合成功队列。性能是相当的彪悍。
