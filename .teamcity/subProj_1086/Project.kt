package subProj_1086

import subProj_1086.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1086")
    name = "subProj 1086"

    buildType(subProj_bt_1086_5)
    buildType(subProj_bt_1086_3)
    buildType(subProj_bt_1086_4)
    buildType(subProj_bt_1086_1)
    buildType(subProj_bt_1086_2)
    buildType(subProj_bt_1086_0)
})
