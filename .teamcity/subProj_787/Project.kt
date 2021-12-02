package subProj_787

import subProj_787.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_787")
    name = "subProj 787"

    buildType(subProj_bt_787_4)
    buildType(subProj_bt_787_5)
    buildType(subProj_bt_787_2)
    buildType(subProj_bt_787_3)
    buildType(subProj_bt_787_0)
    buildType(subProj_bt_787_1)
})
