package subProj_1070

import subProj_1070.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1070")
    name = "subProj 1070"

    buildType(subProj_bt_1070_0)
    buildType(subProj_bt_1070_1)
    buildType(subProj_bt_1070_4)
    buildType(subProj_bt_1070_5)
    buildType(subProj_bt_1070_2)
    buildType(subProj_bt_1070_3)
})
