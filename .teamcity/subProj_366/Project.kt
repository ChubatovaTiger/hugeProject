package subProj_366

import subProj_366.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_366")
    name = "subProj 366"

    buildType(subProj_bt_366_5)
    buildType(subProj_bt_366_2)
    buildType(subProj_bt_366_1)
    buildType(subProj_bt_366_4)
    buildType(subProj_bt_366_3)
    buildType(subProj_bt_366_0)
})
