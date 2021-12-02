package subProj_545

import subProj_545.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_545")
    name = "subProj 545"

    buildType(subProj_bt_545_0)
    buildType(subProj_bt_545_1)
    buildType(subProj_bt_545_2)
    buildType(subProj_bt_545_3)
    buildType(subProj_bt_545_4)
    buildType(subProj_bt_545_5)
})
