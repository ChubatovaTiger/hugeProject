package subProj_283

import subProj_283.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_283")
    name = "subProj 283"

    buildType(subProj_bt_283_5)
    buildType(subProj_bt_283_4)
    buildType(subProj_bt_283_3)
    buildType(subProj_bt_283_2)
    buildType(subProj_bt_283_1)
    buildType(subProj_bt_283_0)
})
