package subProj_612

import subProj_612.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_612")
    name = "subProj 612"

    buildType(subProj_bt_612_5)
    buildType(subProj_bt_612_1)
    buildType(subProj_bt_612_2)
    buildType(subProj_bt_612_3)
    buildType(subProj_bt_612_4)
    buildType(subProj_bt_612_0)
})
