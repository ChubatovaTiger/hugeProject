package subProj_1079

import subProj_1079.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1079")
    name = "subProj 1079"

    buildType(subProj_bt_1079_5)
    buildType(subProj_bt_1079_3)
    buildType(subProj_bt_1079_4)
    buildType(subProj_bt_1079_1)
    buildType(subProj_bt_1079_2)
    buildType(subProj_bt_1079_0)
})
