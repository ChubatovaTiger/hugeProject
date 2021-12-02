package subProj_356

import subProj_356.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_356")
    name = "subProj 356"

    buildType(subProj_bt_356_4)
    buildType(subProj_bt_356_5)
    buildType(subProj_bt_356_0)
    buildType(subProj_bt_356_1)
    buildType(subProj_bt_356_2)
    buildType(subProj_bt_356_3)
})
