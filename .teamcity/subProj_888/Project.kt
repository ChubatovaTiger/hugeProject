package subProj_888

import subProj_888.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_888")
    name = "subProj 888"

    buildType(subProj_bt_888_4)
    buildType(subProj_bt_888_5)
    buildType(subProj_bt_888_0)
    buildType(subProj_bt_888_1)
    buildType(subProj_bt_888_2)
    buildType(subProj_bt_888_3)
})
