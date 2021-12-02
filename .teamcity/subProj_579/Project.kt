package subProj_579

import subProj_579.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_579")
    name = "subProj 579"

    buildType(subProj_bt_579_0)
    buildType(subProj_bt_579_2)
    buildType(subProj_bt_579_1)
    buildType(subProj_bt_579_4)
    buildType(subProj_bt_579_3)
    buildType(subProj_bt_579_5)
})
