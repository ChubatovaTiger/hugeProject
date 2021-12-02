package subProj_670

import subProj_670.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_670")
    name = "subProj 670"

    buildType(subProj_bt_670_4)
    buildType(subProj_bt_670_3)
    buildType(subProj_bt_670_2)
    buildType(subProj_bt_670_1)
    buildType(subProj_bt_670_0)
    buildType(subProj_bt_670_5)
})
