package subProj_1907

import subProj_1907.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1907")
    name = "subProj 1907"

    buildType(subProj_bt_1907_4)
    buildType(subProj_bt_1907_3)
    buildType(subProj_bt_1907_5)
    buildType(subProj_bt_1907_0)
    buildType(subProj_bt_1907_2)
    buildType(subProj_bt_1907_1)
})
