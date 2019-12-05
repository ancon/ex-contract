# What is the repo for？

- 数据中心模块
- 这是一个基础模块，主要是让别人调用的，写数据和查数据。以后的升级改造难点都将在这里。
- 这个模块可以使用多个进程。
- 进行数据处理
- 该模块包含kafka，mybatis，elasticsearch。
- 当前使用，多库多表，接下来将使用分库分表。

## How to use ?
- 需要启动kafka服务；
- 需要启动mysql服务；
- 需要启动elasticsearch服务。