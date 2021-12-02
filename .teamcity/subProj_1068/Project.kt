package subProj_1068

import subProj_1068.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1068")
    name = "subProj 1068"

    buildType(subProj_bt_1068_5)
    buildType(subProj_bt_1068_2)
    buildType(subProj_bt_1068_1)
    buildType(subProj_bt_1068_4)
    buildType(subProj_bt_1068_3)
    buildType(subProj_bt_1068_0)
})
