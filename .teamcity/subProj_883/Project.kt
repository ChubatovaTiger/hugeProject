package subProj_883

import subProj_883.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_883")
    name = "subProj 883"

    buildType(subProj_bt_883_0)
    buildType(subProj_bt_883_5)
    buildType(subProj_bt_883_1)
    buildType(subProj_bt_883_2)
    buildType(subProj_bt_883_3)
    buildType(subProj_bt_883_4)
})
