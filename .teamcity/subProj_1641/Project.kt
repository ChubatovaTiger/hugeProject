package subProj_1641

import subProj_1641.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1641")
    name = "subProj 1641"

    buildType(subProj_bt_1641_1)
    buildType(subProj_bt_1641_0)
    buildType(subProj_bt_1641_3)
    buildType(subProj_bt_1641_2)
    buildType(subProj_bt_1641_5)
    buildType(subProj_bt_1641_4)
})
