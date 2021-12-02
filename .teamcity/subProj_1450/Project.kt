package subProj_1450

import subProj_1450.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1450")
    name = "subProj 1450"

    buildType(subProj_bt_1450_1)
    buildType(subProj_bt_1450_0)
    buildType(subProj_bt_1450_3)
    buildType(subProj_bt_1450_2)
    buildType(subProj_bt_1450_5)
    buildType(subProj_bt_1450_4)
})
