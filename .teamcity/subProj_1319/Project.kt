package subProj_1319

import subProj_1319.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1319")
    name = "subProj 1319"

    buildType(subProj_bt_1319_5)
    buildType(subProj_bt_1319_4)
    buildType(subProj_bt_1319_1)
    buildType(subProj_bt_1319_0)
    buildType(subProj_bt_1319_3)
    buildType(subProj_bt_1319_2)
})
