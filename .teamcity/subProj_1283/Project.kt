package subProj_1283

import subProj_1283.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1283")
    name = "subProj 1283"

    buildType(subProj_bt_1283_0)
    buildType(subProj_bt_1283_1)
    buildType(subProj_bt_1283_4)
    buildType(subProj_bt_1283_5)
    buildType(subProj_bt_1283_2)
    buildType(subProj_bt_1283_3)
})
