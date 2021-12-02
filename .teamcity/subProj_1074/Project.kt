package subProj_1074

import subProj_1074.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1074")
    name = "subProj 1074"

    buildType(subProj_bt_1074_4)
    buildType(subProj_bt_1074_5)
    buildType(subProj_bt_1074_2)
    buildType(subProj_bt_1074_3)
    buildType(subProj_bt_1074_0)
    buildType(subProj_bt_1074_1)
})
