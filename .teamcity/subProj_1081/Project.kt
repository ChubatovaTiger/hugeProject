package subProj_1081

import subProj_1081.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1081")
    name = "subProj 1081"

    buildType(subProj_bt_1081_0)
    buildType(subProj_bt_1081_1)
    buildType(subProj_bt_1081_4)
    buildType(subProj_bt_1081_5)
    buildType(subProj_bt_1081_2)
    buildType(subProj_bt_1081_3)
})
