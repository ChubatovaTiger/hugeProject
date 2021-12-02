package subProj_1149

import subProj_1149.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1149")
    name = "subProj 1149"

    buildType(subProj_bt_1149_0)
    buildType(subProj_bt_1149_3)
    buildType(subProj_bt_1149_4)
    buildType(subProj_bt_1149_1)
    buildType(subProj_bt_1149_2)
    buildType(subProj_bt_1149_5)
})
