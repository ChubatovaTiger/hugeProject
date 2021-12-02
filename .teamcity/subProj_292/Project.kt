package subProj_292

import subProj_292.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_292")
    name = "subProj 292"

    buildType(subProj_bt_292_1)
    buildType(subProj_bt_292_2)
    buildType(subProj_bt_292_3)
    buildType(subProj_bt_292_4)
    buildType(subProj_bt_292_5)
    buildType(subProj_bt_292_0)
})
