package subProj_801

import subProj_801.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_801")
    name = "subProj 801"

    buildType(subProj_bt_801_3)
    buildType(subProj_bt_801_4)
    buildType(subProj_bt_801_5)
    buildType(subProj_bt_801_0)
    buildType(subProj_bt_801_1)
    buildType(subProj_bt_801_2)
})
