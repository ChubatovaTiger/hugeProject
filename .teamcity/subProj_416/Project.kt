package subProj_416

import subProj_416.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_416")
    name = "subProj 416"

    buildType(subProj_bt_416_0)
    buildType(subProj_bt_416_1)
    buildType(subProj_bt_416_2)
    buildType(subProj_bt_416_3)
    buildType(subProj_bt_416_4)
    buildType(subProj_bt_416_5)
})
