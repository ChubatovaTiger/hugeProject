package subProj_1545

import subProj_1545.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1545")
    name = "subProj 1545"

    buildType(subProj_bt_1545_5)
    buildType(subProj_bt_1545_0)
    buildType(subProj_bt_1545_4)
    buildType(subProj_bt_1545_3)
    buildType(subProj_bt_1545_2)
    buildType(subProj_bt_1545_1)
})
