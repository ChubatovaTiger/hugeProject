package subProj_641

import subProj_641.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_641")
    name = "subProj 641"

    buildType(subProj_bt_641_0)
    buildType(subProj_bt_641_5)
    buildType(subProj_bt_641_3)
    buildType(subProj_bt_641_4)
    buildType(subProj_bt_641_1)
    buildType(subProj_bt_641_2)
})
