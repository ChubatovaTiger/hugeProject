package subProj_1472

import subProj_1472.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1472")
    name = "subProj 1472"

    buildType(subProj_bt_1472_2)
    buildType(subProj_bt_1472_3)
    buildType(subProj_bt_1472_0)
    buildType(subProj_bt_1472_1)
    buildType(subProj_bt_1472_4)
    buildType(subProj_bt_1472_5)
})
