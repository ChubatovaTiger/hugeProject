package subProj_372

import subProj_372.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_372")
    name = "subProj 372"

    buildType(subProj_bt_372_3)
    buildType(subProj_bt_372_2)
    buildType(subProj_bt_372_5)
    buildType(subProj_bt_372_4)
    buildType(subProj_bt_372_1)
    buildType(subProj_bt_372_0)
})
