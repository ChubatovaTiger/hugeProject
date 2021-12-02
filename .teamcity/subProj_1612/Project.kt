package subProj_1612

import subProj_1612.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1612")
    name = "subProj 1612"

    buildType(subProj_bt_1612_3)
    buildType(subProj_bt_1612_2)
    buildType(subProj_bt_1612_1)
    buildType(subProj_bt_1612_0)
    buildType(subProj_bt_1612_5)
    buildType(subProj_bt_1612_4)
})
