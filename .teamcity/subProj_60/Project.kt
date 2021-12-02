package subProj_60

import subProj_60.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_60")
    name = "subProj 60"

    buildType(subProj_bt_60_1)
    buildType(subProj_bt_60_0)
    buildType(subProj_bt_60_3)
    buildType(subProj_bt_60_2)
    buildType(subProj_bt_60_5)
    buildType(subProj_bt_60_4)
})
