package subProj_1990

import subProj_1990.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1990")
    name = "subProj 1990"

    buildType(subProj_bt_1990_4)
    buildType(subProj_bt_1990_3)
    buildType(subProj_bt_1990_5)
    buildType(subProj_bt_1990_0)
    buildType(subProj_bt_1990_2)
    buildType(subProj_bt_1990_1)
})
