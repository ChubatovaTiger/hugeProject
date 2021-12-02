package subProj_1004

import subProj_1004.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1004")
    name = "subProj 1004"

    buildType(subProj_bt_1004_1)
    buildType(subProj_bt_1004_2)
    buildType(subProj_bt_1004_0)
    buildType(subProj_bt_1004_5)
    buildType(subProj_bt_1004_3)
    buildType(subProj_bt_1004_4)
})
