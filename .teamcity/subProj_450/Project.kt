package subProj_450

import subProj_450.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_450")
    name = "subProj 450"

    buildType(subProj_bt_450_5)
    buildType(subProj_bt_450_0)
    buildType(subProj_bt_450_3)
    buildType(subProj_bt_450_4)
    buildType(subProj_bt_450_1)
    buildType(subProj_bt_450_2)
})
