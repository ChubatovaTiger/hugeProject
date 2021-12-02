package subProj_121

import subProj_121.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_121")
    name = "subProj 121"

    buildType(subProj_bt_121_4)
    buildType(subProj_bt_121_5)
    buildType(subProj_bt_121_2)
    buildType(subProj_bt_121_3)
    buildType(subProj_bt_121_0)
    buildType(subProj_bt_121_1)
})
