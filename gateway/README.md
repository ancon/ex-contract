# What is the document for ?

- 这里是网关；
- 当前使用zuul的2.0版本；
- 可以换成springcloud的gateway。zuul经常跳票。

- 网关先别做太多功能，zuul网关+hystrix是可以，但没必要。先完成业务。zuul网关默认继承了hystrix和ribbon。
- 既然集成了hystrix，可以单独对某个服务id划分服务隔离。