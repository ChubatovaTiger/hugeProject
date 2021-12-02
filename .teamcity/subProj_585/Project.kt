package subProj_585

import subProj_585.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_585")
    name = "subProj 585"

    buildType(subProj_bt_585_4)
    buildType(subProj_bt_585_5)
    buildType(subProj_bt_585_2)
    buildType(subProj_bt_585_3)
    buildType(subProj_bt_585_0)
    buildType(subProj_bt_585_1)
})
