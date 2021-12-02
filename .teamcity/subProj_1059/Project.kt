package subProj_1059

import subProj_1059.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1059")
    name = "subProj 1059"

    buildType(subProj_bt_1059_4)
    buildType(subProj_bt_1059_3)
    buildType(subProj_bt_1059_5)
    buildType(subProj_bt_1059_0)
    buildType(subProj_bt_1059_2)
    buildType(subProj_bt_1059_1)
})
