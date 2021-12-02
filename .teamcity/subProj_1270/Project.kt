package subProj_1270

import subProj_1270.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1270")
    name = "subProj 1270"

    buildType(subProj_bt_1270_2)
    buildType(subProj_bt_1270_3)
    buildType(subProj_bt_1270_0)
    buildType(subProj_bt_1270_1)
    buildType(subProj_bt_1270_4)
    buildType(subProj_bt_1270_5)
})
