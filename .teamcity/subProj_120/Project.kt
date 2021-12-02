package subProj_120

import subProj_120.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_120")
    name = "subProj 120"

    buildType(subProj_bt_120_5)
    buildType(subProj_bt_120_3)
    buildType(subProj_bt_120_4)
    buildType(subProj_bt_120_1)
    buildType(subProj_bt_120_2)
    buildType(subProj_bt_120_0)
})
