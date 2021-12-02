package subProj_1030

import subProj_1030.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1030")
    name = "subProj 1030"

    buildType(subProj_bt_1030_2)
    buildType(subProj_bt_1030_3)
    buildType(subProj_bt_1030_4)
    buildType(subProj_bt_1030_5)
    buildType(subProj_bt_1030_0)
    buildType(subProj_bt_1030_1)
})
