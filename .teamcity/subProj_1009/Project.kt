package subProj_1009

import subProj_1009.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1009")
    name = "subProj 1009"

    buildType(subProj_bt_1009_1)
    buildType(subProj_bt_1009_0)
    buildType(subProj_bt_1009_5)
    buildType(subProj_bt_1009_4)
    buildType(subProj_bt_1009_3)
    buildType(subProj_bt_1009_2)
})
