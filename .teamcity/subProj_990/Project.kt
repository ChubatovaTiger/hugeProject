package subProj_990

import subProj_990.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_990")
    name = "subProj 990"

    buildType(subProj_bt_990_2)
    buildType(subProj_bt_990_3)
    buildType(subProj_bt_990_0)
    buildType(subProj_bt_990_1)
    buildType(subProj_bt_990_4)
    buildType(subProj_bt_990_5)
})
