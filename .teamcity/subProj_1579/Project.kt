package subProj_1579

import subProj_1579.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1579")
    name = "subProj 1579"

    buildType(subProj_bt_1579_4)
    buildType(subProj_bt_1579_5)
    buildType(subProj_bt_1579_0)
    buildType(subProj_bt_1579_1)
    buildType(subProj_bt_1579_2)
    buildType(subProj_bt_1579_3)
})
