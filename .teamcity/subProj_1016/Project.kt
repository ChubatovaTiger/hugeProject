package subProj_1016

import subProj_1016.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1016")
    name = "subProj 1016"

    buildType(subProj_bt_1016_1)
    buildType(subProj_bt_1016_0)
    buildType(subProj_bt_1016_5)
    buildType(subProj_bt_1016_4)
    buildType(subProj_bt_1016_3)
    buildType(subProj_bt_1016_2)
})
