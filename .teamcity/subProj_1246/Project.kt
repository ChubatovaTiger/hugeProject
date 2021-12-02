package subProj_1246

import subProj_1246.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1246")
    name = "subProj 1246"

    buildType(subProj_bt_1246_0)
    buildType(subProj_bt_1246_1)
    buildType(subProj_bt_1246_2)
    buildType(subProj_bt_1246_3)
    buildType(subProj_bt_1246_4)
    buildType(subProj_bt_1246_5)
})
