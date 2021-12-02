package subProj_472

import subProj_472.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_472")
    name = "subProj 472"

    buildType(subProj_bt_472_5)
    buildType(subProj_bt_472_0)
    buildType(subProj_bt_472_4)
    buildType(subProj_bt_472_3)
    buildType(subProj_bt_472_2)
    buildType(subProj_bt_472_1)
})
