package subProj_1120

import subProj_1120.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1120")
    name = "subProj 1120"

    buildType(subProj_bt_1120_5)
    buildType(subProj_bt_1120_4)
    buildType(subProj_bt_1120_1)
    buildType(subProj_bt_1120_0)
    buildType(subProj_bt_1120_3)
    buildType(subProj_bt_1120_2)
})
