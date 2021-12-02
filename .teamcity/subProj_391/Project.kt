package subProj_391

import subProj_391.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_391")
    name = "subProj 391"

    buildType(subProj_bt_391_0)
    buildType(subProj_bt_391_5)
    buildType(subProj_bt_391_3)
    buildType(subProj_bt_391_4)
    buildType(subProj_bt_391_1)
    buildType(subProj_bt_391_2)
})
