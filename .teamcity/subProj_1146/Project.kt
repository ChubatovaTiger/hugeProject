package subProj_1146

import subProj_1146.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1146")
    name = "subProj 1146"

    buildType(subProj_bt_1146_2)
    buildType(subProj_bt_1146_3)
    buildType(subProj_bt_1146_0)
    buildType(subProj_bt_1146_1)
    buildType(subProj_bt_1146_4)
    buildType(subProj_bt_1146_5)
})
